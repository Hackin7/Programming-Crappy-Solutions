# Level 5B

![](Pasted%20image%2020220909213125.png)

# Solution
## Analysing Source Code

Looking at the files, it appears that from `/distrib/app/report.js`, there is a puppeteer web bot

```js
const puppeteer = require('puppeteer')

const LOGIN_URL = `${process.env.BASE_URL}/login`
const TOKEN_URL = `${process.env.BASE_URL}/token`

let browser = null

const visit = async (url) => {
    const ctx = await browser.createIncognitoBrowserContext()
    const page = await ctx.newPage()

    await page.goto(LOGIN_URL, { timeout: 5000, waitUntil: 'networkidle2' })
    await page.waitForSelector('form')
    await page.type('input[name=email]', process.env.EMAIL)
    await page.type('input[name=password]', process.env.PASSWORD)
    await page.click('button[type="submit"]')
    await page.waitForTimeout(1000)

    try {
        await page.goto(url, { timeout: 5000, waitUntil: 'networkidle2' })
        await page.waitForTimeout(1000)
    } finally {
        await page.close()
        await ctx.close()
    }
}

const doReportHandler = async (req, res) => {

    if (!browser) {
        console.log('[INFO] Starting browser')
        browser = await puppeteer.launch({
            headless: false,
            args: [
                "--no-sandbox",
                "--disable-background-networking",
                "--disk-cache-dir=/dev/null",
                "--disable-default-apps",
                "--disable-extensions",
                "--disable-desktop-notifications",
                "--disable-gpu",
                "--disable-sync",
                "--disable-translate",
                "--disable-dev-shm-usage",
                "--hide-scrollbars",
                "--metrics-recording-only",
                "--mute-audio",
                "--no-first-run",
                "--safebrowsing-disable-auto-update",
                "--window-size=1440,900",
            ]
        })
    }

    const url = req.body.url
    if (
        url === undefined ||
        (!url.startsWith('http://') && !url.startsWith('https://'))
    ) {
        return res.status(400).send({ error: 'Invalid URL' })
    }

    try {
        console.log(`[*] Visiting ${url}`)
        await visit(url)
        console.log(`[*] Done visiting ${url}`)
        return res.sendStatus(200)
    } catch (e) {
        console.error(`[-] Error visiting ${url}: ${e.message}`)
        return res.status(400).send({ error: e.message })
    }
}

module.exports = { doReportHandler }
```

It just visits the web page. Hmm, sounds a lot like an XSS leak cookie attack


The Server code in `/distrib/app/main.js` doesn't look like anything much too

```js
const crypto = require('crypto')
const util = require('util')

const pug = require('pug')
const mysql = require('mysql')

const express = require('express')
const session = require('express-session')
const RedisStore = require("connect-redis")(session)

const { createClient } = require("redis")
const redisClient = createClient({ 
    legacyMode: true, 
    url: 'redis://redis:6379'
})
redisClient.connect().catch(console.error)

const { doReportHandler } = require('./report.js')

const db = mysql.createConnection({
    host     : 'db',
    user     : 'web',
    password : process.env.MYSQL_PASSWORD,
    database : 'palindrome'
});
const query = util.promisify(db.query).bind(db);

const app = express()
const port = 8000

app.set('case sensitive routing', true)

app.use('/static', express.static('static'))
app.use(express.json())

app.use(session({
    secret: crypto.randomBytes(32).toString('hex'),
    resave: false,
    saveUninitialized: true,
    cookie: { maxAge: 1000 * 60 * 60 * 24 },
    store: new RedisStore({ client: redisClient })
}))

app.use((req, res, next) => {
    res.setHeader(
        'Content-Security-Policy',
        "default-src 'self'; img-src data: *; object-src 'none'; base-uri 'none'; frame-ancestors 'none'"
    )
    res.setHeader(
        'Cross-Origin-Opener-Policy',
        'same-origin'
    )
    next()
})

const authenticationMiddleware = async (req, res, next) => {
    if (req.session.userId) {
        if (req.ip === '127.0.0.1')
            req.session.token = process.env.ADMIN_TOKEN 

        next()
    }
    else 
        return res.redirect('/login')
}

const getLoginHandler = async (req, res) => {
    return res.send(pug.renderFile('templates/login.pug'))
}

const postLoginHandler = async (req, res) => {
    const { email, password } = req.body
    if (!email || !password)
        return res.status(400).send({ message: 'Missing email or password' })

    const rows = await query(`SELECT * FROM users WHERE email = ? AND password = ?`, [email, password])
    if (rows.length === 0)
        return res.status(401).send({ message: 'Invalid email or password' })

    req.session.userId = rows[0].id
    return res.status(200).send({ message: "Success" })
}

const indexHandler = async (req, res) => {
    return res.send(pug.renderFile('templates/index.pug'))
}

const reportIssueHandler = async (req, res) => {
    return res.send(pug.renderFile('templates/report.pug'))
}

const forbiddenHandler = async (req, res) => {
    return res.status(403).send(pug.renderFile('templates/forbidden.pug'))
}

const getTokenHandler = async (req, res) => {
    return res.send(pug.renderFile('templates/token.pug', { 
        token: req.session.token,
        username: req.session.username,
    }))
}

const postTokenHandler = async (req, res) => {

    const username = req.body.username

    if (!username)
        return res.status(400).send({ message: 'Missing username' })

    if (typeof username !== 'string')
        return res.status(400).send({ message: 'Invalid username' })

    let message

    if (!req.session.token) {

        const alphabet = 'abcdefghijklmnopqrstuvwxyz0123456789'
        let tokenChars = []

        for (let i = 0; i < 10; i++ )
            tokenChars.push(alphabet.charAt(Math.floor(Math.random() * alphabet.length)))
        
        const token = 'TISC{' + tokenChars.join(':') + '}'

        try {
            const result = await query('INSERT INTO tokens (token, username) VALUES (?, ?)', [token, username])
        }
        catch (e) {
           return res.status(400).send({ message: e.message })
        }
        
        req.session.token = token
        req.session.username = username

        message = 'Token generated.'
    }
    else {
        message = `Sorry ${username}, you already have a token.`
    }

    return res.send({ token: req.session.token, username: req.session.username, message: message })
}

const tokenVerifyHandler = async (req, res) => {
    const token = req.query.token
    if (!token)
        return res.send(pug.renderFile('templates/verify.pug'))

    if (typeof token !== 'string')
    return res.status(400).send(pug.renderFile('templates/verify.pug', { error: 'Invalid token' }))
    
    const result = await query('SELECT * FROM tokens WHERE token = ?', [token])

    if (result.length == 0)
        return res.status(404).send(pug.renderFile('templates/verify.pug', { error: 'Token not found' }))

    const username = result[0].username
    return res.send(pug.renderFile('templates/verify.pug', { username: username, token: req.session.token }))
}

app.get     ('/login', getLoginHandler)
app.post    ('/login', postLoginHandler)

app.get     ('/index', authenticationMiddleware, indexHandler)
app.get     ('/token', authenticationMiddleware, getTokenHandler)
app.post    ('/token', authenticationMiddleware, postTokenHandler)
app.get     ('/verify', authenticationMiddleware, tokenVerifyHandler)
app.get     ('/report-issue', authenticationMiddleware, reportIssueHandler)
app.post    ('/do-report', authenticationMiddleware, doReportHandler)
app.all     ('/forbidden', authenticationMiddleware, forbiddenHandler)

app.listen(port, '0.0.0.0', async () => {
    console.log(`[*] Listening on port ${port}`)
})
```


The middleware for the headers look interesting. Wonder if there's anything vulnerable here

```js
app.use((req, res, next) => {
    res.setHeader(
        'Content-Security-Policy',
        "default-src 'self'; img-src data: *; object-src 'none'; base-uri 'none'; frame-ancestors 'none'"
    )
    res.setHeader(
        'Cross-Origin-Opener-Policy',
        'same-origin'
    )
    next()
})
```

https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Cross-Origin-Opener-Policy

https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy/default-src



### SQL
SQL initialisation file doesn't look promising too

`/distrib/mysql-init/init.sql`

```sql
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'REDACTED';
CREATE USER 'web'@'%' IDENTIFIED WITH mysql_native_password BY 'REDACTED';

USE palindrome;

CREATE TABLE `users` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `email` varchar(255) NOT NULL,
    `password` varchar(255) NOT NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `users` (`email`, `password`) VALUES ("REDACTED@REDACTED", "REDACTED");

CREATE TABLE `tokens` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `username` varchar(255) NOT NULL,
    `token` varchar(255) NOT NULL,
    PRIMARY KEY (`id`)
);

GRANT INSERT, SELECT ON palindrome.tokens TO 'web'@'%'; 
GRANT SELECT ON palindrome.users TO 'web'@'%';
FLUSH PRIVILEGES;

```

The proxy looks promising though

https://github.com/Social-Engineering-Experts/SEETF-2022-Public/blob/main/web/flagportal/solve.md
https://ctftime.org/writeup/34157

## Things to do
1. Bypass login somehow
2. Use SSRF & maybe XSS to leak admin token

express-session is latest version, unlikely to have vuln
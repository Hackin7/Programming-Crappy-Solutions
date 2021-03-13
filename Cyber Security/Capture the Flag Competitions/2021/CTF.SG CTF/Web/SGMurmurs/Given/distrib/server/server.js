'use strict';

const express = require('express');
const puppeteer = require('puppeteer');
const bodyParser = require('body-parser');
const cookieParser = require("cookie-parser");
const cookieSession = require('cookie-session');
const crypto = require('crypto');
const path = require('path')
const process = require('process')
const { v4: uuidv4 } = require('uuid');

// Constants
const FLAG = process.env.FLAG;
const PORT = 8080;
const HOST = '0.0.0.0';
const PORT_FLAG = 12345;
const HOST_FLAG = '127.0.0.1';

// App
const app = express();
const app_flag = express();

// mapping of UUIDv4 to post
var DATABASE = {}

function deleteDB() {
    DATABASE = {}
}

// delete the database every 5 minutes
setInterval(deleteDB, 300000);

/** SGMURMUR SERVER **/

app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static('public/assets'));
app.use(cookieSession({
    name: 'session',
    keys: [crypto.randomBytes(64).toString('hex')]
}))
app.use(cookieParser());


app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, '/public/index.html'));
})

app.post('/submit', (req, res) => {
    if (req.body && req.body.confession) {
        let uuid  = uuidv4();
        let confession = req.body.confession;
        DATABASE[uuid] = {
            uuid: uuid,
            confession: confession,
            deleted: false
        }
        req.session.uuid = uuid;
        res.redirect('/viewpage')
    } else {
        res.status(500).send('Submission failed');
    }
})

app.get('/viewpage', (req, res) => {
    res.sendFile(path.join(__dirname, '/public/view.html'));
})

app.get('/view', (req, res) => {
    if (req.session && req.session.uuid && DATABASE[req.session.uuid]) {
        let entry = DATABASE[req.session.uuid];
        if (entry.deleted) {
            entry.confession = FLAG;
        }
        res.json(entry)
    } else {
        res.json({
            uuid: "INVALID",
            confession: "CONFESSION NOT FOUND",
            deleted: false
        })
    }
})

app.get('/report', (req, res) => {
    if (req.session && req.session.uuid) {
        // make the request
        const cookies = [];

        for (let [key, value] of Object.entries(req.cookies)) {
            cookies.push({
                'name': key,
                'value': value,
                'domain': `127.0.0.1:${PORT}`,
                'path': '/'
            })
        }
            (async () => {
                const browser = await puppeteer.launch({
                    executablePath: "google-chrome-stable",
                    args: ['--no-sandbox', '--disable-setuid-sandbox']
                });
                try {
                    const page = await browser.newPage();
                    await page.setCookie(...cookies);

                    await page.goto(`http://127.0.0.1:${PORT}/viewpage`, {
                        waitUntil: 'networkidle2'
                    });
                } catch (err) {
                    console.log(err)
                } finally {
                    await browser.close();
                }
            })().then(() => {
                res.end('Done')
            })
    } else {
        res.end('Invalid session.');
    }

});


app.listen(PORT, HOST);
console.log(`Running on http://${HOST}:${PORT}`);

/** ADMIN SERVER **/

app_flag.use(bodyParser.urlencoded({ extended: true }));

// Use CORS to prevent CSRF
app_flag.use((req, res, next) => {
    res.append('Access-Control-Allow-Origin', ['*']);
    // we don't allow POST 
    res.append('Access-Control-Allow-Methods', 'GET, OPTIONS');
    res.append('Access-Control-Allow-Headers', 'X-NO-POST');
    next();
});

app_flag.get('/', (req, res) => {
    res.end('This is the admin page, you should not be here...');
})

app_flag.post('/delete', (req, res) => {
    // force a preflighted fetch using custom header so Access-Control-Allow-Methods is enforced
    if (req.header('X-NO-POST') !== 'true') {
        res.status(500).send('Not allowed, very illegal, calling polis');
    } else {
        let uuid = req.body.uuid;
        if (uuid in DATABASE) {
            let entry = DATABASE[uuid];
            entry.deleted = true;
            res.end('Deleted.')
        } else {
            res.status(404).send('Entry not found.')
        }
    }
});

app_flag.listen(PORT_FLAG, "0.0.0.0");
console.log(`Admin page running on http://${HOST_FLAG}:${PORT_FLAG}`);
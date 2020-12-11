# Logged In

965, WEB, 15 SOLVES

### Description

It looks like COViD's mobile application is connecting to this API! Fortunately, our agents stole part of the source code. Can you find a way to log in?

[API Server](http://yhi8bpzolrog3yw17fe0wlwrnwllnhic.alttablabs.sg:41061/)

ZIP File Password: web-challenge-6

Note: Wondering what the second flag is about? Maybe check for a MOBILE Network?

This challenge:
- Unlocks other challenge(s)
- Is eligible for Awesome Write-ups Award

## Solution

Firstly I analysed the code `app.js`. The important things to take note were that it used a router
```
app.use('/api', apiRouter);
```

I then looked at `routes/api.js`
```
router.get('/', function (req, res, next) {
  res.render('index', { title: 'Express' });
});

router.post('/login', loginValidator, sendValidationErrors, localAuthenticator, function (req, res) {
  res.json({ "flagOne": process.env.FLAG_ONE, "encryptedFlagTwo": encryptFlag(process.env.FLAG_TWO) })
});

router.get('/user/:userId', async function (req, res) {
  const user = await User.findByPk(req.params.userId, { "attributes": ["username"] });
  res.json(user)
});
```

I randomly decided to look at `seeders.js/20201023021100-user.js`. You can identify some user accounts. Accessing the route `/user/:userId` confirms at the accounrs are indeed these ones

```
'use strict';
const bcrypt = require('bcryptjs');

var generatePassword = require('../helpers/generatePassword');

module.exports = {
  up: async (queryInterface, Sequelize) => {
    await queryInterface.bulkInsert('Users', [{
      username: 'bob_minion',
      password: bcrypt.hashSync(generatePassword(32), 10),
      createdAt: new Date(),
      updatedAt: new Date()
    }, {
      username: 'kevin_minion',
      password: bcrypt.hashSync(generatePassword(32), 10),
      createdAt: new Date(),
      updatedAt: new Date()
    }, {
      username: 'stuart_minion',
      password: bcrypt.hashSync(generatePassword(32), 10),
      createdAt: new Date(),
      updatedAt: new Date()
    }, {
      username: 'gru_felonius',
      password: bcrypt.hashSync(generatePassword(32), 10),
      createdAt: new Date(),
      updatedAt: new Date()
    }], {});
  },

  down: async (queryInterface, Sequelize) => {
  }
};
```
![](Images/api_user_id.jpg)

I then made a python program in `solve.py` to interact with `/api/login` through a POST request. I tried logging in as `bob_minion`
I guessed that the password is empty, and surprisingly, I managed to get the flag

```
{"flagOne":"govtech-csg{m!sS1nG_cR3DeN+!@1s}","encryptedFlagTwo":"717f4cda287d40c47e7b50cb772b4def5a415387257510d1"}
```

### Why does it work?

I solved this challenge without understanding, but I want to know why this solution works.

Looking at the code in `routes/api.js`, you notice the middleware functions `loginValidator`, `sendValidationErrors`, `localAuthenticator`. To be able to access these routes we should have been able to bypass these middleware
```
var { loginValidator, sendValidationErrors } = require('../middlewares/validators');
var { localAuthenticator } = require('../middlewares/authenticators');
.
.
.
router.post('/login', loginValidator, sendValidationErrors, localAuthenticator, function (req, res) {
  res.json({ "flagOne": process.env.FLAG_ONE, "encryptedFlagTwo": encryptFlag(process.env.FLAG_TWO) })
});
```

Checking `middlewares/validators.js` reveals something mroe interesting. On doing research on `express-validator`, it looks like `loginValidator` checks if the `username` and `password` fields exist, while `sendValidationErrors` returns an error when the fields are exist.
```
var { check, validationResult } = require('express-validator');

const loginValidator = [
  check('username').exists(),
  check('password').exists()
]

function sendValidationErrors(req, res, next) {
  const errors = validationResult(req);
  if (!errors.isEmpty()) {
    return res.status(400).json({ error: `Invalid parameters: ${errors.array().map(error => error.param).join(', ')}` });
  }
  next()
}

module.exports = {
  loginValidator,
  sendValidationErrors,
}
```

Checking `middlewares/authenticators.js`, the function `localAuthenticator` uses the NodeJS authentication library `passport`. Maybe there's an error here but I'm not sure. It returns an error when the password and username are incorrect.
```
var passport = require('passport')

function localAuthenticator(req, res, next) {
    passport.authenticate('local', { session: false }, function (err, user, info) {
        if (err) {
            return res.status(401).json({
                "error": err.message
            });
        }
        next();
    })(req, res, next)
}

module.exports = {
    localAuthenticator,
}
```

Maybe the reason why putting empty strings works is because the fields are technically in the payload, to bypass `loginValidator`, `sendValidationErrors`. However, with some being empty strings, it bypasses `localAuthenticator`

I researched on `passport`, checking http://www.passportjs.org/packages/passport-local/. Checking `app.js` again, the local strategy is in `helpers/initLocalStrategy.js`
```
var passport = require('passport')
    , LocalStrategy = require('passport-local').Strategy;
const bcrypt = require('bcryptjs');
var { User } = require('../models')

module.exports = function () {
    passport.serializeUser(function (user, done) {
        done(null, user);
    });

    passport.deserializeUser(function (user, done) {
        done(null, user);
    });

    passport.use(new LocalStrategy(
        async function (username, password, done) {
            const user = await User.findOne({ where: { username } });
            if (user !== null && bcrypt.compareSync(password, user.password)) {
                if (user.username === 'gru_felonius' && bcrypt.compareSync(password, user.password)) {
                    return done(null, user);
                }
                return done(new Error('Only Gru is allowed!'));
            }
            return done(new Error('Invalid credentials'));
        }
    ));
}
```

Ok after looking at the code, it looks like my payload works because it finds a user. I'm still not sure why it works, maybe it screws with the function because it is async, or maybe bcrypt screws up when comparing with an empty string.

In the end I didn't have time to complete this, but checking https://github.com/IRS-Cybersec/ctfdump/tree/stack-mitsuha/STACK%20the%20Flags%202020/Mitsuha/Web/2.%20Logged%20In may give a more in depth explanation.

After the challenge I also know that an empty username also works.

## Flag

`govtech-csg{m!sS1nG_cR3DeN+!@1s}"`

var express = require('express');
var router = express.Router();
var { loginValidator, sendValidationErrors } = require('../middlewares/validators');
var { localAuthenticator } = require('../middlewares/authenticators');
var { User } = require('../models')
var encryptFlag = require('../helpers/encryptFlag');

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


module.exports = router;

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

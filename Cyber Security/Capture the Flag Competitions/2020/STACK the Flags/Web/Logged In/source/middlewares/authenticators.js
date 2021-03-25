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

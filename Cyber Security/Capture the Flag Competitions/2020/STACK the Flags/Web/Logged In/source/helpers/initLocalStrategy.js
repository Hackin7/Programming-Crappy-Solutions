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
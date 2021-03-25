var createError = require('http-errors');
var express = require('express');
var path = require('path');
var cookieParser = require('cookie-parser');
var logger = require('morgan');
var passport = require('passport');

var apiRouter = require('./routes/api');
var initLocalStrategy = require('./helpers/initLocalStrategy')
var initDatabase = require('./helpers/initDatabase')

var app = express();

// view engine setup
app.set('views', path.join(__dirname, 'views'));

app.use(logger('dev'));
app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));
initLocalStrategy();
app.use(passport.initialize());
initDatabase();

app.use('/api', apiRouter);

app.use(function (req, res, next) {
  next(createError(404));
});

app.use(function (err, req, res, next) {
  res.sendStatus(err.status || 500);
});
// console.log(process.env)
module.exports = app;

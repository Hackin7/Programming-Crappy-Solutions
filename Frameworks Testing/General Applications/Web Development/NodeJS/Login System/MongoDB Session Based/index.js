var express = require('express');
var app = express();

var morgan = require('morgan');
// set morgan to log info about our requests for development use.
app.use(morgan('dev'));


app.get('/', function(req,res){
    res.redirect("/login_system");
    //res.send("Logged in. Go to /login_system/logout to logout");
});
app.use(express.static('public'));

var loginSystem = require('./login/login_server.js');
var login = loginSystem.router;
loginSystem.settings.MAIN_PAGE = "/";
loginSystem.setup(app);
app.use('/login_system', login);


const port = process.env.PORT || 8080;
app.listen(port,() => console.log(`Listening on ${ port }`));


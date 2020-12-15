var express = require('express');
var loginSystem = express.Router(); 
var path = require('path');
var bodyParser = require('body-parser');
var cookieParser = require('cookie-parser');
var session = require('express-session');

var htmlMessage = require('./htmlMessage.js');

var SETTINGS = {
	URL_PATH : "/login_system",
	MAIN_PAGE : "/login_system/"
}

var usersDB = require('./userdb.js');
var userdb = new usersDB(process.env.MONGODB_URL);

loginSystem.use('/static',express.static(path.join(__dirname, 'static')));






///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
function setupLogin(app){
	// initialize body-parser to parse incoming parameters requests to req.body
	app.use(bodyParser.urlencoded({ extended: true }));
	// initialize cookie-parser to allow us access the cookies stored in the browser. 
	app.use(cookieParser());
	// initialize express-session to allow us track the logged-in user across sessions.
	app.use(session({
		key: 'user_sid',
		secret: 'somerandonstuffs',
		resave: false,
		saveUninitialized: false,
		cookie: {
			httpOnly:false,
			expires: 600000
		}
	}));
	
	// This middleware will check if user's cookie is still saved in browser and user is not set, then automatically log the user out.
	// This usually hloginSystemens when you stop your express server after login, your cookie still remains saved in the browser.
	app.use((req, res, next) => {
		if (req.cookies.user_sid && !req.session.userId) {
			res.clearCookie('user_sid');        
		}
		next();
	});
}

var isLoggedIn = (req) => {
	return (req.session.userId && req.cookies.user_sid);
}
// middleware function to check for logged-in users
var loggedInAccess = (req, res, next) => {
    if (isLoggedIn(req)) { // logged in 
        next();
    } else {
        res.redirect(SETTINGS.URL_PATH+'/login');
    }    
};

var loggedOutAccess = (req, res, next) => {
    if (isLoggedIn(req)) { // logged in 
        res.redirect(SETTINGS.MAIN_PAGE);
    } else {
        next();
    }    
};
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////










// REST API Methods //////////////////////////////////////////////////
loginSystem.post('/get/user_details', (req, res)=>{
	userdb.getUser(req.session.userId)
		.then(user => {
			res.json({user:user});
		})
		.catch(error => {
			console.log(error)
			res.status(500).json({error:error.toString()});
		});
});

loginSystem.post('/update/user', (req, res)=>{
	console.log(req.body);
	let updateQuery = {username:req.body.username}
	userdb.updateUser(req.session.userId, updateQuery)
		.then(result => {
			//console.log(result);
			res.json({result:"Done"});
		})
		.catch(error => {
			console.log(error)
			res.status(500).json({result:error.toString()});
		});
});

loginSystem.post('/update/password', (req, res)=>{
	userdb.updatePassword(req.session.userId, req.body.oldPassword, req.body.newPassword)
		.then(result => {
			//console.log(result);
			res.json({result:"Done"});
		})
		.catch(error => {
			console.log(error)
			res.status(500).json({result:error.toString()});
		});
});

loginSystem.post('/delete/user', (req, res)=>{
	userdb.deleteUser(req.session.userId)
		.then(result => {
			//console.log(result);
			res.json({result:"Done"});
		})
		.catch(error => {
			console.log(error)
			res.status(500).json({result:error.toString()});
		});
});

loginSystem.route('/api/login').post(async (req, res) => {
	var username = req.body.username,
		password = req.body.password;
			
	userdb.loginUser(username, password)
		.then(function (user) {
			req.session.userId = user._id;
			res.json({result:"Done"});
		}).catch(error=>{
			console.log(error);
			res.status(500).json({result:error.toString()});
		});
});
loginSystem.route('/api/signup').post(async (req, res) => {
	userdb.addUser(req.body.username,req.body.password)
	.then(function (user) {
			req.session.userId = user._id;
			res.json({result:"Done"});
		}).catch(error=>{
			res.status(500).json({result:error.toString()});
		});
});
/////////////////////////////////////////////////////////////////////////////////////////














// route for Home-Page
loginSystem.get('/', loggedInAccess, (req, res) => {
	res.sendFile('./user_settings.html', {root: __dirname });
});

// route for user signup
loginSystem.route('/signup')
    .get(loggedOutAccess, (req, res) => {
		//signup
        res.sendFile('./sign_up.html', {root: __dirname });
    })
    .post(async (req, res) => {
        userdb.addUser(req.body.username,req.body.password)
		.then(user => {
			req.session.userId = user._id;
			res.redirect(SETTINGS.MAIN_PAGE);
		})
		.catch(error => {
			res.status(401).send(htmlMessage(error));
		});
    });


// route for user Login
loginSystem.route('/login')
    .get(loggedOutAccess, (req, res) => {
            res.sendFile('./login.html', {root: __dirname });
    })
    .post((req, res) => {
        var username = req.body.username,
            password = req.body.password;
			
        userdb.loginUser(username, password)
			.then(function (user) {
				req.session.userId = user._id;
				res.redirect(SETTINGS.MAIN_PAGE);
			}).catch(error=>{
				res.status(401).send(htmlMessage(error));
			});
    });

// route for user logout
loginSystem.get('/logout',loggedInAccess,(req, res) => {
	res.clearCookie('user_sid');
	res.redirect(SETTINGS.MAIN_PAGE);
});


// route for handling 404 requests(unavailable routes)
loginSystem.use(function (req, res, next) {
  res.status(404).send(htmlMessage("Sorry can't find that!"))
});
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




module.exports = {setup:setupLogin, router:loginSystem, settings:SETTINGS, isLoggedIn : isLoggedIn};
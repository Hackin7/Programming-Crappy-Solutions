var express = require('express');
var bcrypt = require('bcrypt');

class Users{
	constructor(url){
		this.MongoClient = require('mongodb').MongoClient;
		this.dbURL = url || "mongodb://localhost:27017/";
		this.dbName = "exam-snippets";
		this.collection = "users"
		
		console.log("Connecting to "+this.dbURL);
		let mgcl = this.MongoClient,  dbURL = this.dbURL, dbName = this.dbName,  collection=this.collection;
		// Creation of Database and Collection
		mgcl.connect(dbURL, function(err, db) {
		  if (err){throw err;}
		  console.log("Database created at "+ dbURL);
		  
		  var dbo = db.db(dbName);
		  dbo.createCollection(collection, function(err, res) {
			//if (err){throw err;}
			console.log("Collection created!");
			db.close();
		  });
		});
		
		this.users = [];
	}
	getUser(id){
		let mgcl = this.MongoClient, dbURL = this.dbURL, dbName = this.dbName,  collection=this.collection;
		let promise = new Promise(async function(resolve, reject) {
			mgcl.connect(dbURL, function(err, db) {
				if (err){reject(err);}
				  
				var dbo = db.db(dbName);
				dbo.collection(collection).findOne({_id:require('mongodb').ObjectID(id)}, function(err, result) {
					if (err) reject(err); //throw err;
					if (!result){
						reject("Could not retrieve user data");//new Error('Database Could not retrieve user'))
						//console.log(result);
					}else{
						result.password = null; // Remove password hash
						resolve(result)
					}
					db.close();
				});
			});
		
		});
		return promise;
	}
	
	updateUser(id, updateQuery){
		let mgcl = this.MongoClient, dbURL = this.dbURL, dbName = this.dbName,  collection=this.collection;
		let promise = new Promise(async function(resolve, reject) {
			mgcl.connect(dbURL, function(err, db) {
				if (err){reject(err);}
				  
				var dbo = db.db(dbName);
				// Check if had duplicate username
				if (updateQuery.username !=  null){
					dbo.collection(collection).find({username:updateQuery.username}).toArray(async function(err, results) {
						let hasIncludedItem = 0;
						if (results.length > hasIncludedItem){
							reject("Username Taken!/ No Change in Username");
						}else{
							dbo.collection(collection).updateOne({_id:require('mongodb').ObjectID(id)}, {$set:updateQuery}, function(err, result) {
								if (err) reject(err); //throw err;
								if (!result){
									reject("Could not change user data");//new Error('Database Could not retrieve user'))
									//console.log(result);
								}else{
									result.password = null; // Remove password hash
									resolve(result)
								}
								db.close();
							});
						}
						
					})
				}
			});
		
		});
		return promise;
	}
	updatePassword(id, oldPassword, newPassword){
		
		let mgcl = this.MongoClient, dbURL = this.dbURL, dbName = this.dbName,  collection=this.collection;
		let promise = new Promise(async function(resolve, reject) {
			// Basic Conditions
			if (newPassword.length < 0){
				reject("New Password given is too short (less than 5 characters)");
			}else{
				mgcl.connect(dbURL, function(err, db) {
					if (err){reject(err);}
					  
					var dbo = db.db(dbName);
					dbo.collection(collection).findOne({_id:require('mongodb').ObjectID(id)}, async function(err, userToCheck) {
						let passCheck = (await bcrypt.compare(oldPassword, userToCheck.password));
						if (!passCheck){
							reject("Old Password given is invalid");
						}else{
							let passHash = await bcrypt.hash(newPassword, 10);
							dbo.collection(collection).updateOne({_id:require('mongodb').ObjectID(id)}, {$set:{password:passHash}}, function(err, result) {
								if (err) reject(err); //throw err;
								if (!result){
									reject("Could not change password");//new Error('Database Could not retrieve user'))
									//console.log(result);
								}else{
									result.password = null; // Remove password hash
									resolve(result)
								}
								db.close();
							});
						}
						
					})
				});
			}
		});
		return promise;
	}
	
	deleteUser(id){
		let mgcl = this.MongoClient, dbURL = this.dbURL, dbName = this.dbName,  collection=this.collection;
		let promise = new Promise(async function(resolve, reject) {
			mgcl.connect(dbURL, function(err, db) {
				if (err){reject(err);}
				  
				var dbo = db.db(dbName);
				dbo.collection(collection).deleteOne({_id:require('mongodb').ObjectID(id)}, function(err, result) {
					if (err) reject(err); //throw err;
					if (!result){
						reject("Could not delete user data");
					}else{
						result.password = null; // Remove password hash
						resolve(result)
					}
					db.close();
				});
			});
		
		});
		return promise;
	}
	
	async loginUser(username, password){
		let mgcl = this.MongoClient, dbURL = this.dbURL, dbName = this.dbName,  collection=this.collection;
		let promise = new Promise(async function(resolve, reject) {
			mgcl.connect(dbURL, function(err, db) {
				if (err){reject(err);}
				  
				var dbo = db.db(dbName);
				dbo.collection(collection).find({username:String(username)}).toArray(async function(err, result) {
					if (err) reject(err); //throw err;
					let usersList = result;
					
					// bcrypt Matching ////////////////////////////
					let user = null;
					for (let i in usersList){
						let userToCheck = usersList[i];
						let passCheck = (await bcrypt.compare(password, userToCheck.password));
						if (username == userToCheck.username && passCheck){
							user = userToCheck;
						}
					}
					if (user != null){
						resolve(user);
					}else{
						reject(new Error("Username/ Password not valid")); 
					}
					////////////////////////////////////////
					db.close();
				});
			});
		
		});
		return promise;
	}
	
	addUser(username, password){
		let usersList = this.users;
		let mgcl = this.MongoClient,  dbURL = this.dbURL, dbName = this.dbName,  collection=this.collection;
		
		let promise = new Promise(async function(resolve, reject) {
			let passHash = await bcrypt.hash(password, 10);
			let user = {username:username, password: passHash};
			
			// Connect to Database
			mgcl.connect(dbURL, function(err, db) {
				if (err){reject(err);} //throw err;
				  
				var dbo = db.db(dbName);
				// Check if had username
				dbo.collection(collection).find({username:username}).toArray(async function(err, result) {
					//console.log(result);
					if (result.length>0){
						reject(new Error("Username Taken!"));
					}else{
						dbo.collection(collection).insertOne(user, function(err, res) {
							if (err) throw err;
							console.log("Added user ");//+JSON.stringify(user));
							db.close();
							resolve(user);
						});
					}
				})
				
			});

			
		});
		return promise;
	}
}

module.exports = Users;
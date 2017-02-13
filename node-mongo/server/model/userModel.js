
var mongodb = require('mongodb');
var MongoClient = mongodb.MongoClient;
var mongoUrl = 'mongodb://127.0.0.1:27017/testdb';
var db;

function initMongoDb() {
	MongoClient.connect(mongoUrl, function(err, database) {
		if (!err) {
			db = database;
		}

	});

}

exports.userList = function(callback) {
	db.collection('user', function(err, collection) {
		collection.find({}).toArray(function(err, docs) {
			if (!err) {
				db.close();
				var intCount = docs.length;
				if (intCount > 0) {
					var strJson = "[";
					for (var i = 0; i < intCount;) {
						strJson += '{"name":"' + docs[i].name + '"}'
						i = i + 1;
						if (i < intCount) {
							strJson += ',';
						}
					}
					strJson += ']';
					callback("", strJson);
				}
			}
		});

	});

}

exports.addUser = function(user, callback) {
	db.collection('user', function(err, collection) {
		collection.insertOne(user, {
			w : 1
		}, function(err, result) {
			console.log("Inserted");
		});
	});

}

exports.deleteUser = function(user, callback) {
	db.collection('user').deleteMany(user, function(err, results) {
		console.log("Deleted");
		callback();
	});

}

exports.updateUser = function(user, data, callback) {
	db.collection('user').update(user, data, function(err, results) {
		console.log("Updated");
		callback();
	});

}

exports.initMongoDb = initMongoDb;

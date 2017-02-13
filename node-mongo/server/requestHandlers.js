var queryString = require('querystring');
var mongo_data = require('./model/userModel');
function index(request, response) {
	console.log("Request handler 'index' was called.");
	response.writeHead(200, {
		"Content-Type" : "text/plain"
	});
	response.write("Hello World");
	response.end();
}

function users(request, response) {

	var method = request.method;
	console.log("Request handler 'users' was called for " + method);

	var body = '';
	var payload = '';

	if (method != 'GET') {

		request.on('data', function(data) {
			body += data;
			if (body.length > 1e6) {
				request.connection.destroy();
			}

		});
		request.on('end', function() {
			payload = JSON.parse(body);

			if (method == 'POST') {

				addUser(payload, response);

			} else if (method == 'PUT') {

				updateUser(payload, response);

			} else if (method == 'DELETE') {

				deleteUser(payload, response);
			}
		});
	} else {

		getUsers(payload, response);
	}

}

function getUsers(payload, response) {
	response.writeHead(200, {
		"Content-Type" : "application/json"
	});

	mongo_data.userList(function(err, userList) {
		if (!err) {
			response.write(userList);
			response.end();
		}
	});
}

function addUser(user, response) {
	console.log(user);
	mongo_data.addUser(user, function() {
		return;
	})
}

function updateUser(payload, response) {
	var user = payload.update;
	var userData = payload.data;
	mongo_data.updateUser(user, userData, function() {
		return;
	})
}

function deleteUser(user, response) {
	mongo_data.deleteUser(user, function() {
		return;
	})
}

exports.index = index;
exports.users = users;

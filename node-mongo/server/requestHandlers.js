
function index(response) {
	console.log("Request handler 'index' was called.");
	response.writeHead(200, {
		"Content-Type" : "text/plain"
	});
	response.write("Hello World");
	response.end();
}

function users(response) {
	console.log("Request handler 'users' was called.");
	response.writeHead(200, {
		"Content-Type" : "text/plain"
	});
	response.write("Hello Users");
	response.end();
}

exports.index = index;
exports.users = users;

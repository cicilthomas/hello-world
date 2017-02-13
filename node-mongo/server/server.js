var http = require("http");
var url = require("url");
var mongoDb = require("./model/userModel");

function start(route, handle) {

	mongoDb.initMongoDb();

	function onRequest(request, response) {
		var pathname = url.parse(request.url).pathname;
		console.log("Request for " + pathname + " received.");
		route(handle, pathname, request, response);
	}

	http.createServer(onRequest).listen(8888);
	console.log("Server has started.");
}

exports.start = start;
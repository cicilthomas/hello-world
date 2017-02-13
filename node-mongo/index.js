var server = require("./server/server");
var router = require("./server/router");
var requestHandlers = require("./server/requestHandlers");

var handle = {}
handle["/"] = requestHandlers.index;
handle["/users"] = requestHandlers.users;
server.start(router.route, handle);
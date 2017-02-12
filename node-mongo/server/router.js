
function route(handle, pathname, response) {
	console.log("Routing request for " + pathname);
	if (typeof handle[pathname] === 'function') {
		return handle[pathname](response);
	} else {
		console.log("No request handler found for " + pathname);
		return "Not found"
	}
}

exports.route = route;
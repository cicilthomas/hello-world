function route(handle, pathname, request, response) {
	console.log("Routing request");
	if (typeof handle[pathname] === 'function') {
		return handle[pathname](request, response);
	} else {
		console.log("No request handler found for " + pathname);
		return "Not found"
	}
}

exports.route = route;
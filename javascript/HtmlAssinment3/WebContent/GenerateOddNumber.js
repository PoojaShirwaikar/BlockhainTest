self.onmessage = function(event) {
	for (i = event.data.limit; i >= 1; i--) {
		if ((i % 2) != 0) {
			postMessage(i);
		}
	}
}

function setCurrentDateTime() {
	            var now = new Date();
	            var year = now.getFullYear();
	            var month = ('0' + (now.getMonth() + 1)).slice(-2);
	            var day = ('0' + now.getDate()).slice(-2);
	            var hours = ('0' + now.getHours()).slice(-2);
	            var minutes = ('0' + (Math.round(now.getMinutes() / 30) * 30)).slice(-2);
	            var currentDateTime = year + '-' + month + '-' + day + 'T' + hours + ':' + minutes;
	            document.getElementById('go').value = currentDateTime;
}
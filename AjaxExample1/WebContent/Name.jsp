<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<script>
	var request;
	function sendInfo() {
		var v = document.ranji.name.value;
		var url = "index.jsp?val=" + v;
		if (window.XMLHttpRequest) {
			request = new XMLHttpRequest();
		} else if (window.ActiveXObject) {
			request = new ActiveXObject("Microsoft.XMLHTTP");
		}

		try {
			request.onreadystatechange = getInfo;
			i++;
			request.open("GET", url, true);
			request.send();
		} catch (e) {
			alert("Unable to connect to server");
		}
	}

	function getInfo() {
		if (request.readyState == 4) {
			var val = request.responseText;
			document.getElementById('bujji').innerHTML = val;
		}

	}//sendinfo()
</script>

</head>
<body>
	<form name="ranji">
		<input type=text name=name /> <input type=button onclick="sendInfo()"
			value="getResponse" />

	</form>
	<h1 id="bujji"></h1>
	<br />
</body>
</html>
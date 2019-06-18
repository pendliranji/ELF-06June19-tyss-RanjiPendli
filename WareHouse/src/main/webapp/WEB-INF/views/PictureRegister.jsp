<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
		<pre>
	<form:form action="insert" method="POST" modelAttribute="picture">
Name  :<form:input path="pName" />
Date  :<form:input path="pDate" />
<input type="submit" value="register" />

	</form:form>
	</pre>
</body>
${message}
</html>
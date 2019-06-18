<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vendor</title>
<style type="text/css">
.err {
	color: red;
}
</style>
</head>
<body>
	<h1>WELCOME TO VENDOR PAGE!!</h1>
	<form:form action="insert" method="POST" modelAttribute="vendor">
		<pre>
VENDOR NAME        :<form:input path="venName" />
<form:errors path="venName" cssClass="err" />
VENDOR CODE        :<form:select path="venCode">
					<form:option value="">SELECT</form:option>
					<form:option value="cat">CAT</form:option>
					<form:option value="res">RES</form:option>
					</form:select>
<form:errors path="venCode" cssClass="err" />
VENDOR DESIGNATION :<form:radiobutton path="venDesg" value="sale" />sale <form:radiobutton
				path="venDesg" value="service" />service <form:radiobutton
				path="venDesg" value="saleservice" />both
<form:errors path="venDesg" cssClass="err" />
VENDOR PRESERVED   :<form:checkbox path="venPreserve" value="a" />A
					<form:checkbox path="venPreserve" value="b" />B
					<form:checkbox path="venPreserve" value="c" />C
<input type="submit" value="Create Vendor" />

</pre>

	</form:form>
	${message}
	<br>
</body>
</html>
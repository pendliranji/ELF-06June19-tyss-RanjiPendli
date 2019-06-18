<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>WELCOME TO VENDOR EDIT PAGE!!</h1>
	<form:form action="update" method="post" modelAttribute="vendor">
		<pre>
ID				   <form:input path="venId" readOnly="true" />
VENDOR NAME        :<form:input path="venName" />
VENDOR CODE        :<form:select path="venCode">
					<form:option value="cat">CAT</form:option>
					<form:option value="res">RES</form:option>
					</form:select>
VENDOR DESIGNATION :<form:radiobutton path="venDesg" value="sale" />sale <form:radiobutton
				path="venDesg" value="service" />service <form:radiobutton
				path="venDesg" value="saleservice" />both
VENDOR PRESERVED   :<form:checkbox path="venPreserve" value="a" />A
					<form:checkbox path="venPreserve" value="b" />B
					<form:checkbox path="venPreserve" value="c" />C
<input type="submit" value=Update Vendor"/>

</pre>

	</form:form>

</body>
</html>
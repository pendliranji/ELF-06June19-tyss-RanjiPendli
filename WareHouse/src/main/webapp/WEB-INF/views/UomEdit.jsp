<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">

</head>
<body>
<h1>WELCOME TO UNIT OF MEASUREMENT EDIT PAGE!!</h1>

<form:form action="update" method="POST" modelAttribute="uom">
<pre>
ID             :<form:input path="id" readOnly="true"/>
UOM TYPE       :<form:select path="type">
					<form:option value="">-SELECT-</form:option>
					<form:option value="PACK">PACKING</form:option>
					<form:option value="NOPACK">NOPACKING</form:option>
					<form:option value="">--NA--</form:option>
				</form:select>
UOM MODEL       :<form:input path="model"/>
DESCRPTION      :<form:textarea path="dsc"/>
<input type="submit" value="Update Uom"/>

</pre>
</form:form>
<br>

</body>
${message}
</html>
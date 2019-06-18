<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
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

<title>Insert title here</title>
</head>
<body>

<h1>WELCOME TO ORDER EDIT PAGE!!</h1>
<form:form action="update" method="POST" modelAttribute="order">
<pre>
ID             :<form:input path="id" readOnly="true"/>
ORDER MODE     :<form:radiobutton path="mode" value="sale"/>Sale <form:radiobutton path="mode" value="purchase"/>Purchase
ORDER CODE     :<form:input path="code" />
OREDR METHOD   :<form:select path="method">
				<form:option value="">--SELECT--</form:option>	
				<form:option value="fifo">FIFO</form:option>	
				<form:option value="lifo">LIFO</form:option>	
				<form:option value="fcfo">FCFO</form:option>	
				<form:option value="fefo">FEFO</form:option>	
				
				</form:select>
ORDER ACCEPT   :<form:checkbox path="accept" value="multimodel"/>Multi-Model
				<form:checkbox path="accept" value="acceptreturn"/>Accept-Return
DESCRIPTION    <form:textarea path="dsc"/>
<input type="submit" value="Update Order Method" />




</pre>
</form:form>

</body>
</html>
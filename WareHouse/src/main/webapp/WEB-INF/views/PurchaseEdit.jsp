<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<body>
	<h1>Welcome to PurchaseOrder EDIT Page!!</h1>
	<form:form action="update" method="post" modelAttribute="purchase">
		<pre>
Order Id         :<form:input path="id" readonly="true" />
Order Code       :<form:input path="code" />



Vendor           :<form:select path="typeUser">
					<form:option value="">--SELECT--</form:option>
					<form:options items="${vens}" itemLabel="code" itemValue="id" />
					</form:select> 
					
Shipment Code    :<form:select path="ship.id">
					<form:option value="">--select--</form:option>
					<form:options items="${enable}" itemLabel="code" itemValue="id" />
					</form:select>
Reference Number :<form:input path="num" />
Quality Check    :<form:radiobutton path="check" value="required" />Required <form:radiobutton
				path="check" value="notrequired" />Not Required  
Default status   :<form:input path="status" readonly="true" value="OPEN" />
Description      :<form:input path="dsc" />
<input type="submit" value="Update Order" />
</pre>
	</form:form>
</body>
</html>
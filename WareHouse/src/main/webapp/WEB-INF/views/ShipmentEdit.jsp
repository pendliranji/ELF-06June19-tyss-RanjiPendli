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
<h1>WELCOME TO SHIPMENT EDIT PAGE!!</h1>
	<form:form method="POST" action="update" modelAttribute="shipment">
		<pre>
SHIPMENT ID       :<form:input path="id" readOnly="true"/>
SHIPMENT MODE     :<form:select path="mode">
				  <form:option value="">--SELECT--</form:option>
				  <form:option value="AIR">AIR</form:option>
				  <form:option value="TRU">TRUCK</form:option>
			      <form:option value="SHP">SHIP</form:option>
				   <form:option value="TRN">TRAIN</form:option>
					</form:select>
SHIPMENT CODE     :<form:input path="code" />
ENABLED SHIPMENT  :<form:checkbox path="enabled" value="yes" />Yes
SHIPMENT GRADE    :<form:radiobutton path="grade" value="a" />A <form:radiobutton
				path="grade" value="b" />B <form:radiobutton path="grade" value="c" />C
DESCRIPTION       :<form:textarea path="dsc" />
<input type="submit" value="Update Shipment Type" />


</pre>


	</form:form>

</body>
</html>
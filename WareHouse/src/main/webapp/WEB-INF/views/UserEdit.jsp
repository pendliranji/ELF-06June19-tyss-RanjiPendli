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
<h1>WELCOME TO USERTYPE EDIT PAGE!!</h1>
<form:form action="update" method="post" modelAttribute="user">
<pre>
ID             :<form:input path="id" readOnly="true"/>
USER TYPE     :<form:radiobutton path="type" value="vendor"/>Vendor <form:radiobutton path="type" value="customer"/>Customer
USER CODE     :<form:input path="code"/>
USER FOR      :<form:input path="forType"/>
USER EMAIL    :<form:input path="email"/>
USER CONTACT  :<form:input path="contact"/>
USERID TYPE   :<form:select path="idType">
			  <form:option value="">--SELECT--</form:option>
			  <form:option value="PAN">PAN CARD</form:option>
			  <form:option value="UID">AADHAR</form:option>
			  <form:option value="ECI">VOTER ID</form:option>
			  <form:option value="OT">OTHERS</form:option>

				</form:select>
IF OTHER      :<form:input path="ifOther"/>
ID-NUMBER     :<form:input path="idNum"/>
<input type="submit" value="Update User"/>
</pre>
</form:form>
</body>
</html>
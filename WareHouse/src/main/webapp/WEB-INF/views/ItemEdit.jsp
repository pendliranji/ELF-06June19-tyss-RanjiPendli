<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	<h1>WELCOME TO ITEM EDIT PAGE !!</h1>
	<form:form action="update" method="POST" modelAttribute="item">
		<pre>
ITEM ID          <form:input path="itId" readOnly="true" />	
ITEM CODE        :<form:input path="itCode" />
ITEM DIMENSIONS  :<form:input path="itWidth" size="1" />W  <form:input
				path="itLength" size="1" />L  <form:input path="itHeight" size="1" />H
BASE COST        :<form:input path="itCost" />
BASE CURENCY     :<form:select path="itCurrency">
					<form:option value="">SELECT</form:option>
					<form:option value="IND">INR</form:option>
					<form:option value="USA">USD</form:option>
					<form:option value="AUS">AUS</form:option>
					<form:option value="EUR">ERU</form:option>
				</form:select>
ITEM UOM		 :<form:select path="uomm.id">
				<form:option value="">--SELECT--</form:option>
				<form:options items="${uoms}" itemLabel="model" itemValue="id" />
				</form:select>

OrderMethod :(Sales Type)
				<form:select path="saleType.id">
				<form:option value="">--SELECT--</form:option>
				<form:options items="${sales}" itemLabel="code" itemValue="id" />
				</form:select>		
OrderMethod :(Purchase Type)
				<form:select path="purchaseType.id">
				<form:option value="">--SELECT--</form:option>
				<form:options items="${purchases}" itemLabel="code" itemValue="id" />
				</form:select>		
				
Item Vendor :
			<form:select path="venUsers" >
			
			<form:option value="">--SELECT--</form:option>
			<form:options items="${vens}" itemLabel="code" itemValue="id" />
			
			</form:select>	
			
Item Customer :
			<form:select path="custUsers" multiple="true">
			
			<form:option value="">--SELECT--</form:option>
			<form:options items="${customers}" itemLabel="code" itemValue="id" />
			
			</form:select>		


DESCRIPTION       :<form:textarea path="itDsc" />					
<input type="submit" value="ITEM UPDATE">
</pre>
	</form:form>

	${message}

</body>
</html>
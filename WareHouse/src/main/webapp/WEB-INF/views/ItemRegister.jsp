<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Item</title>

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


<style type="text/css">
.err {
	color: red;
}
</style>

</head>
<body bgcolor="grey">
	<h1 align="center">WELCOME TO ITEM PAGE REGISTRATION !!</h1>
	
	<form:form action="insert" method="POST" modelAttribute="item">
		<pre>
		
ITEM CODE        :<form:input path="itCode" />
<form:errors path="itCode" cssClass="err" />
ITEM DIMENSIONS  :<form:input path="itWidth" size="1" />W  <form:input
				path="itLength" size="1" />L  <form:input path="itHeight" size="1" />H
<form:errors path="itWidth" cssClass="err" />
BASE COST        :<form:input path="itCost" />
<form:errors path="itCost" cssClass="err" />
BASE CURENCY    	 :<form:select path="itCurrency">
					<form:option value="">SELECT</form:option>
					<form:option value="IND">INR</form:option>
					<form:option value="USA">USD</form:option>
					<form:option value="AUS">AUS</form:option>
					<form:option value="EUR">ERU</form:option>
				</form:select>
<form:errors path="itCurrency" cssClass="err" />
ITEM UOM		 :<form:select path="uomm.id">
				<form:option value="">--SELECT--</form:option>
				<form:options items="${uoms}" itemLabel="model" itemValue="id" />
				</form:select>
<form:errors path="uomm" cssClass="err" />
OrderMethod :(Sales Type)
				<form:select path="saleType.id">
				<form:option value="">--SELECT--</form:option>
				<form:options items="${sales}" itemLabel="code" itemValue="id" />
				</form:select>	
<form:errors path="saleType" cssClass="err" />	
OrderMethod :(Purchase Type)
				<form:select path="purchaseType.id">
				<form:option value="">--SELECT--</form:option>
				<form:options items="${purchases}" itemLabel="code" itemValue="id" />
				</form:select>	
<form:errors path="purchaseType" cssClass="err" />
					
Item Vendor :
			<form:select path="venUsers">
			
			<form:option value="">--SELECT--</form:option>
			<form:options items="${vens}" itemLabel="code" itemValue="id" />
			
			</form:select>	
<form:errors path="venUsers" cssClass="err" />	
			
Item Customer :
			<form:select path="custUsers">
			
			<form:option value="">--SELECT--</form:option>
			<form:options items="${customers}" itemLabel="code" itemValue="id" />
			
			</form:select>		
<form:errors path="custUsers" cssClass="err" />	
				
DESCRIPTION    		   :<form:textarea path="itDsc" />					
<form:errors path="itDsc" cssClass="err" />	

<input type="submit" value="ITEM REGISTER">

</pre>
	</form:form>

	${message}
	<br />
</body>
</html>
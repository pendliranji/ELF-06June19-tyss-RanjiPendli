<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<title>Item Data</title>
</head>
<body>


	<a href="excel" class="text-info">EXCEL EXPORT</a> ||
	<a href="pdf" class="text-info">PDF EXPORT</a>
	<br />
<div class="container">
<div class="card">  

<div class="card-header bg-info text-white">
	<h1>WELCOME TO ITEM DATA PAGE!!</h1>
</div>
<div class="card-body bg-light">
<c:choose>
<c:when test="${!empty list}">
	<table class="table table-hover table-bordered">
		<tr>
			<th>ITEM ID</th>
			<th>ITEM CODE</th>
			<th>ITEM DIMENSIONS</th>
			<th>BASE COST</th>
			<th>CURRENCY</th>
			<th>UOM</th>
			<th>SALE</th>
			<th>PURCHASE</th>
			<th>VENDOR</th>
			<th>CUSTOMER</th>
			<th>DESCRIPTION</th>
			<th colspan="2">OPERATIONS</th>
		</tr>
		<c:forEach items="${list}" var="li">
			<tr>
				<td><c:out value="${li.itId}"></c:out></td>
				<td><c:out value="${li.itCode}"></c:out></td>
				<td>W:<c:out value="${li.itWidth}"></c:out> L:<c:out
						value="${li.itLength}"></c:out> H:<c:out value="${li.itHeight}"></c:out></td>
				<td><c:out value="${li.itCost}"></c:out></td>
				<td><c:out value="${li.itCurrency}"></c:out></td>
				<td><c:out value="${li.uomm.model}" /></td>
				<td><c:out value="${li.saleType.code}" /></td>
				<td><c:out value="${li.purchaseType.code}" /></td>
				<td><c:forEach items="${li.venUsers}" var="ven">
						<c:out value="${ven.code}" />
					</c:forEach></td>

				<td><c:forEach items="${li.custUsers}" var="cust">
						<c:out value="${cust.code}" />
					</c:forEach></td>
				<td><c:out value="${li.itDsc}"></c:out></td>
				
				<td><a href="delete?id=${li.itId}" class="btn btn-danger">DELETE</a></td>
				<td><a href="edit?id=${li.itId}" class="btn btn-primary">EDIT</a></td>
			</tr>
		</c:forEach>
	</table>
</c:when>
<c:otherwise>
<div class="bg-info">No data found in DB</div>
</c:otherwise>
</c:choose>
</div>
<c:if test="${message ne null}">
<div class="bg-success text-white"><h2>${message}</h2>

</div>
</c:if>


</div>
</div>
</body>
</html>
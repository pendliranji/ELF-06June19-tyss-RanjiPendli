<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Order Method Register</title>
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
<a href="excel" class="btn btn-dark">EXCEL EXPORT</a> || <a href="pdf"
			class="btn btn-dark">PDF EXPORT</a>
	<div class="container">
		<div class="card bg-primary">

			<div class="card-header bg-info">
				<a><h1>WELCOME TO ORDER DATA PAGE!!</h1></a>
			</div>

			<div class="card-body bg-light">
				<table class="table table-hover table-bordered">
				<c:choose>
				<c:when test="${!empty list}">
					<tr>
						<th>ID</th>
						<th>MODE</th>
						<th>CODE</th>
						<th>METHOD</th>
						<th>ACCEPT</th>
						<th>DESCRIPTION</th>
						<th colspan="2">OPERATIONS</th>
					</tr>
					<c:forEach items="${list}" var="li">
						<tr>
							<td><c:out value="${li.getId()}" /></td>
							<td><c:out value="${li.getMode()}" /></td>
							<td><c:out value="${li.getCode()}" /></td>
							<td><c:out value="${li.getMethod()}" /></td>
							<td><c:out value="${li.getAccept()}" /></td>
							<td><c:out value="${li.getDsc()}" /></td>
							<td><a href="delete?id=${li.getId()}" class="btn btn-danger">DELETE</a></td>
							<td><a href="edit?id=${li.getId()}" class="btn btn-info">EDIT</a></td>
						</tr>


					</c:forEach>
					
					</c:when>
					<c:otherwise>
					<div class="bg-warning text-white">No Data Found in DataBase</div>
					</c:otherwise>
				</c:choose>
					
				</table>
				<c:if test="${message ne null}">
	<div class="card-footer text-info text-black"><h3>${message}</h3></div>

		</c:if>
			</div>

		</div>
	</div>


	
	<br>
</body>
</html>
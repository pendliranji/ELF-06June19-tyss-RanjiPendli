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

<title>UserType Data</title>
</head>
<body>
	<a href="excel" class="text-info">EXCEL EXPORT</a> ||
	<a href="pdf" class="text-info">PDF EXPORT</a>

	<div class="container">
		<div class="card bg-info">
			<div class="card-header bg-primary">
				<h1>WELCOME TO USER DATA</h1>
			</div>

			<div class="card-body bg-light">
				<c:choose>
					<c:when test="${!empty list}">

						<table class="table table-hover ">
							<tr>
								<th>ID</th>
								<th>TYPE</th>
								<th>CODE</th>
								<th>FORTYPE</th>
								<th>EMAIL</th>
								<th>CONTACT</th>
								<th>IDTYPE</th>
								<th>IFOTHER</th>
								<th>IDNUM</th>
								<th colspan="2">OPERATIONS</th>
							</tr>
							<c:forEach items="${list}" var="li">
								<tr>
									<td><c:out value="${li.getId()}"></c:out></td>
									<td><c:out value="${li.getType()}"></c:out></td>
									<td><c:out value="${li.getCode()}"></c:out></td>
									<td><c:out value="${li.getForType()}"></c:out></td>
									<td><c:out value="${li.getEmail()}"></c:out></td>
									<td><c:out value="${li.getContact()}"></c:out></td>
									<td><c:out value="${li.getIdType()}"></c:out></td>
									<td><c:out value="${li.getIfOther()}"></c:out></td>
									<td><c:out value="${li.getIdNum()}"></c:out></td>
									<td><a href="delete?id=${li.getId()}" class="btn btn-danger">DELETE</a></td>
									<td><a href="edit?id=${li.getId()}" class="btn btn-info">EDIT</a></td>

								</tr>
							</c:forEach>
						</table>
					</c:when>
					<c:otherwise>
						<div class="bg-secondary">No data found in DB</div>
					</c:otherwise>
				</c:choose>
			</div>

			<c:if test="${message ne null}">
				<div class="card-footer bg-success">${message}</div>
			</c:if>


		</div>

	</div>



</body>
</html>
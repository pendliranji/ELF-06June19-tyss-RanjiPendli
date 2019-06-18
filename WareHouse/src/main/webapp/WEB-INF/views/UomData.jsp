<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Uom Data</title>
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
	<center>
		<a href="excel" class="btn btn-info">EXCEL EXPORT</a> || <a href="pdf"
			class="btn btn-info">PDF EXPORT</a>
	</center>
	<div class="container">
		<div class="card">

			<div class="card-header bg-info">
				<h1>WELCOME TO UOM DATA PAGE!!</h1>
			</div>
			<div class="card-body bg-light">
				<c:choose>
					<c:when test="${!empty list}">

						<table class="table table-hover table-bordered">
							<tr class="thead-dark">
								<th>ID</th>
								<th>TYPE</th>
								<th>MODEL</th>
								<th>DESCRIPTION</th>
								<th colspan="2">OPERATIONS</th>
							</tr>
							<c:forEach items="${list}" var="li">
								<tr>
									<td><c:out value="${li.getId()}"></c:out></td>
									<td><c:out value="${li.getType()}"></c:out></td>
									<td><c:out value="${li.getModel()}"></c:out></td>
									<td><c:out value="${li.getDsc()}"></c:out></td>
									<td><a href="delete?id=${li.getId()}"
										class="btn btn-danger">DELETE</a></td>
									<td><a href="edit?id=${li.getId()}" class="btn btn-info">EDIT</a></td>

								</tr>



							</c:forEach>



						</table>

					</c:when>
					<c:otherwise>
						<div class="text-info">No Data found</div>
					</c:otherwise>
				</c:choose>


			</div>

			<c:if test="${message ne null}">
				<div class="card-footer bg-success text-white">
					<h3>${message}</h3>
				</div>

			</c:if>

		</div>

	</div>





</body>
</html>
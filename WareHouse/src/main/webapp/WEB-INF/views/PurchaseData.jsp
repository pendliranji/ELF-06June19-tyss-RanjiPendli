<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
+


<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Purchase Order Data Page!!</h1>
<table border="1">
<tr>
<th>ID</th>
<th>CODE</th>
<th>VENDOR</th>
<th>SHIPMENT TYPE</th>
<th>REFERENCE</th>
<th>QUALITY</th>
<th>STATUS</th>
<th>DESCRIPTION</th>
<th colspan="2">OPERATIONS</th>
</tr>
<c:forEach items="${po}" var="li">
<tr>
<td><c:out value="${li.id}"/></td>
<td><c:out value="${li.code}"/></td>
<td><c:out value="${li.typeUser.code}"/></td>
<td><c:out value="${li.ship.code}"/></td>
<td><c:out value="${li.num}"/></td>
<td><c:out value="${li.check}"/></td>
<td><c:out value="${li.status}"/></td>
<td><c:out value="${li.dsc}"/></td>
<td><a href="delete?id=${li.id}">DELETE</a></td>
<td><a href="edit?id=${li.id}">EDIT</a></td>

</tr>

</c:forEach>
</table>
${message}

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>WELCOME TO VENDOR DETAILS!!</h1>

<a href="excel">EXCEL EXPORT</a>  ||  <a href="pdf">PDF EXPORT</a>
<table border="1">
<tr>
	<th>ID</th>
	<th>NAME</th>
	<th>CODE</th>
	<th>DESIGNATION</th>
	<th>PRESERVE</th>
	<th colspan="2">OPERATIONS</th>
</tr>
<c:forEach items="${list}" var="li">

<tr>
<td><c:out value="${li.getVenId()}"></c:out></td>
<td><c:out value="${li.getVenName()}"></c:out></td>
<td><c:out value="${li.getVenCode()}"></c:out></td>
<td><c:out value="${li.getVenDesg()}"></c:out></td>
<td><c:out value="${li.getVenPreserve()}"></c:out></td>
<td><a href="delete?id=${li.getVenId()}">DELETE</a></td>
<td><a href="edit?id=${li.getVenId()}">EDIT</a></td>
</tr>




</c:forEach>

</table>
${message}
<br>
</body>
</html>
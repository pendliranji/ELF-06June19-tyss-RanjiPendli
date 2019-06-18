<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data</title>
</head>
<body>
<table border=1>
<tr>
<th>ID</th>
<th>Name</th>
<th>Date</th>
<th colspan="2">Operations</th>
</tr>
<c:forEach items="${list}" var="e">
<tr>
<td><c:out value="${e.pId}"></c:out></td>
<td><c:out value="${e.pName}"></c:out></td>

<td><c:out value="${e.pDate}"></c:out></td>
<td><a href="delete?id=${e.pId}">DELETE</a>
<td><a href="edit?id=${e.pId}">Update</a>
</tr>

</c:forEach>

</table>

</body>
${message }
</html>
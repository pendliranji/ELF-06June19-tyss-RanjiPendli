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
<a href="excel">EXCEL EXPORT</a>  ||  <a href="pdf">PDF EXPORT</a>
<a><h1>WELCOME TO Customer DATA PAGE!!</h1></a>
<table border="1">

<tr>
<th>ID</th>
<th>CODE</th>
<th>ADDRESS</th>
<th>LOCATION</th>
<th>ENABLED</th>
<th>CONTACT</th>
<th colspan="2">OPERATIONS</th>
</tr>
<c:forEach items="${list}" var="li">
<tr>
<td><c:out value="${li.getCustId()}"/></td>
<td><c:out value="${li.getCustCode()}"/></td>
<td><c:out value="${li.getCustAddr()}"/></td>
<td><c:out value="${li.getCustLocs()}"/></td>
<td><c:out value="${li.getCustEnabled()}"/></td>
<td><c:out value="${li.getCustContact()}"/></td>
<td><a href="delete?id=${li.getCustId()}">DELETE</a></td>
<td><a href="edit?id=${li.getCustId()}">EDIT</a></td>
</tr>


</c:forEach>
</table>
${message}

</body>
</html>
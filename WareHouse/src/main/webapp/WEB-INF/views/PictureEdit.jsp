<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<pre>
	<form:form action="update" method="POST" modelAttribute="picture">
Id    :<form:input path="pId" readonly="true"/>
Name  :<form:input path="pName" />
Date  :<form:input path="pDate" />
<input type="submit" value="register" />

	</form:form>
	</pre>

</body>
</html>
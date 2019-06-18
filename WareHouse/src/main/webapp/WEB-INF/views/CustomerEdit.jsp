<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>WELCOME TO CUSTOMER EDIT PAGE!!</h1>
	<form:form action="update" method="POST" modelAttribute="customer">
		<pre>
ID                :<form:input path="custId" readOnly="true" />
CUSTOMER CODE     :<form:input path="custCode" />
CUSTOMER ADDRESS  :<form:textarea path="custAddr" />
CUSTOMER LOCATION :<form:select path="custLocs" multiple="multiple">
					<form:option value="che">CHENNAI</form:option>
					<form:option value="hyd">HYDERABAD</form:option>
					<form:option value="ban">BANGALORE</form:option>
					</form:select>
CUSTOMER ENBLED   :<form:radiobutton path="custEnabled" value="y" />Yes <form:radiobutton
				path="custEnabled" value="n" />No
CUSTOMER CONTACT  :<form:input path="custContact" />

<input type="submit" value="update Customer"/>

</pre>
	</form:form>
</body>
</html>
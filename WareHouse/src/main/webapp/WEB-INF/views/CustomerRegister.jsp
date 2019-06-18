<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.err
{

color:blue;
}


</style>

</head>
<body>
	<h1>WELCOME TO CUSTOMER REGISTER PAGE!!</h1>
	<form:form action="insert" method="POST" modelAttribute="customer">
		<fieldset>
		<legend>Customer</legend>
			<pre>
CUSTOMER CODE     :<form:input path="custCode" />
<form:errors path="custCode" cssClass="err"/>
CUSTOMER ADDRESS  :<form:textarea path="custAddr" />
<form:errors path="custAddr" cssClass="err"/>
CUSTOMER LOCATIONs:<form:select path="custLocs" multiple="multiple">
					<form:option value="che">CHENNAI</form:option>
					<form:option value="hyd">HYDERABAD</form:option>
					<form:option value="ban">BANGALORE</form:option>
					</form:select>
<form:errors path="custLocs" cssClass="err"/>
CUSTOMER ENBLED   :<form:radiobutton path="custEnabled" value="y" />Yes <form:radiobutton
					path="custEnabled" value="n" />No
<form:errors path="custEnabled" cssClass="err"/>
CUSTOMER CONTACT  :<form:input path="custContact" />
<form:errors path="custContact" cssClass="err"/>

<input type="submit" value="Create Customer" />
</pre>
		</fieldset>
	</form:form>
	${message}
	<br>
</body>
</html>
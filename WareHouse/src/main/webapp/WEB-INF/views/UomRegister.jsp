<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<title>Uom Register</title>
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


	<div class="container">

		<div class="card">

			<div class="card-header bg-primary text-white">
				<h1>WELCOME TO UNIT OF MEASUREMENT</h1>
			</div>

			<div class="card-body">
				<form:form action="insert" method="POST" modelAttribute="uom">
					<div class="form-group">
						<label for="uomType" class="control-label col-sm-4">UOM
							TYPE</label>
						<form:select path="type" cssClass="form-control col-sm-4">
							<form:option value="">-SELECT-</form:option>
							<form:option value="PACK">PACKING</form:option>
							<form:option value="NOPACK">NOPACKING</form:option>
							<form:option value="">--NA--</form:option>
						</form:select>
						<form:errors path="type" cssClass="text-danger" />
						<div class="form-group">
							<label for="uomType" class="control-label col-sm-4">Model
								TYPE</label>
							<form:input path="model" cssClass="form-control col-sm-4" />
							<form:errors path="model" cssClass="text-danger" />

							<div class="form-group">
								<label for="uomType" class="control-label col-sm-4">Description</label>
								<form:textarea path="dsc" cssClass="form-control col-sm-4" />
								<form:errors path="dsc" cssClass="text-danger" />

								<div class="form-group">
									<input type="submit" value="Register Uom" class="btn btn-success" />
								</div>
				</form:form>
			</div>
			<c:if test="${message ne null}">
				<div class="card-footer bg-secondary">
					<h3>${message}</h3>
				</div>

			</c:if>

		</div>


	</div>








</body>
</html>
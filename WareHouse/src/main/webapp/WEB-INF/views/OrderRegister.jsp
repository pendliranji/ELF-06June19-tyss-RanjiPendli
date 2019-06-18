<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Order Register</title>
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
			<div class="card-header bg-primary">
				<h1>WELCOME TO ORDER PROCESS PAGE!!</h1>
			</div>

			<div class="card-body bg-light">


				<form:form action="insert" method="POST" modelAttribute="order"
					cssClass="form">
					<div class="form-group">
						<label for="uomType" class="control-label col-sm-4">Order
							Mode</label>
						<form:radiobutton path="mode" value="sale" />
						Sale
						<form:radiobutton path="mode" value="purchase" />
						Purchase
						<form:errors path="mode" cssClass="text-danger" />
						<div class="form-group">
							<label for="uomType" class="control-label col-sm-4">Order
								Code</label>
							<form:input path="code" />
							<form:errors path="code" cssClass="text-danger" />

							<div class="form-group">
								<label for="uomType" class="control-label col-sm-4">Order
									Method</label>
								<form:select path="method">
									<form:option value="">--SELECT--</form:option>
									<form:option value="fifo">FIFO</form:option>
									<form:option value="lifo">LIFO</form:option>
									<form:option value="fcfo">FCFO</form:option>
									<form:option value="fefo">FEFO</form:option>

								</form:select>
								<form:errors path="method" cssClass="text-danger" />

								<div class="form-group">
									<label for="uomType" class="control-label col-sm-4">OrderAccept</label>
									<form:checkbox path="accept" value="multimodel" />
									Multi-Model
									<form:checkbox path="accept" value="acceptreturn" />
									Accept-Return
									<form:errors path="accept" cssClass="text-danger" />

									<div class="form-group">
										<label for="uomType" class="control-label col-sm-4">Description</label>
										<form:textarea path="dsc" cssClass="form-control col-sm-4" />
										<form:errors path="dsc" cssClass="text-danger" />
										<div class="form-group">
											<input type="submit" value="Create Order Method"
												class="btn btn-success" />
										</div>
				</form:form>

			</div>
			<c:if test="${message ne null}">
				<div class="card-footer bg-secondary text-white">${message}</div>
			</c:if>
		</div>
	</div>


</body>
</html>
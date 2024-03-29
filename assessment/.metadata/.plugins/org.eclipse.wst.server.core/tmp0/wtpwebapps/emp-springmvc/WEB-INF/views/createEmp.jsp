<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Employee Information</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
	<body style="background: lightgreen">
		<div class="accordion" id="accordionExample">
<form action="createEmployee" method="post" >
			<div class="card">
				<div class="card-header" id="headingOne">
					<h5 class="mb-0">
						<button class="btn btn-link" type="button" data-toggle="collapse"
							data-target="#collapseOne" aria-expanded="true"
							aria-controls="collapseOne">Employee Information</button>
					</h5>
				</div>

				<div id="collapseOne" class="collapse show"
					aria-labelledby="headingOne" data-parent="#accordionExample">
					<div class="card-body">
						<div class="row">
							<div class="col form-group">
								<label for="exampleInputEmail1">ID</label> 
								<input type="text"
									id="id" name="id" class="form-control" placeholder="ID">
							</div>
							<div class="col form-group">
								<label for="exampleInputEmail1">ACCOUNT NUMBER</label> 
								<input
									type="text" id="accountNumber" name="accountNumber"
									class="form-control" placeholder="ACCOUNT NUMBER">
							</div>
						</div>
						<div class="row">
							<div class="col form-group">
								<label for="exampleInputEmail1">NAME</label> 
								<input type="text"
									id="name" name="name" class="form-control" placeholder="NAME">
									
							</div>
							<div class="col form-group">
								<label for="exampleInputEmail1">EMAIL ID</label> <input
									type="text" id="emailId" name="email" class="form-control"
									placeholder="EMAIL ID">
							</div>
						</div>
						<div class="row">
							<div class="col form-group">
								<label for="exampleInputEmail1">AGE</label> 
								<input type="text"
									name="age" id="age" class="form-control" placeholder="AGE">
							</div>
							<div class="col form-group">
								<label for="exampleInputEmail1">DESIGNATION</label> <input
									type="text" name="designation" id="designation"
									class="form-control" placeholder="DESIGNATION">
							</div>
						</div>
						<div class="row">
							<div class="col form-group">
								<label for="inputGender">Gender</label> <select name="gender"
									id="gender" class="form-control">
									<option selected>--select one--</option>
									<option value="male">male</option>
									<option value="female">female</option>
									<option value="other">other</option>
								</select>
							</div>
							<div class="col form-group">
								<label for="exampleInputEmail1">Date of Birth</label> <input
									type="date" name="dob" id="dob" class="form-control"
									placeholder="dd-mm-yyyy">
							</div>
						</div>
						<div class="row">
							<div class="col form-group">
								<label for="exampleInputEmail1">SALARY</label> <input
									type="text" name="salary" id="salary" class="form-control"
									placeholder="SALARY">
							</div>
							<div class="col form-group">
								<label for="exampleInputEmail1">DEPARTMENT ID</label> <input
									type="text" name="departmentId" id="departmentId"
									class="form-control" placeholder="DEPARTMENT ID">
							</div>
						</div>
						<div class="row">
							<div class="col form-group">
								<label for="exampleInputEmail1">PHONE NUMBER</label> <input
									type="text" name="phone" id="phone" class="form-control"
									placeholder="PHONE NUMBER">
							</div>
							<div class="col form-group">
								<label for="exampleInputEmail1">MANAGER ID</label> <input
									type="text" name="managerId" id="managerId"
									class="form-control" placeholder="MANAGER ID">
							</div>
						</div>
						<div class="row">

							<div class="col-6 form-group">
								<label for="exampleInputEmail1">JOINING DATE</label> <input
									type="date" name="joiningDate" id="joiningDate"
									class="form-control" placeholder="JOINING DATE">
							</div>
							<div class="col form-group">
								<label for="password">Password:</label> <input type="password"
									onkeyup="validateForm()" class="form-control" id="password"
									placeholder="Enter Password" name="password"> <label
									for="password">Confirm Password:</label> <input type="password"
									onkeyup="validateForm()" class="form-control"
									id="confirmpassword" placeholder="Confirm Password"
									name="password">

							</div>

						</div>
					</div>
				</div>
			</div>
			<div class="card">
				<div class="card-header" id="headingTwo">
					<h5 class="mb-0">
						<button class="btn btn-link collapsed" type="button"
							data-toggle="collapse" data-target="#collapseTwo"
							aria-expanded="false" aria-controls="collapseTwo">
							Employee Other Information</button>
					</h5>
				</div>
				<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
					data-parent="#accordionExample">
					<div class="card-body">
						<div class="row">

							<div class="col form-group">
								<label for="exampleInputemergenum">Emergency Contact
									Number</label> <input type="number" class="form-control"
									name="employeeOtherInfoBean.emergencyContactNum"
									id="emerContNum"
									placeholder="Please Enter Emergency Contact Number">
							</div>
							<div class="col form-group">
								<label for="exampleInputmotname">Mother Name</label> <input
									type="text" id="motherName"
									name="employeeOtherInfoBean.motherName" class="form-control"
									placeholder="Please Enter Mother Name">
							</div>
						</div>
						<div class="row">
							<div class="col form-group">
								<label for="exampleInputPan">Pan Number</label> <input
									type="text" id="pan" name="employeeOtherInfoBean.pan"
									class="form-control" placeholder="Please Enter Pan Number">
							</div>
							<div class="col form-group">
								<label for="exampleInputemergeName">Emergency Contact
									Name</label> <input type="number" id="emergencyContactName"
									name="employeeOtherInfoBean.emergencyContactName"
									class="form-control"
									placeholder="Please Enter Emergency Contact Name">
							</div>
							<div class="col form-group">
								<label for="exampleInputspouse">Spouse Name</label> <input
									type="text" id="spouseName"
									name="employeeOtherInfoBean.spouseName" class="form-control"
									placeholder="Please Enter Spouse Name">
							</div>
						</div>
						<div class="row">
							<div class="col form-group">
								<label for="inputStatus">Marital Status</label> <select
									id="inputStatus" name="employeeOtherInfoBean.isMarried"
									class="form-control">
									<option selected>Married</option>
									<option value="true">Married</option>
									<option value="false">Unmarried</option>
								</select>
							</div>
							<div class="col form-group">
								<label for="inputnationality">Nationality</label> <select
									id="inputnationality" name="employeeOtherInfoBean.nationality"
									class="form-control">
									<option selected>---Select One---</option>
									<option value="indian">Indian</option>
									<option value="other">Other</option>
								</select>
							</div>
							<div class="col form-group">
								<label for="exampleInputpassport">Passport Number</label> <input
									type="text" id="passportNum"
									name="employeeOtherInfoBean.passport" class="form-control"
									placeholder="Please Enter Passport Number">
							</div>
						</div>
						<div class="row">
							<div class="col form-group">
								<label for="inputbloodgrp">Blood Group</label> <select
									id="inputbloodgrp" name="employeeOtherInfoBean.bloodGrp"
									class="form-control">
									<option selected>---Select One---</option>
									<option value="AB+">AB+</option>
									<option value="AB-">AB-</option>
									<option value="A+">A+</option>
									<option value="A-">A-</option>
									<option value="o+">o+</option>
									<option value="o-">o-</option>
								</select>
							</div>
							<div class="col form-group">
								<label for="inputreligion">Religion</label> <select
									id="inputreligion" name="employeeOtherInfoBean.relegion"
									class="form-control">
									<option selected>---Select One---</option>
									<option value="hindu">Hindu</option>
									<option value="christian">Christian</option>
									<option value="muslim">Muslim</option>
								</select>
							</div>
							<div class="col form-group">
								<label for="exampleInputaadhar">Aadhar Number</label> <input
									type="number" id="adhar" name="employeeOtherInfoBean.adhar"
									class="form-control" placeholder="Please Enter Aadhar Number">
							</div>
						</div>
						<div class="row">
							<div class="col form-group">
								<label for="inputphysicallych">Physically Challnged</label> <select
									id="inputphysicallych"
									name="employeeOtherInfoBean.isChallenged" class="form-control">
									<option selected>---Select One---</option>
									<option value="true">Yes</option>
									<option value="false">No</option>
								</select>
							</div>
							<div class="col form-group">
								<label for="exampleInputfather">Father Name</label> <input
									type="text" name="employeeOtherInfoBean.fatherName"
									class="form-control" placeholder="Please Enter Father Name">
							</div>

						</div>
					</div>
				</div>


				<div class="card">
					<div class="card-header" id="headingThree">
						<h2 class="mb-0">
							<button class="btn btn-link" type="button" data-toggle="collapse"
								data-target="#collapseThree" aria-expanded="true"
								aria-controls="collapseThree">Employee AddressInfo 1</button>
						</h2>
					</div>

					<div id="collapseThree" class="collapse show"
						aria-labelledby="headingThree" data-parent="#accordionExample">
						<div class="card-body">
							<div class="row">
								<div class="col form-group">
									<label for="AddressType">Address Type</label> <input
										type="text"
										name="addressInfoBeanList.addressPKBean.addressType"
										class="form-control" placeholder="Enter AddressType">
								</div>
								<div class="col form-group">
									<label for="exampleInputCity">City</label> <input type="text"
										name="addressInfoBeanList.city" class="form-control"
										placeholder="Enter City">
								</div>
							</div>
							<div class="row">
								<div class="col form-group">
									<label for="exampleInputState">State</label> <input type="text"
										name="addressInfoBeanList.state" class="form-control"
										placeholder="Enter State">
								</div>
							</div>
							<div class="row">
								<div class="col form-group">
									<label for="exampleInputAddress1">Address1</label> <input
										type="text" name="addressInfoBeanList.address1"
										class="form-control" placeholder="Enter Address Line1">
								</div>
								<div class="col form-group">
									<label for="exampleInputCountry">Country</label> <input
										name="addressInfoBeanList.country" type="text"
										class="form-control" placeholder="Enter Country">
								</div>
							</div>
							<div class="row">
								<div class="col form-group">
									<label for="exampleInputAddress2">Address2</label> <input
										type="text" class="form-control"
										name="addressInfoBeanList.address2"
										placeholder="Enter Address Line2">
								</div>
								<div class="col form-group">
									<label for="exampleInputPincode">Pincode</label> <input
										name="addressInfoBeanList.pincode" type="number"
										class="form-control" placeholder="Enter Pincode">
								</div>
							</div>
							<div class="row">

								<div class="col-6 form-group">
									<label for="exampleInputLandmark">Landmark</label> <input
										name="addressInfoBeanList.landmark" type="text"
										class="form-control" placeholder="Enter Landmark">
								</div>

							</div>

							<!-- <div class="row">
								<div class="col form-group">
									<label for="AddressType">Address Type</label> <input
										type="text"
										name="addressInfoBeanList.addressPKBean.addressType"
										class="form-control" placeholder="Enter AddressType">
								</div>
								<div class="col form-group">
									<label for="exampleInputCity">City</label> <input type="text"
										name="addressInfoBeanList.city" class="form-control"
										placeholder="Enter City">
								</div>
							</div>
							<div class="row">
								<div class="col form-group">
									<label for="exampleInputState">State</label> <input type="text"
										name="addressInfoBeanList.state" class="form-control"
										placeholder="Enter State">
								</div>
							</div>
							<div class="row">
								<div class="col form-group">
									<label for="exampleInputAddress1">Address1</label> <input
										type="text" name="addressInfoBeanList.address1"
										class="form-control" placeholder="Enter Address Line1">
								</div>
								<div class="col form-group">
									<label for="exampleInputCountry">Country</label> <input
										name="addressInfoBeanList.country" type="text"
										class="form-control" placeholder="Enter Country">
								</div>
							</div>
							<div class="row">
								<div class="col form-group">
									<label for="exampleInputAddress2">Address2</label> <input
										type="text" class="form-control"
										name="addressInfoBeanList.address2"
										placeholder="Enter Address Line2">
								</div>
								<div class="col form-group">
									<label for="exampleInputPincode">Pincode</label> <input
										name="addressInfoBeanList.pincode" type="number"
										class="form-control" placeholder="Enter Pincode">
								</div>
							</div>
							<div class="row">

								<div class="col-6 form-group">
									<label for="exampleInputLandmark">Landmark</label> <input
										name="addressInfoBeanList.landmark" type="text"
										class="form-control" placeholder="Enter Landmark">
								</div>

							</div>
						</div> -->
					</div>
				</div>

				<div class="card">
					<div class="card-header" id="headingFive">
						<h2 class="mb-0">
							<button class="btn btn-link collapsed" type="button"
								data-toggle="collapse" data-target="#collapseFive"
								aria-expanded="false" aria-controls="collapseFive">
								Employee Educational Information 1</button>
						</h2>
					</div>
					<div id="collapseFive" class="collapse"
						aria-labelledby="headingFive" data-parent="#accordionExample">
						<div class="card-body">
							<fieldset>

								<legend class="h3" style="text-align: center;">Education
									Details</legend>



								
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">Education Type</span> <input
												id="educationtype"
												name="employeeEducationalInfoBean[0].educationalInfoPKBean.educationType"
												class="form-control" placeholder="Enter Educational Type"
												type="text">
										</div>

									</div>
								</div>

								
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">Degree Type</span> <input
												id="degreetype"
												name="employeeEducationalInfoBean[0].degreeType"
												class="form-control" placeholder="Enter Degree Type"
												type="text">
										</div>

									</div>
								</div>

								
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">Branch</span> <input
												id="branch" name="employeeEducationalInfoBean[0].branch"
												class="form-control" placeholder="Enter Branch" type="text">
										</div>

									</div>
								</div>

								
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">College Name</span> <input
												id="college"
												name="employeeEducationalInfoBean[0].collegeName"
												class="form-control" placeholder="Enter College Name"
												type="text">
										</div>

									</div>
								</div>

								
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">University</span> <input
												id="university"
												name="employeeEducationalInfoBean[0].university"
												class="form-control" placeholder="Enter University Name"
												type="text">
										</div>

									</div>
								</div>

								
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">Year of Passout</span> <input
												id="yop" name="employeeEducationalInfoBean[0].yop"
												class="form-control" placeholder="Enter Year of Passout"
												type="text">
										</div>

									</div>
								</div>

								
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">Percentage</span> <input
												id="percentage"
												name="employeeEducationalInfoBean[0].percentage"
												class="form-control" placeholder="Enter Percentage"
												type="number">
										</div>

									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">Location</span> <input
												id="location" name="employeeEducationalInfoBean[0].location"
												class="form-control" placeholder="Enter Location"
												type="text">
										</div>

									</div>
								</div>


							</fieldset>
						</div>
					</div>

				</div>
				<div class="card">
					<div class="card-header" id="headingSix">
						<h2 class="mb-0">
							<button class="btn btn-link collapsed" type="button"
								data-toggle="collapse" data-target="#collapseSix"
								aria-expanded="false" aria-controls="collapseSix">
								Employee Educational Information 2</button>
						</h2>
					</div>
					<div id="collapseSix" class="collapse" aria-labelledby="headingSix"
						data-parent="#accordionExample">
						<div class="card-body">
							<fieldset>

								<legend class="h3" style="text-align: center;">Education
									Details</legend>



								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">Education Type</span> <input
												id="educationtype"
												name="employeeEducationalInfoBean[1].educationalInfoPKBean.educationType"
												class="form-control" placeholder="Enter Educational Type"
												type="text">
										</div>

									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">Degree Type</span> <input
												id="degreetype"
												name="employeeEducationalInfoBean[1].degreeType"
												class="form-control" placeholder="Enter Degree Type"
												type="text">
										</div>

									</div>
								</div>

								
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">Branch</span> <input
												id="branch" name="employeeEducationalInfoBean[1].branch"
												class="form-control" placeholder="Enter Branch" type="text">
										</div>

									</div>
								</div>

								
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">College Name</span> <input
												id="college"
												name="employeeEducationalInfoBean[1].collegeName"
												class="form-control" placeholder="Enter College Name"
												type="text">
										</div>

									</div>
								</div>

								
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">University</span> <input
												id="university"
												name="employeeEducationalInfoBean[1].university"
												class="form-control" placeholder="Enter University Name"
												type="text">
										</div>

									</div>
								</div>

								
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">Year of Passout</span> <input
												id="yop" name="employeeEducationalInfoBean[1].yop"
												class="form-control" placeholder="Enter Year of Passout"
												type="text">
										</div>

									</div>
								</div>

								
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">Percentage</span> <input
												id="percentage"
												name="employeeEducationalInfoBean[1].percentage"
												class="form-control" placeholder="Enter Percentage"
												type="number">
										</div>

									</div>
								</div>

								
								<div class="form-group">
									<label class="control-label col-sm-4" for="prependedtext"></label>
									<div class="col-sm-4">
										<div class="input-group">
											<span class="input-group-addon">Location</span> <input
												id="location" name="employeeEducationalInfoBean[1].location"
												class="form-control" placeholder="Enter Location"
												type="text">
										</div>

									</div>
								</div>


							</fieldset>
						</div>
					</div>

				</div>
				<div class="card">
					<div class="card-header" id="headingSeven">
						<h2 class="mb-0">
							<button class="btn btn-link collapsed" type="button"
								data-toggle="collapse" data-target="#collapseSeven"
								aria-expanded="false" aria-controls="collapseSeven">
								Employee Experience Information 1</button>
						</h2>
					</div>
					<div id="collapseSeven" class="collapse"
						aria-labelledby="headingSeven" data-parent="#accordionExample">
						<div class="card-body">
							<fieldset>


								change col-sm-N to reflect how you would like your column spacing (http://getbootstrap.com/css/#forms-control-sizes)


								Form Name
								<legend>Employee Experience Details</legend>



								
								<div class="form-group">
									<label class="control-label col-sm-2" for="companyname"></label>
									<div class="col-sm-6">
										<div class="input-group">
											<span id="companynamePrepend" class="input-group-addon">Company
												Name</span> <input id="companyname"
												name="employeeExperienceInfoBean[0].employeeExperienceInfoPKBean.companyName"
												class="form-control" placeholder="Enter Company Name"
												type="text">

										</div>

									</div>
								</div>

								
								<div class="form-group">
									<label class="control-label col-sm-2" for="Designation"></label>
									<div class="col-sm-6">
										<div class="input-group">
											<span id="DesignationPrepend" class="input-group-addon">Designation</span>
											<input id="Designation"
												name="employeeExperienceInfoBean[0].designation"
												class="form-control" placeholder="Designation" type="text">

										</div>

									</div>
								</div>

								
								<div class="form-group">
									<label class="control-label col-sm-2" for="leavingdate"></label>
									<div class="col-sm-6">
										<div class="input-group">
											<span id="leavingdatePrepend" class="input-group-addon">Leaving
												Date</span> <input id="leavingdate"
												name="employeeExperienceInfoBean[0].leavingDate"
												class="form-control" placeholder="dd-mm-yyyy" type="date">

										</div>

									</div>
								</div>

								
								<div class="form-group">
									<label class="control-label col-sm-2"
										for="employeeExperienceInfoBean[0].joiningDate"></label>
									<div class="col-sm-6">
										<div class="input-group">
											<span id="joiningdatePrepend" class="input-group-addon">Joining
												Date</span> <input id="joiningdate" name="employeeExperienceInfoBean[0].joiningDate"
												class="form-control" placeholder="dd-mm-yyyy" type="date">

										</div>

									</div>
								</div>

							</fieldset>
						</div>
					</div>

				</div>
				<div class="card">
					<div class="card-header" id="headingEight">
						<h2 class="mb-0">
							<button class="btn btn-link collapsed" type="button"
								data-toggle="collapse" data-target="#collapseEight"
								aria-expanded="false" aria-controls="collapseEight">
								Employee Experience Information 2</button>
						</h2>
					</div>
					<div id="collapseEight" class="collapse"
						aria-labelledby="headingSix" data-parent="#accordionExample">
						<div class="card-body">
							<fieldset>




								<legend>Employee Experience Details</legend>


								
								<div class="form-group">
									<label class="control-label col-sm-2" for="companyname"></label>
									<div class="col-sm-6">
										<div class="input-group">
											<span id="companynamePrepend" class="input-group-addon">Company
												Name</span> <input id="companyname"
												name="employeeExperienceInfoBean[1].employeeExperienceInfoPKBean.companyName"
												class="form-control" placeholder="Enter Company Name"
												type="text">

										</div>

									</div>
								</div>

								
								<div class="form-group">
									<label class="control-label col-sm-2" for="Designation"></label>
									<div class="col-sm-6">
										<div class="input-group">
											<span id="DesignationPrepend" class="input-group-addon">Designation</span>
											<input id="Designation"
												name="employeeExperienceInfoBean[1].designation"
												class="form-control" placeholder="Designation" type="text">

										</div>

									</div>
								</div>

								
								<div class="form-group">
									<label class="control-label col-sm-2" for="leavingdate"></label>
									<div class="col-sm-6">
										<div class="input-group">
											<span id="leavingdatePrepend" class="input-group-addon">Leaving
												Date</span> <input id="leavingdate"
												name="employeeExperienceInfoBean[1].leavingDate"
												class="form-control" placeholder="dd-mm-yyyy" type="date">

										</div>

									</div>
								</div>

								
								<div class="form-group">
									<label class="control-label col-sm-2" for="joiningdate"></label>
									<div class="col-sm-6">
										<div class="input-group">
											<span id="joiningdatePrepend" class="input-group-addon">Joining
												Date</span> <input id="joiningdate"
												name="employeeExperienceInfoBean[1].joiningDate"
												class="form-control" placeholder="dd-mm-yyyy" type="date">

										</div>

									</div>
								</div>
						</div>
					</div>
			<div class="row">
				<div class="col-3">
					<br> <input type="submit" class="form-control"
						style="margin-left: 200px; background: lightseagreen"> </input>

				</div>
				<div class="col-3">
					<br> <input type="reset" class="form-control"
						style="margin-left: 280px; background: lightslategray"> </input>

				</div>
				</fieldset>

			</div>
		</div>

		</div>
</form>
		</div>
		</div>
		</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Employee</title>
</head>
<body>
	<div id="formdiv">
		<h1>Delete Employee</h1>
		<p>Use this form to confirm deletion of an employees.</p>
		<form:form method="post" modelAttribute="employee"
			action="${pageContext.request.contextPath}/employee/deleteProcess">
			<form:hidden path="employeeId" />
			<dl class="zend_form">
				<dt id="FirstName-label">
					<label for="FirstName" class="required">First Name:</label>
				</dt>
				<dd id="FirstName-element">
					<form:input path="firstName" readonly="true" disabled="true" />
				</dd>
				<dt id="LastName-label">
					<label for="LastName" class="required">Last Name:</label>
				</dt>
				<dd id="LastName-element">
					<form:input path="lastName" readonly="true" disabled="true" />
				</dd>
				<dt id="email-label">
					<label for="email" class="required">Email address:</label>
				</dt>
				<dd id="email-element">
					<form:input path="email" readonly="true" disabled="true" />
				</dd>
				<dt id="HireDate-label">
					<label for="HireDate" class="required">Hire Date:</label>
				</dt>
				<dd id="HireDate-element">
					<form:input path="hireDate" readonly="true" disabled="true" />
				</dd>

				<dt id="JobId-label">
					<label for="JobId" class="required">Job Title:</label>
				</dt>
				<dd id="JobId-element">
					<form:select path="job" items="${jobs}" itemValue="jobId"
						itemLabel="jobTitle" readonly="true" disabled="true" />
				</dd>
				<dt id="submit-label">&#160;</dt>
				<dd id="submit-element">
					<input type="submit" name="submit" id="submit"
						value="Delete Employee">
				</dd>
			</dl>
		</form:form>
	</div>
</body>
</html>

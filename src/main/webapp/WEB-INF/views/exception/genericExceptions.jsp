<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>Spring HRMS Company Portal</h1>
<h2>Oops Something Went Wrong, Please contact support.</h2>

<h3>Debug Information:</h3>

Requested URL= ${url}
<br>
<br>

Exception= ${exception.message}
<br>
<br>

<strong>Exception Stack Trace</strong>
<br>
<c:forEach items="${exception.stackTrace}" var="ste">
    ${ste}
</c:forEach>

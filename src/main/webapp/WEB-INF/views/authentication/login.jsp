<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<c:if test="${not empty error}">
	<div class="errorblock">
		Your login attempt was not successful, try again.<br /> Caused :
		${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
	</div>
</c:if>

<form name='f' action="<c:url value='/j_spring_security_check' />"
	method='POST'>

	<table>
		<tr>
			<td>User:</td>
			<td><input type='text' name='j_username' value=''></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type='password' name='j_password' /></td>
		</tr>
		<tr>
			<td colspan='2'><input name="submit" type="submit"
				value="submit" /></td>
		</tr>
		<tr>
			<td><input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" /></td>
		</tr>
	</table>

</form>
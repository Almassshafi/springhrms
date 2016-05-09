<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tilesx"
	uri="http://tiles.apache.org/tags-tiles-extras"%>

<tilesx:useAttribute name="activePage" />


<ul>
	<li><a href="<c:url value='/' />">Home</a></li>
	<li><a href="<c:url value='/employee' />">Employee
			Administration</a></li>
</ul>
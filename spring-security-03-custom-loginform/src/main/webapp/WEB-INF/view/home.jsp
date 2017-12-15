<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@page isELIgnored ="false"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SpringSecurity</title>
</head>
<body>
	<h1>This is the base application for spring security.</h1>
	<hr>
	Hurray, we just completed adding spring security initializers and configurations!
	<hr>
	<br/>
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
	<input type = "submit" value="logout">
</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	hi, how are you? ${message }
	<br>


	<a href="http://localhost:8080/SpringMVC/Pooja?dept=abc">Pooja</a>
	<a href="http://localhost:8080/SpringMVC/John?dept=pqr">John</a>
	<a href="http://localhost:8080/SpringMVC/Jack">Jack</a>
	<a href="http://localhost:8080/SpringMVC/Jill">Jill</a>
	<br>
	<br>


	<sf:form modelAttribute="employee" method="POST">
	ID:<sf:input path="id" />
		<sf:errors path="id" />
		<br>
	Name:<sf:input path="name" />
		<sf:errors path="name" />
		<br>
	E-mail:<sf:input path="email" />
		<sf:errors path="email" />
		<br>
		<input type="submit" value="Register">
	</sf:form>

	<br> Employees Registered
	<br>
	<c:forEach items="${list }" var="e">
		${e.id } :- ${e.name } - ${e.email }<br>

	</c:forEach>


</body>
</html>
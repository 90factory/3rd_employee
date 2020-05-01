<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
</h1>

<form action="/employeePractice/checkOut" method="post">
	phone : <input type="text" name="phone"> <br>
	
	
	<input type="submit" value="insert">
</form>
	
	
</body>
</html>

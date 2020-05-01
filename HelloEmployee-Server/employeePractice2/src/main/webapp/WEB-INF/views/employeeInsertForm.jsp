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

<form action="/employeePractice/employeeInsert" method="post">
	이름 : <input type="text" name="emName"> <br>
	position : <input type="text" name="emPosition"> <br>
	socialSecN : <input type="text" name="emSecurityNum"> <br>
	openTime : <input type="text" name="emOpenTime"> <br>
	closeTime : <input type="text" name="emCloseTime"> <br>
	startDate : <input type="text" name="emStartDate"> <br>
	endDate : <input type="text" name="emEndDate"> <br>
	status : <input type="text" name="emStatus"> <br>
	phone : <input type="text" name="emPhone"> <br>
	team :  <input type="text" name="emTeam"> <br>
	
	
	<input type="submit" value="insert">
</form>
	
	
</body>
</html>

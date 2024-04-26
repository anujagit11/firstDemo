<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<pre>
<form action="update">
name<input type="text" name="name" value="${stu.name}">
department<input type="text" name="department" value="${stu.department}">
username<input type="text" name="username" value="${stu.username}">
password<input type="text" name="password" value="${stu.password}">
<input type="hidden" name="id" value="${stu.id}">
<input type="submit" value="update">
</form>
</pre>
</body>
</html>
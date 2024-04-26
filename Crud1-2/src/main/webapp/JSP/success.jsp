<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.container 
{
width: 400 px;
height:400px;
    margin: 0 auto;
    padding: 20px;
    padding-left:470px;
   
    background-color:pink;
    border-radius: 5px;
    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
    margin-top: 100px;
}
</style>
</head>

<body>
${msg}
<div class="container">
<table border="2 px">
<tr>
<th>ID</th>
<th>Name</th>
<th>Department</th>
<th>Username</th>
<th>Password</th>
<th>Action</th>
</tr>
<c:forEach items="${data}" var="s">
<tr>
<td>${s.id}</td>
<td>${s.name}</td>
<td>${s.department}</td>
<td>${s.username}</td>
<td>${s.password}</td>
<td><a  href="delete?id=${s.id}">DELETE</a>||<a  href="edit?id=${s.id}">EDIT</a></td>
</tr>

</c:forEach>

</table>
<a href="search">search a record</a><br><br>
<a href="paging?pageNo=0">NEXT</a>||<a href="paging?pageNo=0">1</a>||<a href="paging?pageNo=1">2</a>||<a href="paging?pageNo=2">3</a>
||<a href="paging?pageNo=1">previous</a>
</div>
</body>
</html>
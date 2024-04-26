<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.container
{
width:270px;
height:350px;
border:4px;
padding:20px
background-color: #fff;
border-radius: 5px;
box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
    margin-top: 100px;
  text-align:center;}
input
{
width:100%
 padding: 10px;
    margin: 8px 0;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
input[type="submit"] {
background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    width: 100%;
    }
</style>
<body>
<center>
<div class="container">
<h2>Registrtion Form</h2>
<form action="save">

<label for="name">name:</label><br>
<input type="text" name="name" id="name" required="required"><br>

<label for="department">department</label><br>
<input type="text" name="department" id="department" required="required"><br>

<label for="username">Username</label><br>
<input type="text" name="username" id="username" required="required"><br>
<label for="password">Password</label><br>
<input type="password" name="password" id="password" required="required"><br>
<input type="submit" value="save">
</form>
</div>
</center>
</body>
</html>
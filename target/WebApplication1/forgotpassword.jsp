<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="changepassword" method="post">
<table align="center" style="color:red">
<tr>
<td  align="center"><b>Change Password</b></td>
</tr>

<tr>
<td>User Name</td>
<td><input type="text" name="username" required></td>
</tr>

<tr>
<td>New Password</td>
<td><input type="password" name="password" required></td>
</tr>

<tr>
<td>Confirm Password</td>
<td><input type="password" name="newpassword" required></td>
</tr>

<tr>
<td><input type="submit" value="Confirm" ></td>
</tr>
</form>
</body>
</html>
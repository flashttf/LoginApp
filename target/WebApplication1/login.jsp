<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">
<table align="center" style="color:red">
<tr>
<td  align="center"><b> LOGIN</b></td>
</tr>

<tr>
<td>User Name</td>
<td><input type="text" name="username" required></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password" required></td>
</tr>

<tr>
<td><input type="submit" value="Login" ></td>
</tr>

</table>
</form>
<td>
<a href="forgotpassword.jsp"><input type="submit" value="Forgot Password"></a>
</td>

</body>
</html>
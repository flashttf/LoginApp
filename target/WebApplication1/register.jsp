<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Registration Form</h1>
    <form action="register" method="post">
        <table cellpadding="3pt">
        <tr>
                <td>Name :</td>
                <td><input type="text" name="name" size="30" required/></td>
            </tr>
            <tr>
                <td>User Name :</td>
                <td><input type="text" name="userName" size="30" required/></td>
            </tr>
           
            <tr>
                <td>email :</td>
                <td><input type="text" name="email" size="30" required/></td>
            </tr>
            <tr>
                <td>Date of Birth :</td>
                <td><input type="text" name="dob" size="30" required/></td>
            </tr>
            <tr>
                <td>Phone Number :</td>
                <td><input type="text" name="phone" size="30" required/></td>
            </tr>
          
             <tr>
                <td>Password :</td>
                <td><input type="password" name="password" size="30" required/></td>
            </tr>
 
            <tr>
                <td>Confirm Password :</td>
                <td><input type="password" name="confirmpassword" size="30" required/></td>
            </tr>
        </table>
        <p />
        <td><input type="submit" value="Register" /></td>
        <td><input type="reset" value="reset"></td>
 	   </form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1>User Login</h1><br>
${SPRING_SECURITY_LAST_EXCEPTION.message}
<form action="login" method='POST'>
<h4>UserName :</h4>
<br>
<input type='text' name='userName' value=''><br><br>

<h4>Password :</h4>
<br>
<input type="password" name='passWord' value=''><br><br>

<input type="submit" name='submit' value='login'>

</form>
</body>
</html>
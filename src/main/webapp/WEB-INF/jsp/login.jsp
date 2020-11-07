<html>
<head>
<title> welcome to Login Page</title>
</head>
<body>
<h1>Welcome to Login Page</h1>

<div>
<p style="color:red">${loginMessageError}</p>
<div>
<div>
<form method="post">
Username:- <input type="text" name="username" id="username" placeholder="username"/>
Password:- <input type="password" name="password" id="password" placeholder="password"/>
<input type="submit" id="submit" name="submit"/>
</form>
</div>

<a href="/SignUp">Sign Up!</a>
<br><br>
</div>

</body>
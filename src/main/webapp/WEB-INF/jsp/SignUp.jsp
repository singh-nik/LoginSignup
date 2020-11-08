<html>
<head>
<title> welcome to SignUP Page</title>
</head>
<body>
<style>
.header {
  overflow: hidden;
  background-color: #f1f1f1;
  padding: 20px 10px;
}

/* Style the header links */
.header a {
  float: left;
  color: black;
  text-align: center;
  padding: 12px;
  text-decoration: none;
  font-size: 18px;
  line-height: 25px;
  border-radius: 4px;
}

/* Style the logo link (notice that we set the same value of line-height and font-size to prevent the header to increase when the font gets bigger */
.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

/* Change the background color on mouse-over */
.header a:hover {
  background-color: #ddd;
  color: black;
}

/* Style the active/current link*/
.header a.active {
  background-color: dodgerblue;
  color: white;
}

/* Float the link section to the right */
.header-right {
  float: right;
}

/* Add media queries for responsiveness - when the screen is 500px wide or less, stack the links on top of each other */
@media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }
  .header-right {
    float: none;
  }

}
Body {
  font-family: Calibri, Helvetica, sans-serif;
  background-color: pink;
}
button {
       background-color: #4CAF50;
       width: 50%;
        color: orange;
        padding: 15px;
        margin: 10px 0px;
        border: none;
        cursor: pointer;
         }
 form {
        border: 3px solid #f1f1f1;
    }
 input[type=text], input[type=password] {
        width: 50%;
        margin: 6px 0;
        padding: 12px 20px;
        display: inline-block;
        border: 2px solid green;
        box-sizing: border-box;
    }
 button:hover {
        opacity: 0.7;
    }
  .cancelbtn {
        width: auto;
        padding: 10px 18px;
        margin: 10px 5px;
    }


 .container {
        padding: 25px;
        background-color: lightblue;
    }
</style>
<div class="header">
  <a href="#default" class="logo">ToDo App</a>
  <div class="header-right">
    <a class="active" href="/login">Home</a>
    <a href="#contact">Contact</a>
    <a href="/login">Login</a>
  </div>
</div>

<div>
<h1>Welcome to SignUP Page</h1>
</div>
<div>
<p style="color:red">${errorMessage}</p>
</div>

<div>
<form class="container" method="post">
    <label>FirstName : </label>
    <input type="text" name="fname" id="fname" placeholder="fname" required/>
    </br>
    <label>LastName : </label>
    <input type="text" name="lname" id="lname" placeholder="lname" required/>
    </br>
    <label>Email : </label>
    <input type="text" name="email" id="email" placeholder="email" required/>
    </br>
    <label>Username : </label>
    <input type="text" name="username" id="username" placeholder="username" required>
    </br>
    <label>Password : </label>
    <input type="password" name="password" id="password" placeholder="password" required>
    <button  type="Register" id="Register" name="Register"/>Register</button>
</form>

 <div>
    <p>Already have an account? <a href="/login">GoToLogin</a>.</p>
  </div>

</div>
<style>
.footer {
  position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
  background-color: red;
  color: white;
  text-align: center;
}
</style>

<div class="footer">
  <p>Copyright by TodoApp</p>
</div>
</body
<html>
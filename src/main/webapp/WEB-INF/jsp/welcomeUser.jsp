<html>
<head>
<title>Sucess Full Login</title>
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
body {
 background-color: lightblue;
}
</style>
<div class="header">
  <a href="#default" class="logo">ToDo App</a>
  <div class="header-right">
    <a class="active" href="#deafult">Home</a>
    <a href="/listTodo">ToDoList</a>
    <a href="/login">Logout</a>
  </div>
</div>


<h1>Welcome to UserInfo  Page</h1>

<h3>Welcome ${name} !!!!</h3>
</br>
</br>
<div>
</br></br>
<div>
<a href="/AddToDo">GoToAddtoDoPage</a>
</div>

</br></br>

<a href="/login">Log Out</a>
<br><br>
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

</body>
</html>
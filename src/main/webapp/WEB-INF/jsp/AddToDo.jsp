<html>
<head>
<title> welcome to ToDo Page</title>
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
       width: 100%;
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
        width: 100%;
        margin: 8px 0;
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
    <a class="active" href="/AddToDo">Home</a>
    <a href="/listTodo">ToDoList</a>
    <a href="/login">Logout</a>
  </div>
</div>


<div>
<h1>Welcome to ToDo Page</h1>

</div>
<div>
<p>Hello ${name} Add your ToDo</p>
</div>
<div>
<p style="color:green">${sucess}</p>
</div>
<div>
<form  class="conatiner" method="post">
Add Title:- <input type="text" name="title" id="title" placeholder="title"/>
</br></br>
Add Description:-  <input type="text" name="desc" id="desc" placeholder="desc" size="100"/>
</br></br>
<button  type="Register" id="Register" name="Register"/>ADD</button>
</form>
<div>
    <p><a href="/listTodo">Check Todo</a></p>
  </div>
</br> </br>

</div>



 <div>
    <p><a href="/login">Logout</a></p>
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
</html>
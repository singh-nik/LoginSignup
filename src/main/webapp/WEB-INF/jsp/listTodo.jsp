<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title> welcome to ToDo Page</title>
</head>

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
 th
    {
      background: orange;
      height:30px;
    }
    table,th,td
    {
      border:2px solid green;
    }
    table
    {
      width:30%;
      color:black;
      text-align:center;
    }
    body {
     background-color: lightblue;
    }
    .button {
      color: red;

    }
</style>
<div class="header">
  <a href="#default" class="logo">ToDo App</a>
  <div class="header-right">
    <a class="/welcomeUser" href="/AddToDo">Home</a>
    <a href="/AddToDo">AddToDo</a>
    <a href="/login">logout</a>
  </div>
</div>



<body>
<script>
function SomeDeleteRowFunction() {
      // event.target will be the input element.
      var td = event.target.parentNode;
      var tr = td.parentNode; // the row to be removed
      tr.parentNode.removeChild(tr);
}

</script>

<div>
<h1 align="center">Welcome to listToDo Page</h1>
<div>
<table border="1" cellpadding="5" align="center">
<caption><h2>ToDo List</h2></caption>
<tr>
<th>Title</th>
<th>Description</th>
<th>Date</th>
<th>Delete</th>
</tr>
<c:forEach items="${mytable}" var="mapItem">
<tr>
<th>${mapItem.key}</th>
<th>${mapItem.value}</th>
<th> <%= (new java.util.Date()).toLocaleString()%></th>
<th><input type="button" value="Delete" onclick="SomeDeleteRowFunction()"></th>
</tr>
</c:forEach>
</div>
</table>
</div>
<p>Back to Add TODO!!!<a href="/AddToDo">GoToHOME</a>.</p>
<div>
</div>
<p>Logout!!!<a href="/login">logout</a>.</p>
<div>

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
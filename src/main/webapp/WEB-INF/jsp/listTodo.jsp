<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title> welcome to ToDo Page</title>
</head>
<body>
<div>
<h1>Welcome to lisTodo Page</h1>
<div>
<table border="1" cellpadding="5">
<caption><h2>List Of ToDo</h2></caption>

<tr>
<th>Title</th>
<th>Description</th>
</tr>
<c:forEach var="todo" items=${lisTodo}">
<tr>
<th>${title}</th>
<th>${desc}</th>
</tr>

</div>

</body
</html>
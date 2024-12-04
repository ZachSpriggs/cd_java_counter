<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current visit count</title>
</head>
<body>

	<center> 
	<h1>You have visited <a href = "/">localhost:8080 </a> <c:out value = "${counter}"/> times.</h1>
	<a href = "/">Test this again?</a>
	<a href = "/reset">Reset The Counter</a>
	</center>

</body>
</html>
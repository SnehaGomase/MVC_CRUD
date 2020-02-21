<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome to update page</title>
</head>
<body>
<form action="update2">
<pre>
<input type="hidden" name="sid" value="${data.sid }"><br>
NAME:<input type="text" name="sname" value="${data.sname }"><br>
ADDRESS:<input type="text" name="saddr" value="${data.saddr }"><br>
USERNAME:<input type="text" name="username" value="${data.username }"><br>
PASSWORD:<input type="password" name="password" value="${data.password }"><br>
<input type="submit" value="Update"><br>
<input type="text" name="a" value="<%=request.getParameter("a")%>">
<input type="text" name="b" value="<%=request.getParameter("b")%>">

</pre>
</form>
</body>
</html>
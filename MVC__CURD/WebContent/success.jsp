<%@page import="com.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome To Success Page</title>
<script type="text/javascript">
function DeletData() 
{
	alert("delet")
	document.mvc.action="delet123";
	document.mvc.submit();
}
function UpdateData() 
{
	alert("update")
	document.mvc.action="update123";
	document.mvc.submit();
}

function AddData() 
{
	alert("add")
	document.mvc.action="register.jsp";
	document.mvc.submit();
}
</script>
</head>
<body>
<form name="mvc">
<h1>Success Page</h1>
<h3>Data in table format</h3>
<table border="5x">
<tr>
<th>sid</th>
<th>sname</th>
<th>saddr</th>
<th>username</th>
<th>password</th>
</tr>
<tr>
<%List<Student> list=(List)request.getAttribute("LIST");
for(Student stu:list)
{%>
<td><input type="radio" name="sid" value="<%=stu.getSid()%>" ></td>
<td><%=stu.getSname() %></td>
<td><%=stu.getSaddr() %></td>
<td><%=stu.getUsername() %></td>
<td><%=stu.getPassword() %></td>
</tr>
<%} %>
<tr>
<td><input type="submit" value="Delet" onclick=" DeletData() ">
<input type="submit" value="Update" onclick="UpdateData() ">
<input type="submit" value="Add" onclick="AddData()">
</td>
</tr>
</table>
<input type="text" name="a" value="<%=request.getAttribute("USERNAME")%>">
<input type="text" name="b" value="<%=request.getAttribute("PASSWORD")%>">
</form>
</body>
</html>
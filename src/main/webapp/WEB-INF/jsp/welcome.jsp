<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<title>Leave Management Portal</title>
</head>




<body>
<h1>
You have Logged in as User: ${name}
</h1>

<ul>
  <li><a href="/leavemanagement/create-user">Create User</a>   </li>
  <li><a href="/leavemanagement/create-leave-request">Create Leave Request</a></li>
  <li><a href="/leavemanagement/list-leave-requests">View Requests</a></li>
</ul>

<br/>
<br/>

<a href="/leavemanagement/login">  BACK <a/>



</body>

</html>
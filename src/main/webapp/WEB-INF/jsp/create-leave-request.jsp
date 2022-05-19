<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<title>Leave Management Portal</title>
</head>




<body>
<h1>
<p><h2><a href="/leavemanagement/welcome">Home</a><strong>CREATE LEAVE REQUEST</strong></p></h2>
<form >
  <label for="Leave_start_date">Leave Start Date:</label><br>
  <input type="text" id="Leave_start_date" name="Leave_start_date"><br>
  
  <label for="leave_end_date">Leave End Date:</label><br>
  <input type="text" id="leave_end_date" name="leave_end_date"><br>
  
  <label for="leave_status">Leave Statuse:</label><br>
  <input type="email" id="leave_status" name="leave_status"><br>
  
  <label for="request_date">Request Date:</label><br>
  <input type="text" id="request_date" name="request_date"><br>
  
  <label for="approver_date">Approver Date:</label><br>
  <input type="approver_date" id="passord" name="approver_date"><br>
  
  <label for="user_id">User ID:</label><br>
  <select type="text" id="user_id" name="user_id"><br>
  
  <label for="leave_approver">Leave Approver:</label><br>
  <Select name="leave_approver">
  
  			<option> value ="">Select Approver</option>
  <br>
  
  <input type="submit" />
</form>


</body>

<a href="/leavemanagement/welcome">  BACK <a/>

</html>

</html>
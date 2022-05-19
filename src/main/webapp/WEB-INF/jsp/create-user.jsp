<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<title>Leave Management Portal</title>
</head>




<body>
<h1>
<p><h2><a href="/leavemanagement/welcome">Home</a><strong>CREATE USER</strong></p></h2>



<div class="form-group">

<label for="" class="col-sm-2" control-label style=""color: #009900">First Name</label>
<div class="col-sm-10">

  <input name="firstname" type="text" class="form-control" placeholder="First Name" required>
</div>

</div>

<div class="form-group">

<label for="" class="col-sm-2" control-label style=""color: #009900">Last Name</label>
<div class="col-sm-10">

  <input name="lastname" type="text" class="form-control" placeholder="Last Name" required>
</div>

</div>

<div class="form-group">

<label for="" class="col-sm-2" control-label style=""color: #009900">Email Address</label>
<div class="col-sm-10">

  <input name="email" type="text" class="form-control" placeholder="Email Address" >
</div>

</div>
<hr>

<div class="alert-danger">&nbsp;EMPLOYEE LOGIN INFORMATION</div>
<hr>

<div class="form-group">

<label for="" class="col-sm-2" control-label style=""color: #009900">Username</label>
<div class="col-sm-10">

  <input name="username" type="text" class="form-control" placeholder="Username" required>
</div>

</div>

<div class="form-group">

<label for="" class="col-sm-2" control-label style=""color: #009900">Password </label>
<div class="col-sm-10">

  <input name="password" type="text" class="form-control" placeholder="Password" required>
</div>

</div>


<div class="form-group">

<label for="" class="col-sm-2" control-label style=""color: #009900">Confirm Password </label>
<div class="col-sm-10">

  <input name="cpassword" type="text" class="form-control" placeholder="Confirm Password" required>
</div>

</div>


<div align="right">
<div class="box-footer">
<button name="emp" type="submit" class="btn btn-success btn-flat"><i class="fa fa-save">&nbsp;SAVE</i></button>
</div></div>

</body>

<a href="/leavemanagement/welcome">  BACK <a/>

</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<title>Leave Management Portal</title>
</head>

<body>
<hr>
    Here are the list of all leave Requests:
    ${leave_requests}
    
    <hr>
    
    <table id="example1" class ="table table-bordered table-striped">
    <thead>
    <tr>
    <th> <input type="checkbox" id="select_all"/></th>
    <th>REQUEST ID</th>
    <th>START DATE</th>
    <th>END DATE</th>
    <th>STATUS</th>
    <th>REQUEST DATE</th>
    <th>APPROVER DATE</th>
    <th>EMPLOYEE</th>
    <th>APPROVED BY</th>
    </tr>
    
    </thead>
    </table>
    
    <br>



    Your Name is: ${name}
</body>

</html>
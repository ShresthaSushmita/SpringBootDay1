<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Edit page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container">
  <h2>Edit Form</h2>
  <form action="employeeUpdate" method="post">
      <div class="form-group">
        <label for="employeeId">Employee Id:</label>
        <input type="text" class="form-control"  value=${employeeDTO.employeeId} name="employeeId" readonly>
      </div>
      <div class="form-group">
        <label for="employeeName">Employee Name:</label>
        <input type="text" class="form-control"  value=${employeeDTO.employeeName} name="employeeName">
      </div>
      <div class="form-group">
        <label for="salary">Salary:</label>
        <input type="text" class="form-control"  value=${employeeDTO.salary} name="salary">
      </div>
      <div class="form-group">
         <label for="emailId">Email Address:</label>
         <input type="text" class="form-control"  value=${employeeDTO.emailId} name="emailId">
      </div>
      <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" class="form-control" value=${employeeDTO.password} name="password">
      </div>
      <button type="Register" class="btn btn-primary">Update</button>
  </form>
  </div>
</body>
</html>

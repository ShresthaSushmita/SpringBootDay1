<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Registration page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container">
  <h2>Registration Form</h2>
  <img src="images/login.jpeg" alt="login page">

  <form action="registerValidate" method="post">
      <div class="form-group">
        <label for="employeeId">Employee Id:</label>
        <input type="text" class="form-control"  placeholder="Enter employee id" name="employeeId">
      </div>
      <div class="form-group">
        <label for="employeeName">Employee Name:</label>
        <input type="text" class="form-control"  placeholder="Enter employee name" name="employeeName">
      </div>
      <div class="form-group">
        <label for="salary">Salary:</label>
        <input type="text" class="form-control"  placeholder="Salary" name="salary">
      </div>
      <div class="form-group">
         <label for="emailId">Email Address:</label>
         <input type="text" class="form-control"  placeholder="Enter email address" name="emailId">
      </div>
      <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" class="form-control" placeholder="Enter password" name="password">
      </div>
      <button type="Register" class="btn btn-primary">Submit</button>
      <button type="reset" class="btn btn-danger">Reset</button>
  </form>
  </div>
</body>
</html>

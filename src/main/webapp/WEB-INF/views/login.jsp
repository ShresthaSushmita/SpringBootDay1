<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>login page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="css/global.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container">
  <h2>Login Form</h2>
  <img src="images/login.jpeg" alt="login page">
  <h4>${message}</h4>
  <form action="loginValidate" method="post">
      <div class="form-group">
        <label for="emailId">Email Address:</label>
        <input type="text" class="form-control"  placeholder="Enter email address" name="emailId">
      </div>
      <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" class="form-control" placeholder="Enter password" name="password">
      </div>
      <div>

      <button type="submit" class="btn btn-primary" id="regg">Submit</button>
      <a href="/register"><p type="register" class="btn btn-danger"  id="reg">Register</p></a>
      </div>
  </form>
  </div>
</body>
</html>

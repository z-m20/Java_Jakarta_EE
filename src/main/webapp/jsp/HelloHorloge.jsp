<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Horloge JSP</title>
</head>
<body>
  <h1>Bienvenue, on est le <%= request.getAttribute("Date and Time") %> </h1>
</body>
</html>
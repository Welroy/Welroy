<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Categories</title>
</head>
<body>
<%@include file="header.jsp" %>

<h1>Add Product</h1>

  <form:form method="post" action="addProduct">
    Name: <input type="text" name="name" /> 
    Price: <input type="text" name="price" />
    <button>Add Product</button>
  </form:form>
  
</body>
</html>

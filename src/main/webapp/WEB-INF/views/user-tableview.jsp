<%@page language="java" contentType="text/html; charset=ISO-8859-1" 
  pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <html>
  	<head>
  	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  	<title>Insert title here.</title>
  	<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet">
  	<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
  	</head>
  		<body>
  		<center><h1>User Detail</h1></center>
		<a type="button" class="btn btn-success btn-lg" href="${pageContext.request.contextPath}/user/create">
		<b>New User</b>
		</a>
		
  		<table class="table table-striped">
  		<tr>
  			
 		<td><b>User Name</b></td>
 		<td><b>User Gender</b></td>
 		<td><b>User Type</b></td>
 		<td><b>User Course</b></td>
 		<td><b>User RollNo.</b></td>
 		<td><b>User Email</b></td>
 		<td><b>User Enable</b></td>
 		<td><b>Action</b></td>
 		</tr>
  			
  				
 	<c:forEach items="${requestScope.user}" var="u">
  	<tr>
  	 
	 <td>${u.firstname} ${u.middlename} ${u.lastname}</td>
	 <td>${u.gender }</td>
	 <td>${u.type }</td>
	 <td>${u.course }</td>
	 <td>${u.rollno}</td>
	 <td>${u.email }</td>
	 <td>${u.enabled }</td>
	 
	 
 	<td>
 	<a class="btn btn-success btn-lg" href="${pageContext.request.contextPath}/register/edit/${u.id}">Edit</a>
  	<a class="btn btn-danger btn-lg" href="${pageContext.request.contextPath}/register/delete/${u.id}">Delete</a>
  	
 	</td>
 	</tr>
 	</c:forEach>
  			
  	</table>
  
 		</body>
  </html>

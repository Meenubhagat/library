<%@ include file="common/header.jsp"%>

  		<center><h1>User Detail</h1></center>
		<a type="button" class="btn btn-success btn-sm" href="${pageContext.request.contextPath}/user/create">
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
 	<a class="btn btn-success btn-sm" href="${pageContext.request.contextPath}/user/edit/${u.id}">Edit</a>
  	<a class="btn btn-danger btn-sm" href="${pageContext.request.contextPath}/user/delete/${u.id}">Delete</a>
  	
 	</td>
 	</tr>
 	</c:forEach>
  			
  	</table>
  
 		</body>
 		<%@ include file="common/footer.jsp"%>
  </html>

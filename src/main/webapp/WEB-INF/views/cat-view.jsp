<%@ include file="common/header.jsp"%>

  		<center><h1>Category Detail</h1></center>
		<a type="button" class="btn btn-success btn-lg">
		<b>New User</b>
		</a>
		
  		<table class="table table-striped">
  		<tr>
  			
 		<td><b>Category Id</b></td>
 		<td><b>Name</b></td>
 		<td><b>Parent Id</b></td>
 		<td><b>Action</b></td>
 		</tr>
  			
  				
 	<c:forEach items="${requestScope.user}" var="c">
  	<tr>
  	 
	 <td>${c.categoryid}</td>
	 <td>${c.name }</td>
	 <td>${c.parentid }</td>
	 
	 
 	<td>
 	<a class="btn btn-success btn-lg">Edit</a>
  	<a class="btn btn-danger btn-lg">Delete</a>
  	
 	</td>
 	</tr>
 	</c:forEach>
  			
  	</table>
  
 		</body>
  </html>
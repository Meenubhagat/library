<%@ include file="common/header.jsp"%>

  		<center><h1>Category Detail</h1></center>
		<a type="button" class="btn btn-success btn-sm" href="${pageContext.request.contextPath}/book/issue">
		<b>New User</b>
		</a>

  		<table class="table table-striped">
  		<tr>
  			
 		<td><b>Issued Id</b></td>
 		<td><b>User Id</b></td>
 		<td><b>Book Name</b></td>
 		<td><b>Action</b></td>
 		</tr>
  			
  				
 	<c:forEach items="${requestScope.issuedbooks}" var="i">
  	<tr>
  	 
	 <td>${i.id}</td>
	 <td>${i.userid}</td>
	 <td>${i.bookid}</td>
	 
	 
 	<td>
 	<a class="btn btn-success btn-sm" href="${pageContext.request.contextPath}/book/editissuebook/${i.id}">Edit</a>
  	<a class="btn btn-danger btn-sm" href="${pageContext.request.contextPath}/book/deleteissuebook/${i.id}">Delete</a>
  	
 	</td>
 	</tr>
 	</c:forEach>
  			
  	</table>
  
 		</body>
 		<%@ include file="common/footer.jsp"%>
  </html>

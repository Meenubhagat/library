<%@ include file="common/header.jsp"%>

  		<center><h1>Category Detail</h1></center>
		<a type="button" class="btn btn-success btn-sm" href="${pageContext.request.contextPath}/cat/create">
			<b>New Category</b>
		</a>
		<br/><br/>
  		<table class="table table-striped">
  		<tr>
  			
 		<td><b>Category Id</b></td>
 		<td><b>Name</b></td>
 		<td><b>Parent Category</b></td>
 		<td><b>Action</b></td>
 		</tr>
  			
  				
 	<c:forEach items="${requestScope.category}" var="c">
  	<tr>
  	 
	 <td>${c.id}</td>
	 <td>${c.name}</td>
	 <td>${c.parentcategory}</td>
 	<td>

 	<a class="btn btn-success btn-sm" href="${pageContext.request.contextPath}/cat/edit/${c.id}">Edit</a>
  	<a class="btn btn-danger btn-sm" href="${pageContext.request.contextPath}/cat/delete/${c.id}">Delete</a>
  	
 	</td>
 	</tr>
 	</c:forEach>
  			
  	</table>
  
 		</body>
 		<%@ include file="common/footer.jsp"%>
  </html>

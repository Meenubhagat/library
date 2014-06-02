<%@ include file="common/header.jsp"%>

  		<center><h1>Category Detail</h1></center>
		<a type="button" class="btn btn-success btn-sm" href="${pageContext.request.contextPath}/book/issue">
		<b>New User</b>
		</a>

  		<table class="table table-striped">
  		<tr>
  			
 		<td><b>Issued Id</b></td>
	    <td><b>Book Name</b></td>
	    <td><b>Issued By</b></td>
	    <td><b>Category</b></td>
 		<td><b>Action</b></td>
 		</tr>

 	<c:forEach items="${requestScope.issuedbooks}" var="i">
  	<tr>
	
	 <td>${i.issueid}</td>
	 <td>${i.issuebook}</td>
	 <td>${i.username}</td>
	 <td>${i.category}</td>
	 
	 <td>
 	<a class="btn btn-success btn-sm" >Return</a>
  	<a href="${pageContext.request.contextPath}/book/issuedbookdetail/${i.issueid}" class="btn btn-danger btn-sm" >Detail</a>
 	</td>

 	</tr>
 	</c:forEach>
  			
  	</table>
  
 		</body>
 		<%@ include file="common/footer.jsp"%>
  </html>

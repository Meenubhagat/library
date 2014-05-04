<%@ include file="common/header.jsp"%>

<center><h1>Books Detail</h1></center>
<a type="button" class="btn btn-success btn-sm"><b>New User</b></a>

<table class="table table-striped">
  	<tr>
  	<td><b>Book Name</b></td>
  	<td><b>Book Code</b></td>
  	<td><b>Book Author</b></td>
  	<td><b>Book price</b></td>
  	<td><b>Rack Number</b></td>
  	<td><b>Date of Arrival</b></td>
  	<td><b>Category Id</b></td>	
  	<td><b>Action</b></td>
  	</tr>
  	
  	<c:forEach items="${requestScope.book}" var="b">
  	<tr>
	 <td>${b.name}</td>
	 <td>${b.code}</td>
	 <td>${b.author}</td>
	 <td>${b.price}</td>
	 <td>${b.rackno}</td>
	 <td>${b.date}</td>
	 <td>${b.c_id }</td>
 	<td>
 	<a class="btn btn-success btn-sm">Edit</a>
  	<a class="btn btn-danger btn-sm">Delete</a>
 	</td>
 	</tr>
 	</c:forEach>
  			
  		
</table>
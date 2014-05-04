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
  	</tr>
  	
  	<c:forEach items="${requestScope.book}" var="b">
  	<tr>
	 <td>${b.book_name}</td>
	 <td>${b.book_code}</td>
	 <td>${b.book_author}</td>
	 <td>${b.book_price}</td>
	 <td>${b.book_rackno}</td>
	 <td>${b.date_of_arrival}</td>
	 <td>${b.categoryid }</td>
 	<td>
 	<a class="btn btn-success btn-sm">Edit</a>
  	<a class="btn btn-danger btn-sm">Delete</a>
 	</td>
 	</tr>
 	</c:forEach>
  			
  		
</table>
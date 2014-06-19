<%@ include file="common/header.jsp"%>

<center><h1>Books Detail</h1></center>
<a type="button" class="btn btn-success btn-sm" href="${pageContext.request.contextPath}/book/create"><b>New Book</b></a>
<br/>
<br/>

<table class="table table-striped">

  	<tr>
  	<td><b>Book Id</b></td>
  	<td><b>Book Name</b></td>
  	<td><b>Book Code</b></td>
  	<td><b>Book Author</b></td>
  	<td><b>Book price</b></td>
  	<td><b>Rack Number</b></td>
  	<td><b>Date of Arrival</b></td>
  	<td><b>Category Id</b></td>	
  	<td><b>Action</b></td></tr>
  	
  	<c:forEach items="${requestScope.books}" var="b">
  	<tr>
  	  <td>${b.id}</td>
	 <td>${b.bName}</td>
	 <td>${b.bCode}</td> 
	 <td>${b.bAuthor}</td>
	 <td>${b.bPrice}</td>
	 <td>${b.bRackno}</td>
	 <td>${b.bDateOfArrival}</td>
	 <td>${b.bookcategory }</td>
 	<td>
 	<a class="btn btn-success btn-sm" href="${pageContext.request.contextPath}/book/edit/${b.id}">Edit</a>
  	<a class="btn btn-danger btn-sm" href="${pageContext.request.contextPath}/book/delete/${b.id}">Delete</a>
 	</td>
 	</tr>
 	</c:forEach>
  			
  		
</table>
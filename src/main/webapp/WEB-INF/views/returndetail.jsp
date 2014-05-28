<%@ include file="common/header.jsp"%>

<center><h1>Issued Books Detail</h1></center>


<table class="table table-striped">

  	<td><b></b></td>
  
  	
  	<c:forEach items="${requestScope.book}" var="b">
  	
	
	<tr><b>Issued Id</b>${i.id}</tr>
 	<tr><b>User Id</b>${i.issueid}</tr>
	<tr><b>Issued By</b>${i.username}</tr>
 	</c:forEach>
  			
  		
</table>
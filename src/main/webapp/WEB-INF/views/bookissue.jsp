<%@ include file="common/header.jsp"%>

<form class="form-horizontal" action="booksaved" method="post">
	<fieldset>  
      	<legend style="margin:0;padding:10px; text-align:center;"> <b>Issue Book Information </b></legend><br>
      	<div class="form-group">
 		<label for="inputissueid" class="col-sm-2 control-label">Issue Id</label>
    	<div class="col-sm-4">
        <input type="text" class="form-control" id="issue_id" placeholder="Enter issue id" name="id" value="${book.id}">
   		</div>
 		</div>
 	
 		<div class="form-group">
    	<label for="inputcid" class="col-sm-2 control-label">User Id</label>
    	<div class="col-xs-4">
     	<select class="form-control" id="userid" name="userid">
		<c:forEach items="${users}" var="u">
   		<option value="${u.id}">${u.firstname} ${u.middlename} ${u.lastname}
   		</option>
		</c:forEach>
		</select>
   		</div>
  		</div>
      		
     	<div class="form-group">
    	<label for="inputcid" class="col-sm-2 control-label">Book</label>
    	<div class="col-xs-4">
     	<select class="form-control" id="bookid" name="bookid">
		<c:forEach items="${books}" var="b">
   		<option value="${b.id}">${b.name}
   		</option>
		</c:forEach>
		</select>
   		</div>
  		</div>
  
  		 <div class="col-xs-4">
  	 	<center><button type="submit" class="btn btn-success btn-sm">Save</button>
  	 	<button type="button" class="btn btn-danger btn-sm">Cancel</button></center>
  	 	</div>
     	</fieldset> 		

</form>
</body>
<%@ include file="common/footer.jsp"%>
</html>
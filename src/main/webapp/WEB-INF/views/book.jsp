<%@ include file="common/header.jsp"%>

<form class="form-horizontal" action="${pageContext.request.contextPath}/book/save" method="post">
	<fieldset>  
      	<legend style="margin:0;padding:10px; text-align:center;"> <b>Books Information </b></legend><br>
      	<div class="form-group">
 		<label for="inputbookid" class="col-sm-2 control-label">Book Id</label>
    	<div class="col-xs-4"><span class="add-on"><i class="icon-user"></i></span>
     	<input type="text" class="form-control" id="book_id" name="id" placeholder="Enter Book Id" value="${book.id }">
   		</div>
 		</div>
 		
 		<div class="form-group">
 		<label for="name" class="col-sm-2 control-label">Book Name</label>
    	<div class="col-xs-4"><span class="add-on"><i class="icon-user"></i></span>
     	<input type="text" class="form-control" id="book_name" name="name" placeholder="Enter Book Name" value="${book.name}">
   		</div>
 		</div>	
      		
      	<div class="form-group">
      	<label  class="col-sm-2 control-label">Book Code</label>
       	<div class="col-sm-4">
        <input type="text" class="form-control" id="book_code" placeholder="Book Code" name="code"  value="${book.code }">
        </div>
        </div>   
     
        
        <div class="form-group">
  	    <label for="inputauthor" class="col-sm-2 control-label">Book Author</label>
  	    <div class="col-sm-4">
        <input type="text" class="form-control" id="book_author" placeholder="Enter Book Author" name="author"  value="${book.author}">
        </div>
  	    </div>
  	      
  	    <div class="form-group">
 		<label for="inputprice" class="col-sm-2 control-label">Book Price</label>
    	<div class="col-xs-4"><span class="add-on"><i class="icon-user"></i></span>
     	<input type="text" class="form-control" id="book_price" name="price" placeholder="Enter Book Price"  value="${book.price}">
   		</div>
 		</div>	 
	
		   
  	    <div class="form-group">
 		<label for="inputrackno" class="col-sm-2 control-label">Rack No.</label>
    	<div class="col-xs-4"><span class="add-on"><i class="icon-user"></i></span>
     	<input type="text" class="form-control" id="book_rackno" name="rackno" placeholder="Enter Rack no"  value="${book.rackno}">
   		</div>
 		</div>
 	
 		<div class="form-group">
    	<label for="inputcid" class="col-sm-2 control-label">Category Id</label>
    	<div class="col-xs-4">
     	<select class="form-control" id="c_id" name="c_id">
		<c:forEach items="${category}" var="cat">
   		<option value="${cat.id}"
    	<c:if test="${(cat.id == book.c_id)}">
      	selected="selected"
     	</c:if>>
   		${cat.name}
   		</option>
		</c:forEach>
		</select>
   		</div>
  		</div>
  		
 		<div class="form-group">
    	<label for="inputdate" class="col-sm-2 control-label">Date of Arrival</label>
    	<div class="col-xs-10">
    	<input type="date" id="date" name="date"  value="${book.date}"></input>
    	</div>
   		</div><br><br>
	
  		 <div class="col-xs-4">
  	 	<center><button type="submit" class="btn btn-success btn-sm">Save</button>
  	 	  <a type="button" class="btn btn-warning" href="${pageContext.request.contextPath}/book/booklist">
      <b>Cancel</b>
		</a>
  	 	
  	 	</div>
     	</fieldset> 		

</form>
</body>
<%@ include file="common/footer.jsp"%>
</html>
<%@ include file="common/header.jsp"%>

<form class="form-horizontal" action="http://localhost:8080/librarymgt/book/save" method="post">
	<fieldset>  
      	<legend style="margin:0;padding:10px; text-align:center;"> <b>Books Information </b></legend><br>
      	<div class="form-group">
 		<label for="inputbookid" class="col-sm-2 control-label">Book Id</label>
    	<div class="col-xs-4"><span class="add-on"><i class="icon-user"></i></span>
     	<input type="text" class="form-control" id="book_id" name="bookid" placeholder="Enter Book Id" value="${book.bookid }">
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
    	<label for="id" class="col-sm-2 control-label">Category Id</label>
    	<div class="col-xs-4">
    	<input type="text" class="form-control" id="id" placeholder="Enter Id" name="c_id"  value="${book.c_id }">
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
  	 	<button type="button" class="btn btn-danger btn-sm">Cancel</button></center>
  	 	</div>
     	</fieldset> 		

</form>
</body>
<%@ include file="common/footer.jsp"%>
</html>
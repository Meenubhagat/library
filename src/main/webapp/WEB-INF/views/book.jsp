<%@ include file="common/header.jsp"%>

<form class="form-horizontal" action="save" method="post">
	<fieldset>  
      	<legend style="margin:0;padding:10px; text-align:center;"> <b>Books Information </b></legend><br>
      	<div class="form-group">
 		<label for="inputbookid" class="col-sm-2 control-label">Book Id</label>
    	<div class="col-xs-4"><span class="add-on"><i class="icon-user"></i></span>
     	<input type="text" class="form-control" id="book_id" name="book_id" placeholder="Enter Book Id" value="${book.book_id }">
   		</div>
 		</div>
 		
 		<div class="form-group">
 		<label for="name" class="col-sm-2 control-label">Book Name</label>
    	<div class="col-xs-4"><span class="add-on"><i class="icon-user"></i></span>
     	<input type="text" class="form-control" id="book_name" name="book_name" placeholder="Enter Book Name" value="${book.book_name}">
   		</div>
 		</div>	
      		
      	<div class="form-group">
      	<label  class="col-sm-2 control-label">Book Code</label>
       	<div class="col-sm-4">
        <input type="text" class="form-control" id="book_code" placeholder="Book Code" name="book_code"  value="${book.book_code }">
        </div>
        </div>   
     
        
        <div class="form-group">
  	    <label for="inputauthor" class="col-sm-2 control-label">Book Author</label>
  	    <div class="col-sm-4">
        <input type="text" class="form-control" id="book_author" placeholder="Enter Book Author" name="book_author"  value="${book.book_author}">
        </div>
  	    </div>
  	      
  	    <div class="form-group">
 		<label for="inputprice" class="col-sm-2 control-label">Book Price</label>
    	<div class="col-xs-4"><span class="add-on"><i class="icon-user"></i></span>
     	<input type="text" class="form-control" id="book_price" name="book_price" placeholder="Enter Book Price"  value="${book.book_price}">
   		</div>
 		</div>	 
	
		   
  	    <div class="form-group">
 		<label for="inputrackno" class="col-sm-2 control-label">Rack No.</label>
    	<div class="col-xs-4"><span class="add-on"><i class="icon-user"></i></span>
     	<input type="text" class="form-control" id="book_rackno" name="book_rackno" placeholder="Enter Rack no"  value="${book.book_rackno}">
   		</div>
 		</div>
 		
 		<div class="form-group">
    	<label for="id" class="col-sm-2 control-label">Category Id</label>
    	<div class="col-xs-4">
    	<input type="text" class="form-control" id="id" placeholder="Enter Id" name="categoryid"  value="${book.categoryid }">
    	</div>
 		</div>	 
 		
 		<div class="form-group">
    	<label for="inputdate" class="col-sm-2 control-label">Date of Arrival</label>
    	<div class="col-xs-10">
    	<input type="date" id="date_of_arrival" name="date"  value="${book.date }"></input>
    	
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
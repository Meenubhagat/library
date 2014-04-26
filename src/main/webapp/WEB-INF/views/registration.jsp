<%@ include file="common/header.jsp"%>

<fieldset>  
    <legend style="margin:0;padding:10px; text-align:center;"> <b>Create an Account </b></legend><br>
	<div class="container">
    	<div class="row">
			<div class="col-md-4 col-md-offset-4">
    		
	<div class="panel-heading">
	<h1 class="panel-title">Please Register Here</h1>
	</div>
	
	<div class="panel-body">
	<form accept-charset="UTF-8" action="save" method="post" >
                    
	<div class="form-group">
		<input class="form-control" placeholder="Enter Name" name="firstname" type="text" id="user_firstname" value="${user.firstname }">
	</div>
			    		
	<div class="form-group">
	<input class="form-control" placeholder="Enter E-mail" name="email" type="text" id="email" value="${user.email }">
	</div>
			    		
	<div class="form-group">
	<input class="form-control" placeholder="Re-Enter E-mail" name="email" type="email" id="email" value="${user.email }">
	</div>
			    		
	<div class="form-group">
	<input class="form-control" placeholder="Password" name="password" type="password" id="password" value="${user.password }">
	</div>
			    	
	<input class="btn btn-lg btn-success btn-block" type="submit" value="Register">
			    	
	</form>
	</div>
	</div>
	</div>
	</div>

 
 
  
</fieldset>

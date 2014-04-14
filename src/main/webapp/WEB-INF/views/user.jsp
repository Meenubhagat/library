<%@ include file="common/header.jsp"%>
<form class="form-horizontal" action="save" method="post">
	<fieldset>  
      	<legend style="margin:0;padding:10px; text-align:center;"> <b>User Information </b></legend><br>
      	<div class="form-group">
 		<label for="inputuserid" class="col-sm-2 control-label">User Id</label>
    	<div class="col-xs-4"><span class="add-on"><i class="icon-user"></i></span>
     	<input type="text" class="form-control" id="user_id" name="user_id" placeholder="Enter Id" value="${user.id }">
   		</div>
 		</div><br>	
 		
 		<div class="form-group">
 		<label for="password" class="col-sm-2 control-label">Password</label>
    	<div class="col-xs-4"><span class="add-on"><i class="icon-user"></i></span>
     	<input type="password" class="form-control" id="password" name="password" placeholder="Enter Password" value="${user.password }">
   		</div>
 		</div><br>	
      		
      	<div class="form-group">
      	<label  class="col-sm-2 control-label">User Full Name</label>
       	<div class="col-sm-2">
        <input type="firstname" class="form-control" id="user_firstname" placeholder="FirstName" name="firstname" value="${user.firstname }" >
        </div>
              
        <div class="col-sm-2">
        <input type="middlename" class="form-control" id="user_middlename" placeholder="MiddleName" name="middlename" value="${user.middlename }">
        </div>
              
        <div class="col-sm-2">
        <input type="lastname" class="form-control" id="user_lastname" placeholder="LastName" name="lastname" value="${user.lastname }">
        </div>
        </div><br>
        
        <div class="form-group">
   		<label for="inputenabled" class="col-sm-2 control-label">Enabled</label>
    	<div class="col-xs-4">
      	<div class="radio">
  	    <label>
   		<input type="radio" value="Yes" checked id="Enabled" name="enabled" 
   		<c:if test="${user.enabled.equals(\"Yes\") }">checked</c:if>>Yes
  	    </label>
		</div>
	    <div class="radio">
 	    <label>
    	<input type="radio" value="No" checked id="Enabled" name="enabled" 
   		<c:if test="${user.enabled.equals(\"No\") }">checked</c:if>>No
  	    </label>
	    </div>
   	    </div>
  	    </div><br>
        
        <div class="form-group">
  	    <label type="email" class="col-sm-2 control-label">User Email</label>
  	    <div class="col-sm-4">
        <input type="email" class="form-control" id="email" placeholder="Enter Email" name="email" value="${user.email }">
        </div>
  	    </div><br>
  	      
  	    <div class="form-group">
 		<label for="inputrollno" class="col-sm-2 control-label">User RollNo</label>
    	<div class="col-xs-4"><span class="add-on"><i class="icon-user"></i></span>
     	<input type="text" class="form-control" id="rollno" name="rollno" placeholder="Enter Rollno." value="${user.rollno }">
   		</div>
 		</div><br>	 

		<div class="form-group">
   		<label for="inputstatus" class="col-sm-2 control-label">Gender</label>
    	<div class="col-xs-4">
      	<div class="radio">
  	    <label>
   		<input type="radio" value="Male" checked id="user_Gender" name="gender" 
   		<c:if test="${user.gender.equals(\"Male\") }">checked</c:if>>Male
  	    </label>
		</div>
	    <div class="radio">
 	    <label>
    	<input type="radio" value="Female" checked id="user_gender" name="gender" 
    	<c:if test="${user.gender.equals(\"female\") }">checked</c:if>>Female
    	</label>
	    </div>
   	    </div>
  	    </div><br>
      		
      <div class="form-group">
  	 <label type="course" class="col-sm-2 control-label" >Course</label>
  	   <div class="col-xs-4">
  	    <select class="form-control" id="course" name="course">
  	     <option>Select Course</option>
  	     <option <c:if test="${user.course.equals(\"BCA\") }">selected
  	     </c:if>>BCA</option>
  	     
  	     <option  <c:if test="${user.course.equals(\"Bsc(Math)\") }">selected
  	     </c:if>>Bsc(Math)</option>
  	     
  	     <option  <c:if test="${user.course.equals(\"Bsc(Economics)\") }">selected
  	     </c:if>>Bsc(Economics)</option>
  	     
   	     <option  <c:if test="${user.course.equals(\"B.A\") }">selected
  	     </c:if>>B.A</option>
   	     
   	     <option  <c:if test="${user.course.equals(\"B.Com\") }">selected
  	     </c:if>>B.Com</option>
   	     
   	     <option  <c:if test="${user.course.equals(\"Bsc(ComputerScience)\") }">selected
  	     </c:if>>Bsc(ComputerScience)</option>
   	     <option  <c:if test="${user.course.equals(\"Bsc(IT)\") }">selected
  	     </c:if>>Bsc(IT)</option>
   	     <option  <c:if test="${user.course.equals(\"B.ed\") }">selected
  	     </c:if>>B.ed</option>
   	     <option  <c:if test="${user.course.equals(\"B.Tech\") }">selected
  	     </c:if>>B.Tech</option>
   	     <option  <c:if test="${user.course.equals(\"MCA\") }">selected
  	     </c:if>>MCA</option>
   	     <option  <c:if test="${user.course.equals(\"Msc(Math)\") }">selected
  	     </c:if>>Msc(Math)</option>
  	     
  	     <option  <c:if test="${user.course.equals(\"sc(Economics)\") }">selected
  	     </c:if>>Msc(Economics)</option>
  	     
   	     <option  <c:if test="${user.course.equals(\"M.A\") }">selected
  	     </c:if>>M.A</option>
   	     
   	     <option  <c:if test="${user.course.equals(\"M.Com\") }">selected
  	     </c:if>>M.Com</option>
   	     
   	     <option  <c:if test="${user.course.equals(\"Msc(ComputerScience)\") }">selected
  	     </c:if>>Msc(ComputerScience)</option>
   	     <option  <c:if test="${user.course.equals(\"Msc(IT)\") }">selected
  	     </c:if>>Msc(IT)</option>
   	     <option  <c:if test="${user.course.equals(\"M.S\") }">selected
  	     </c:if>>M.S</option>
   	     <option  <c:if test="${user.course.equals(\"M.fill\") }">selected
  	     </c:if>>M.fill</option>
   	     <option  <c:if test="${user.course.equals(\"P.hd\") }">selected
  	     </c:if>>P.hd</option>
   	     <option  <c:if test="${user.course.equals(\"PGDCA\") }">selected
  	     </c:if>>PGDCA</option>
   	     <option  <c:if test="${user.course.equals(\"M.Tech\") }">selected
  	     </c:if>>M.Tech</option>
   	     
	    </select>
  	   </div>
  	 </div><br>
      		
     <div class="form-group">
  	 <label type="type" class="col-sm-2 control-label" >User Type</label>
  	 <div class="col-xs-4">
  	 <select class="form-control" id="type" name="type">
  	 <option>Select User Type</option>
  	     
  	 <option <c:if test="${user.type.equals(\"Student\") }">selected
  	 </c:if>>Student</option>
  	     
   	 <option <c:if test="${user.type.equals(\"Administration\") }">selected
  	 </c:if>>Administration</option>
	 </select>
  	 </div>
  	 </div> <br>		
  	 
  	 <div class="col-xs-4">
  	 <center><button type="submit" class="btn btn-success btn-lg">Save</button>
  	 <button type="button" class="btn btn-danger btn-lg">Cancel</button></center>
  	 </div>
     </fieldset> 		

</form>
</body>
<%@ include file="common/footer.jsp"%>
</html>
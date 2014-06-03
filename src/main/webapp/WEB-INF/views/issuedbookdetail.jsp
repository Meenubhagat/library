<%@ include file="common/header.jsp"%>

<center><h1>Issued Books Detail</h1></center>


<table class="table table-striped">

<td>
  <tr><b>Book Name </b> : ${issuedbookdetail.bookname}</br></br> </tr>
  <tr><b>Book Author</b> : ${issuedbookdetail.bookauthor}</br></br> </tr>		
  <tr><b>Book Code</b> : ${issuedbookdetail.bookcode}</br></br></tr>		
  <tr><b>Book Price</b>: ${issuedbookdetail.bookprice}</br></br></tr>		
  <tr><b>Rack Number</b>: ${issuedbookdetail.rackno}</br></br></tr>
  <tr><b>User Email</b> : ${issuedbookdetail.useremail}</br></br></tr>		
  <tr><b>User Course</b> : ${issuedbookdetail.course}</br></br></tr>
  <tr><b>User Name</b> : ${issuedbookdetail.name}</br></br></tr>		
  <tr><b>Gender</b> : ${issuedbookdetail.gender}</br></br></tr>    
  <tr><b>Roll Number</b> : ${issuedbookdetail.rollno}</br></br></tr>  
  <tr><b>Issue Id</b> : ${issuedbookdetail.issueid}</br></br></tr>  
  <tr><b>Issue Date</b> : ${issuedbookdetail.issuedate}</br></br></tr>
  <tr><b>Return Date</b> : ${issuedbookdetail.returndate}</br></br></tr>
  <tr><b>Fine</b> : ${issuedbookdetail.fine}</br></br></tr>      		
	</td>	
	
	
</table>
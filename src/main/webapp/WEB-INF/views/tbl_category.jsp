<%@ include file="common/header.jsp"%>
<form class="form-horizontal" role="form" action="save" method="post">
<fieldset>  
      	<legend style="margin:0;padding:10px; text-align:center;"> <b>Table Category </b></legend><br>
  <div class="form-group">
    <label for="id" class="col-sm-2 control-label">Category Id</label>
    <div class="col-xs-4">
      <input type="text" class="form-control" id="id" placeholder="Enter Id" name="categoryid" value="${cat.id }">
    </div>
  </div>
  
  <div class="form-group">
    <label for="name" class="col-sm-2 control-label">Name</label>
    <div class="col-xs-4">
      <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name" value="${cat.name }">
    </div>
  </div>
  
   <div class="form-group">
    <label for="p_id" class="col-sm-2 control-label">Parent Id</label>
    <div class="col-xs-4">
      <input type="text" class="form-control" id="p_id" placeholder="Parent Id" name="parentid" value="${cat.parent_id }">
    </div>
  </div><br>
 
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">Submit</button>
      <button type="button" class="btn btn-warning">Cancel</button>
    </div>
  </div>
  </fieldset>
</form>
</body>
<%@ include file="common/footer.jsp"%>
</html>
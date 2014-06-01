<%@ include file="common/header.jsp"%>
<form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/cat/save" method="post">
<fieldset>  
      	<legend style="margin:0;padding:10px; text-align:center;"> <b>Save Category </b></legend><br>
  <%-- <div class="form-group">
    <label for="id" class="col-sm-2 control-label">Category Id</label>
    <div class="col-xs-4">
      <input type="hidden" class="form-control" id="id" placeholder="Enter Id" name="categoryid" value="${cat.id }">
    </div>
  </div> --%>
  
  <div class="form-group">
    <label for="id" class="col-sm-2 control-label">Category Id</label>
    <div class="col-xs-4">
      <input type="text" class="form-control" id="id" placeholder="Enter Id" name="id" value="${cat.id }">
    </div>
  </div>
  
  
  <div class="form-group">
    <label for="name" class="col-sm-2 control-label">Name</label>
    <div class="col-xs-4">
      <input type="text" required class="form-control" id="name" placeholder="Enter Name" name="name" value="${cat.name }">
    </div>
  </div>
  ${cat.pid }
  <div class="form-group">
  	 <label for="p_id" class="col-sm-2 control-label">Parent Id</label>
  	 <div class="col-xs-4">
  	  <select class="form-control" id="pid" name="pid">
  	 <option value="0">None</option>
  	 <c:forEach items="${category}" var="parentcat">
			 <option value="${parentcat.id}"
			 <c:if test="${(parentcat.id == cat.pid)}">
			 	selected="selected"
			 </c:if>			 
			 >${parentcat.name}</option>
			</c:forEach>

	 </select>
	 
  	 </div>
  	 </div> <br>
  	 		
 
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
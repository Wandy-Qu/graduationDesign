<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib prefix="goo" uri="http://www.goo.tag.com" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//CN">
<html>
  <head>
  <script type="text/javascript"
			src="${pageContext.request.contextPath}/js/jquery/base/jquery-1.4.2.min.js"></script>
  <script>
	  $(document).ready(function(){
	  //$("#b01").click(function(){
	  //window.location.href='<s:url value="/WEB-INF/data/createData.jsp"/>';
	  //htmlobj=$.ajax({url:"/goo/data/locCreateData.action"});
	  //$("#myDiv").html(htmlobj.responseText);
	  //});
	});
		    //function logData(){
		    	//window.location.href="../data/createData.jsp";
		    //}
		  </script>
      <title>login2</title>
  </head>
    
  <body>
          <div style="display: block; width: 100%; overflow-x: auto;margin-left: auto;margin-right: auto;">
              				<table id="budget_tb" border="1" cellpadding="0" cellspacing="0"
					style="margin-bottom: 8px;margin:auto" id="table" class="table datagrid">
						<thead>
						<tr>
							
							<th nowrap="nowrap">
								id				
							</th>
							
							<th nowrap="nowrap">
								name
							</th>
							<th nowrap="nowrap">
								password
							</th>
							<th nowrap="nowrap">
								create_time
							</th>

							
						</tr>
					</thead>
					<tbody>
							<c:forEach items="${list}" var="userItem"
							varStatus="userIndex">
							<tr>
								<td>${userItem.userId}</td>
								<td>${userItem.userName}</td>
								<td>${userItem.password}</td>
								<td>${userItem.createTime}</td>
							
							</tr>
							</c:forEach>
					</tbody>
					</table>
          </div>
          	<goo:pageTag pageSize="10"
				gotoURI="../abc/searchUsers.action"></goo:pageTag>
			 <div style="display: block; width: 100%; overflow-x: auto;margin-left: auto;margin-right: auto;">
					 <form method="post" action="/goo/data/locCreateData.action"
					onsubmit="return submitForm();">
					
					<input id="b01" type="submit"  value="数据录入">	
					</form>
					 <form method="post" action="/goo/data/searchPlants.action"
					onsubmit="return submitForm();">
					
					<input id="b02" type="submit"  value="数据查询">	
					</form>
							 
			 </div>
  </body>
</html>

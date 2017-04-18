<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>
<%@ taglib prefix="goo" uri="http://www.goo.tag.com" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//CN">
<html>
  <head>
      <title>selectData</title>
      <script type="text/javascript"
			src="${pageContext.request.contextPath}/js/jquery/base/jquery-1.4.2.min.js">
</script>
	<script>
    function selectData(){
    	$("#searchPlantUnicomId").attr("action","../data/searchPlants.action");
    	$("#searchPlantUnicomId").submit();
    }
    function openDialog(str1){
		var str3 = escape(escape(str1));
		//window.showModalDialog("./apportion/apportionModelModify.action?pkCode="+str3+"&version="+str4, "", "dialogWidth:800px;dialogHeight:700px;scroll:yes;status:no");
		//var nwd = window.open("./apportion/apportionModelModify.action?pkCode="+str3+"&version="+str4, "app", "dialogWidth:800px;dialogHeight:700px;scroll:yes;status:no");
		openNewWindowBig("../data/searchPlantDetaill.action?plaId="+str1);
	}
			
	function openNewWindowBig(url)
	{
		var height = 700;
		var width = 850;
		var left = ( window.parent.screen.width - width ) / 2 ;
		var top = ( window.parent.screen.height - height ) / 2 ;
		var nwd = window.open (url, 'newwindowBig', 'height=' + height + ', width=' + width + ', top='+height+', left='+left+', toolbar=no,menubar=no, scrollbars=yes, resizable=no,location=no, status=no');
		nwd.focus();
	}
      </script>
  </head>

  <body>
      <div style="display: block; width: 100%; overflow-x: auto;margin-left: auto;margin-right: auto;">
             <form name="searchPlantUnicom" action=""
				id="searchPlantUnicomId" method="post">
              	<table width="100%" border="0" cellpadding="0" cellspacing="0"
					class="table2" style="table-layout: fixed;">
					<tr align="left" nowrap="nowrap">
						<td width="14%" nowrap="nowrap">
							编号：
						</td>
						<td width="20%" nowrap="nowrap">
							<input style="width: 80%" type="text" name="plantUnicom.plaId"
								id="plantUnicom.plaId" value="${plantUnicom.plaId}"
								maxlength="80" />
						</td>
						</tr>
						<tr nowrap="nowrap">
							<td colspan="4" nowrap="nowrap">
								<input name="addValueSet" type="button" style="cursor: hand" id='addrule'
									class="btn" value="查询" onclick="selectData();" />
								&nbsp;&nbsp;
							</td>
						
						</tr>
				</table>
				</form>
              	<table id="budget_tb" border="1" cellpadding="0" cellspacing="0"
					style="margin-bottom: 8px;margin:auto" id="table" class="table datagrid">
						<thead>
						<tr>
							
							<th nowrap="nowrap">
								编号				
							</th>
							
							<th nowrap="nowrap">
								株高
							</th>
							<th nowrap="nowrap">
								叶长
							</th>
							<th nowrap="nowrap">
								成分
							</th>
							<th nowrap="nowrap">
								环境编号				
							</th>
							
							<th nowrap="nowrap">
								气温
							</th>
							<th nowrap="nowrap">
								湿度
							</th>
							<th nowrap="nowrap">
								降水量
							</th>
							<th nowrap="nowrap">
								操作
							</th>
							
						</tr>
					</thead>
					<tbody>
							<c:forEach items="${list}" var="plantItem" varStatus="plantIndex">
							<tr>
								<td>${plantItem.plaId}</td>
								<td>${plantItem.plaField1}</td>
								<td>${plantItem.plaField2}</td>
								<td>${plantItem.plaField3}</td>
								<td>${plantItem.envId}</td>
								<td>${plantItem.envField1}</td>
								<td>${plantItem.envField2}</td>
								<td>${plantItem.envField3}</td>
								<td align="center" nowrap="nowrap">
									<!-- <a href="#"
										onclick="javascript:window.location.href='./apportion/apportionModelModify.action?pkCode='+escape(escape('${ruleUnicomItem.pkCode}'))+'&version='+escape(escape('${ruleUnicomItem.version}'))">修改</a> -->
										<a href="#" name="mdlink"
										onclick="javascript: openDialog('${plantItem.plaId}');">
										修改
										</a>
									</td>
							</tr>
							</c:forEach>
					</tbody>
					</table>
          </div>
          	<goo:pageTag pageSize="10"
				gotoURI="../data/searchPlants.action"></goo:pageTag>
  </body>
</html>

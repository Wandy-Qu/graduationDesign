<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//CN">
<html>
  <head>
      <title>plantModify</title>
  </head>

  <body>
      <form method="post" action="addData.action"
					onsubmit="return submitForm();">
					<div style="padding: 10px 0 0 40px; line-height: 25px">
						植物信息

					</div>
					<div style="padding: 10px 0 0 40px; line-height: 25px">
						编号：

						  ${plantUnicom.plaId}
					</div>
					<div style="padding: 10px 0 0 40px; line-height: 25px">
						株高：
						<input name="plantUnicom.plaField1" type="text" id="plantUnicom.plaFiled1"
							style="width: 200px" value="${plantUnicom.plaField1}" />
					</div>
					<div style="padding: 10px 0 0 40px; line-height: 25px">
						叶长：
						<input name="plantUnicom.plaField2" type="text" id="plantUnicom.plaField2"
							style="width: 200px" value="${plantItem.plaField2}" />
					</div>
					<div style="padding: 10px 0 0 40px; line-height: 25px">
						成分：
						 <input name="plantUnicom.plaField3" type="text" id="plantUnicom.plaField3"
							style="width: 200px" value="${plantItem.plaField23}" />
				
					</div>
					<div style="padding: 10px 0 0 40px; line-height: 25px">
						环境信息

					</div>
					<div style="padding: 10px 0 0 40px; line-height: 25px">
						环境编号：

						  <input name="plantUnicom.envId" type="text" id="plantUnicom.envId"
							style="width: 200px" value="${plantItem.envId}" />
					</div>
					<div style="padding: 10px 0 0 40px; line-height: 25px">
						气温：
						<input name="plantUnicom.envField1" type="text" id="plantUnicom.envField1"
							style="width: 200px" value="${plantItem.envField1}" />
					</div>
					<div style="padding: 10px 0 0 40px; line-height: 25px">
						湿度：
						<input name="plantUnicom.envField2" type="text" id="plantUnicom.envField2"
							style="width: 200px" value="${plantItem.envField2}" />
					</div>
					<div style="padding: 10px 0 0 40px; line-height: 25px">
						降水量：
						<input name="plantUnicom.envField3" type="text" id="plantUnicom.envField3"
							style="width: 200px" value="${plantItem.envField3}" />
					</div>
					<div
						style="padding: 20px 0 0 102px; * padding: 20px 0 0 105px; _padding: 20px 0 0 105px; line-height: 25px">
						<input class="btn" type="submit" name="button" id="button"
							value="修改" / style="margin-right: 20px" />
						<input class="btn" type="reset" name="button" id="button"
							value="取消" />
					</div>
					
				</form>
  </body>
</html>

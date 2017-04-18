<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib prefix="s"  uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//CN">
<html>
  <head>
      <title>login</title>
  </head>

  <body>
      <form method="post" action="laucher.action"
					onsubmit="return submitForm();">
					
					<div style="padding: 10px 0 0 40px; line-height: 25px">
						用&nbsp;&nbsp;户&nbsp;&nbsp;名：

						  <input type="text" name="user.userName" id="username" value="10000"
							style="width: 200px" />
							<!-- <input type="text" name="userId" id="userId" value=""
							style="width: 200px" />-->
					</div>
					<div style="padding: 10px 0 0 40px; line-height: 25px">
						密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：
						<input name="user.password" type="password" id="password"
							style="width: 200px" value="" />
					</div>
					<div
						style="padding: 20px 0 0 102px; * padding: 20px 0 0 105px; _padding: 20px 0 0 105px; line-height: 25px">
						<input class="btn" type="submit" name="button" id="button"
							value="登录" / style="margin-right: 20px" />
						<input class="btn" type="reset" name="button" id="button"
							value="取消" />
					</div>
					<div id="loginLabel"
						style="padding:10px 0 0 40px; line-height:25px;font-size:12px;">
						${loginTip}&nbsp;
					</div>
				</form>
  </body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户</title>
</head>
<body>
	<center>
		<s:include value="hand.jsp"></s:include>
		<br>
		<br>
		<br>
		<s:form action="UserAction_doAddUser" method="post">
		
			<table>
				<tr>
					<td>用户名:</td>
					<td>
						<s:textfield name="name" ></s:textfield>
						<font>
						<s:fielderror>
							<s:param>name</s:param>
						</s:fielderror>
						</font>
					</td>
				</tr>
				<tr>
					<td>密   码:</td>
					<td>
						<s:password name="passWord" ></s:password>
						<font>
						<s:fielderror>
							<s:param>password</s:param>
						</s:fielderror>
						</font>
					</td>
				</tr>
				<tr>
					<td>确认密码:</td>
					<td><s:password name="confirmPassword" ></s:password></td>
				</tr>
			</table>
			<s:submit value="确定"></s:submit>
		</s:form>
	</center>
</body>
</html>
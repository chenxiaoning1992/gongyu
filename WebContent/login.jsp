<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登陆</title>
</head>
<body>
		<center>
		<s:include value="hand.jsp"></s:include>
		<br>
		<br>
		<br>
		<s:form action="LoginAction_doLogin" method="post">
		
			<table>
				<tr>
					<td>用户名:</td>
					<td>
						<s:textfield name="name" ></s:textfield>
					</td>
				</tr>
				<tr>
					<td>密   码:</td>
					<td>
						<s:password name="passWord" ></s:password>
					</td>
				</tr>
			</table>
			<s:submit value="登陆"></s:submit><s:actionerror/>
		</s:form>
	</center>
</body>
</html>
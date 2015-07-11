<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
	<center>
		<s:include value="hand.jsp"></s:include>
		<br>
		<br>
		<br>
		<s:form action="EmployeeAction_doAddEmployee" method="post">
		
			<table>
				<tr>
					<td>姓名:</td>
					<td>
						<s:textfield name="name" ></s:textfield>
						<font>
						<s:fielderror>
							<s:param>name</s:param>
						</s:fielderror>
						</font>
					</td>
				</tr>
				<tr></tr>
				<tr>
					<td>电话:</td>
					<td>
						<s:textfield name="phone" ></s:textfield>
						<font>
						<s:fielderror>
							<s:param>phone</s:param>
						</s:fielderror>
						</font>
					</td>
				</tr>
				<tr></tr>
				<tr>
					<td>单位:</td>
					<td>
						<s:textfield name="department" ></s:textfield>
						<font>
						<s:fielderror>
							<s:param>department</s:param>
						</s:fielderror>
						</font>
					</td>
				</tr>
				<tr></tr>
				<tr>
					<td>房号:</td>
					<td>
						<s:textfield name="roomNumber" ></s:textfield>
						<font>
						<s:fielderror>
							<s:param>room</s:param>
						</s:fielderror>
						</font>
					</td>
				</tr>
				
			</table>
			<s:submit value="确定"></s:submit>
		</s:form>
	</center>
</body>
</body>
</html>
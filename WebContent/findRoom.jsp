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
		<s:form action="RoomAction_doListRoom" method="post">
		
			<table>
				<tr>
					<td>房号:</td>
					<td>
						<s:textfield name="id" ></s:textfield>
						<font>
						<s:fielderror>
							<s:param>id</s:param>
						</s:fielderror>
						</font>
					</td>
				</tr>
				<tr></tr>
				<tr>
					<td>楼层:</td>
					<td>
						<s:textfield name="floor" ></s:textfield>
						<font>
						<s:fielderror>
							<s:param>floor</s:param>
						</s:fielderror>
						</font>
					</td>
				</tr>
				<tr></tr>
				<tr>
					<td>房型:</td>
					<td>
						<s:textfield name="roomType" ></s:textfield>
						<font>
						<s:fielderror>
							<s:param>roomType</s:param>
						</s:fielderror>
						</font>
					</td>
				</tr>
				<tr></tr>
			
			</table>
			<s:submit value="确定"></s:submit>
		</s:form>
	</center>
</body>
</body>
</html>
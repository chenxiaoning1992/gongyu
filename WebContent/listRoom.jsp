<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">

	$(function(){
		$(".delete").click(function(){
			var name = $(this).next(":hidden").val();
			var flag = confirm("确定要删除"+ name +"的信息么?");
			if(flag){
				var $tr = $(this).parent().parent();
				var url = this.href;
				$.post(url,function(data){
					if(data == "1"){
						alert("删除成功!");
						$tr.remove();
					}else{
						alert("删除失败!");
					}
				});
			}
			return false;
		});
	})
</script>
</head>
<body>
	<center>
	<s:include value="hand.jsp"></s:include>
	<h4>房间信息</h4>
	<s:if test="#request.rooms == null || #request.rooms.size() = 0">
		没有任何员工信息
	</s:if>
	<s:else>
		<table border="1" cellpadding="10" cellspacing="0">
		
			<tr>
				<td>房号</td>
				<td>楼层</td>
				<td>房态</td>
				<td>编辑</td>
				<td>删除</td>
			</tr>
			<s:iterator value="#request.rooms">
				<tr>
				
					<td>${id }</td>
					<td>${floor }</td>
					<td>${roomType }</td>
					<td>
						<a href="" class="delete">编辑</a>
						<input type="hidden" value="${id }">
					</td>
					<td>
						<a href="RoomAction_doDeleteRoom?roomId=${id }" class="delete">删除</a>
						<input type="hidden" value="${id }">
					</td>
					
					
				</tr>
			</s:iterator>
		</table>
	</s:else>
	</center>
</body>
</html>
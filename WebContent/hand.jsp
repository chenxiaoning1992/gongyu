<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<style type="text/css">
*{margin:0;padding:0;list-style:none;}
img{border:0 none;} 
.box{background:#1a529c}
/*主导航菜单*/
#nav-menu{height:40px;;background:#1a529c;width:970px;margin:0 auto;}
#nav-menu .container{position:relative;overflow:visible; z-index:99;}
#nav-menu .menu{padding:0 0 0 14px;}
#nav-menu .menu li{position:relative;float:left;padding:0 8px 0 5px;display:inline;font-size:14px;}
#nav-menu .menu li h3{font-weight:normal;display:inline-block;float:left;}
#nav-menu .menu li a.xialaguang{margin-top:10px;display:inline-block;color:#FFF;height:30px;text-decoration:none;font-size:14px;width:100px;text-align:center;}
#nav-menu .menu li a.selected,#nav-menu .menu li a.navhover,#nav-menu .menu li a.xialaguang:hover{color:#1a529c;}
#nav-menu .menu li a.navhover, #nav-menu .menu li a.xialaguang:hover{background-color:#FFF;}
#nav-menu .menu li a.xialaguang span{height:30px;line-height:25px;display:inline-block;font-weight:bold;}
#nav-menu .menu li a.selected span,#nav-menu .menu li a.navhover span,#nav-menu .menu li a.xialaguang:hover span{cursor:pointer;}
#nav-menu .menu li a.navhover span, #nav-menu .menu li a.xialaguang:hover span{width:100px;}
#nav-menu .menu ul.children{display:none;position:absolute;top:40px;left:3px;width:100px;background:#FFF;border:2px solid #1a529c;border-top:0;line-height:normal;}
#nav-menu .menu ul.children li{width:100px;padding:0px;display:inline-block;font-size:12px;border-top:1px solid #ccc;}
#nav-menu .menu ul.children li h3{display:block; width:100%;}
#nav-menu .menu ul.children li a{width:100%;height:16px;line-height:16px;overflow:hidden;padding:3px 0;display:block;color:#1a529c;text-align:center;
text-decoration:none; font-size:12px;}
#nav-menu .menu ul.children li a:hover{background-color:#eee;text-decoration:none;}
</style>

</head>
<body>

<div class="box">

	<div id="nav-menu">
		<ul class="menu">
			<li class="stmenu"><h3><a href="#" class="xialaguang"><span>首页</span></a></h3></li>
			<li class="stmenu">
				<h3><a href="#" class="xialaguang"><span>员工管理</span></a></h3>    
				<ul class="children">    
					<li><h3><a href="EmployeeAction_toAddEmployeePage"><span>增加员工</span></a></h3></li>
					<li><h3><a href="EmployeeAction_toFindEmployeePage"><span>查询员工</span></a></h3></li>
				</ul>
			</li>
			<li class="stmenu">
				<h3><a href="#" class="xialaguang"><span>房间管理</span></a></h3>    
				<ul class="children">    
					<li><h3><a href="RoomAction_toAddRoomPage"><span>增加房间</span></a></h3></li>
				</ul>
			</li>
			<li class="stmenu">
				<h3><a href="#" class="xialaguang"><span>用户管理</span></a></h3>    
				<ul class="children">    
					<li><h3><a href="UserAction_toAddUserPage"><span>增加用户</span></a></h3></li>
					<li><h3><a href="#"><span>用户权限设置</span></a></h3></li>
				</ul>
			</li>
			<li class="stmenu">
				<h3><a href="#" class="xialaguang"><span>站长杂谈</span></a></h3>   
				<ul class="children">    
					<li><h3><a href="#"><span>QQ个性签名</span></a></h3></li>
					<li><h3><a href="#"><span>QQ留言代码</span></a></h3></li>
				</ul>
			</li>
			<li class="stmenu"><h3><a href="#" class="xialaguang"><span>设计欣赏</span></a></h3></li>
			<li class="stmenu"><h3><a href="#" class="xialaguang"><span>素材</span></a></h3></li>
		</ul>
	</div>
	
</div>

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
$('#nav-menu .menu > li').hover(function(){
	$(this).find('.children').animate({ opacity:'show', height:'show' },200);
	$(this).find('.xialaguang').addClass('navhover');
}, function() {
	$('.children').stop(true,true).hide();
	$('.xialaguang').removeClass('navhover');
});
</script>

<div style="text-align:center;margin:50px 0; font:normal 14px/24px 'MicroSoft YaHei';">

</div>
</body>
</body>
</html>
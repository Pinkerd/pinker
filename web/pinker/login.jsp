<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>	
		<link rel="stylesheet" type="text/css" href="css/login.css"/>
		<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
		<script type="text/javascript">
			$(function(){
				$(".index-register").click(function(){
					$("#index-slider").removeClass("toleft");
				$("#index-slider").addClass("toright");
				
				$(".index-form-login").removeClass("isActive");
				$(".index-form-regiser").addClass("isActive");
				
				$(".index-register").addClass("active");
				$(".index-login").removeClass("active");
			})
				
				$(".index-login").click(function(){
				$("#index-slider").removeClass("toright");
				$("#index-slider").addClass("toleft");
				
				$(".index-form-login").addClass("isActive");
				$(".index-form-regiser").removeClass("isActive");
				
				$(".index-register").removeClass("active");
				$(".index-login").addClass("active");
				
				
				})
				
				
				
			})
			
		</script>
	</head>
	<body>
		
		
		<div class="index-main">
			<div class="index-main-body">
				<div class="index-header">
					<h1>PINKER</h1>
					<h3>寻找你的粉红色</h3>
				</div>
				
				<div class="index-main-login">
					<div class="index-nav">
						<a href="#" class="index-login active" >登录</a>
						<a href="#" class="index-register">注册</a>
						<span id="index-slider" class="toleft"></span>
					</div>
				</div>
				
				<div class="form-body">
					<div class="index-form-login  isActive" hidden="hidden">
					<form action="PersonPage.jsp" method="get">
						<div class="login-input-usernameWrap">
						<input type="text" name="username" id="username" value="" placeholder="用户名"/>
						</div>
						<div id="login-input-passwordWrap">
						<input type="text" name="password" id="password" value="" placeholder="密码"/>
						</div>
						
						<input type="submit" id="login-commitBtn" value="登录"/>
							
						
					</form>
					</div>
					
					<div class="index-form-regiser" hidden="hidden">
						<form action="PersonPage.jsp" method="get">
							<input type="text" name="username" id="username" placeholder="用户名" value="" />
							<input type="text" name="password" id="password" placeholder="密码" value="" />
							<input type="text" name="passwordAg" id="passwordAg" placeholder="确认密码" value="" />
							<input type="submit" id="index-register-commit" value="注册"/>
						</form>
						
						
					</div>
					
					
				</div>
			</div>
			
		</div>
		<iframe src="backgroud.jsp" width="100%" height="100%"></iframe>
	</body>
</html>

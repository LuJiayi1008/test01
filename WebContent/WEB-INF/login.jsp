<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>后台登录</title>
    <!-- for-mobile-apps -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

    <link href="${pageContext.request.contextPath}/css/loginStyle.css" rel="stylesheet" type="text/css" media="all" />

</head>
<body>
    <!-- main -->
    <div class="main">
        <h1>
                                     超市后台管理系统
        </h1>
        <form action="${pageContext.request.contextPath }/login.html"  name="actionForm" id="actionForm"  method="post">
            <div class="info">${error }</div>
            <input type="text" name="userCode" value="admin" placeholder="请输入用户名" required>
            <input type="password" value="123456" name="userPassword" placeholder="请输入密码" required>
            <input type="submit" value="登录">
        </form>
    </div>
    <div class="footer">
       
    </div>
    <!-- //main -->
</body>
</html>
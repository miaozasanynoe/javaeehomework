<%--
  Created by IntelliJ IDEA.
  User: miaoz
  Date: 2019/10/6
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
欢迎！！！<br>
<%--<span>您是第<s:property value="#session.userid"></s:property>名用户</span><br>--%>
<span>账户名：<s:property value="#session.username" /></span><br>
<span>密码：<s:property value="#session.userpassword"></s:property> </span>
</body>
</html>
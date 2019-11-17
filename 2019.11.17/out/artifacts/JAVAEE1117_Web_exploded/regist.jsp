<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: miaoz
  Date: 2019/11/17
  Time: 19:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<link type="text/css" rel="styleSheet"  href="style/style.css" />--%>
<html>
<head>
    <title>regist</title>
</head>
<body>
<section>
    <h1>注册</h1>
    <s:form action="regist">
    <s:textfield name="userTable.username" id="basic-form-first-name" placeholder="名称"/>
    <s:textfield name="userTable.password" id="basic-form-first-pass" placeholder="密码"/>
    <s:submit value="注册"></s:submit>
    </s:form>
</section>
</body>
</html>

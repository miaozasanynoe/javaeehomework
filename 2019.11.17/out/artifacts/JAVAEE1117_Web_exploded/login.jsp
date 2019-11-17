<%--
  Created by IntelliJ IDEA.
  User: miaoz
  Date: 2019/11/17
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<section>
    <h1>登录</h1>
    <s:form action="login">
        <s:textfield name="userTable.username" id="basic-form-first-name" placeholder="名称"/>
        <s:textfield name="userTable.password" id="basic-form-first-pass" placeholder="密码"/>
        <s:submit value="登录"></s:submit>
    </s:form>
</section>

</body>
</html>

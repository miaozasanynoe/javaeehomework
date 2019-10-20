<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: miaoz
  Date: 2019/10/20
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>resgist</title>
</head>
<body>
    <s:form action="regist">
        <s:textfield label="名字" name="info.name"></s:textfield>
        <s:textfield label="密码" name="info.password" type="password"></s:textfield>
        <s:textfield label="年龄" name="info.age"></s:textfield>
        <s:textfield label="签名" name="info.verb"></s:textfield>
        <s:textfield label="兴趣爱好" name="info.hobby"></s:textfield>
        <s:textfield label="地区" name="info.area"></s:textfield>
        <s:textfield label="职业" name="info.occupation"></s:textfield>
        <s:textfield label="其他" name="info.another"></s:textfield>
        <s:submit value="提交"></s:submit>
    </s:form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: miaoz
  Date: 2019/10/20
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="S" uri="/struts-tags" %>
<html>
<head>
    <title>include tag</title>
</head>
<body>
    不带参数的导入：
    <br>
    <s:include value="includer.jsp"/>
    <br>
    带参数的导入：
    <S:include value="includer.jsp">
        <s:param name="java" value="'Java EE实用教程（第三版）'"/>
    </S:include>
    <br>
</body>
</html>

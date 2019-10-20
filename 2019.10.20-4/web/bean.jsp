<%--
  Created by IntelliJ IDEA.
  User: miaoz
  Date: 2019/10/20
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>bean tag</title>
</head>
<body>
<s:bean name="vo.Student" var="stu">
    <s:param name="name">miaoz</s:param>
    第一种赋值方式：
    <s:property value="name"/><br>
    第二种赋值方式：
    <s:param name="name" value="'miaoz'"></s:param>
    <s:property value="name"/>
</s:bean><br>
bean 标签外输出：
<s:property value="#stu.name"/>
</body>
</html>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: miaoz
  Date: 2019/10/20
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>genertor tag</title>
</head>
<body>
    <s:generator separator="," val="'1,2,3,4,5,6'">
        <s:iterator>
            <s:property/><br>
        </s:iterator>
    </s:generator>
    <hr>
    <s:generator separator="," val="'1,2,3,4,5,6'" var="books" count="2"/>
    <s:iterator value="#attr.books">
        <s:property/><br>
    </s:iterator>
</body>
</html>

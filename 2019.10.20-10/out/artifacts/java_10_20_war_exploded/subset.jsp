<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: miaoz
  Date: 2019/10/20
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>subset tag</title>
</head>
<body>
    <s:subset var="books" source="{'1','2','3','4','5'}" start="1" count="3">
    </s:subset>
    <s:iterator value="#attr.books">
        <s:property/>
    </s:iterator>
</body>
</html>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: miaoz
  Date: 2019/10/20
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sort tags</title>
</head>
<body>
    <s:bean name="test.TestCmp " var="testcmp"/>
    <s:sort comparator="testcmp" source="{'aa','sss','cc'}" var="sort"/>
    <s:iterator value="#attr.sort">
        <s:property/>
    </s:iterator>
</body>
</html>

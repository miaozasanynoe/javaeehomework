<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: miaoz
  Date: 2019/10/20
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>iterator tag</title>
</head>
<body>
    <table border="1">
        <s:iterator value="{'javaee','qt5','javaee2','android'}" var="book" status="st">
            <tr
                <s:if test="#st.even">bgcolor="#CCCCFF" </s:if>
            >
                <td><s:property value="book"/></td>
                <td>当前索引为： <s:property value="#st.getIndex()"/></td>
                <td>当前迭代了元素个数为：<s:property value="#st.getCount()"/> </td>
            </tr>
        </s:iterator>
    </table>
</body>
</html>

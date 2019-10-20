<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: miaoz
  Date: 2019/10/20
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>append tag</title>
</head>
<body>
    <s:append var="books">
        <s:param value="{'javaee','qt5','javaee2','android'}"></s:param>
        <s:param value="{'Sql Server','c#'}"></s:param>
    </s:append>
    <table border="1" bgcolor="aqua">
        <caption>一些书</caption>
        <s:iterator value="#books" status="s">
            <td>
                <td width="30"><s:property value="#s.count"/> </td>
                <td><s:property/></td>
            </tr>
        </s:iterator>
    </table>
</body>
</html>

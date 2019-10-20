<%--
  Created by IntelliJ IDEA.
  User: miaoz
  Date: 2019/10/20
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>if_elseif tag</title>
</head>
<body>
    <s:if test="false">
        QT5开发实例
    </s:if>
    <s:elseif test="false">
        Java EE项目开发实例
    </s:elseif>
    <s:else>
        Java EE实用教程
    </s:else>
</body>
</html>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: miaoz
  Date: 2019/10/20
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form tag</title>
</head>
<body>
    <s:form action="login">
        <s:textfield value="textfiled" label="文本框*" requiredLabel="true"></s:textfield>
        <s:password value="password" name="password" label="密码框" requiredLabel="true"></s:password>
        <s:hidden value="hidden" name="textarea"></s:hidden>
        <s:textarea value="textarea" name="textarea"></s:textarea>
        <s:checkbox value="true" label="篮球" name="checkbox"></s:checkbox>
        <s:radio list="#{1:'男',2:'女'}" label="radio tag" name="radio"></s:radio>
        <s:select list="#{1:'1',2:'2'}" label="select tag" name="select">
        </s:select>
        <s:file name="文件上传" accept="text/*"></s:file>
        <s:submit value="submit"></s:submit>
        <s:reset value="reset"></s:reset>
    </s:form>

</body>
</html>

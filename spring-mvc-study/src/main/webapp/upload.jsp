<%--
  Created by IntelliJ IDEA.
  User: 30630
  Date: 2022/2/17
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="POST" action="upload" enctype="multipart/form-data">

    <input type="text" name="fileName">
    <input type="file" name="file">
    <%--   <input type="file" name="file">--%>

    <input type="submit" value="提交" />

</form>
</body>
</html>

<%@ page import="com.jensen.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Blog</title>
</head>
<body>
<%
    int id = Integer.valueOf(request.getParameter("id"));
    MockData mockData = new MockData();
    if (id < mockData.getNumberOfPosts()) {
        out.println(String.format("<p> %s </p>", mockData.getBlogPost(id).getPost()));
    }
%>
</body>
</html>
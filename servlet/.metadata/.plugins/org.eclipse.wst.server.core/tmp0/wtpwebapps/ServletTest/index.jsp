<html>
  <head>
    <title>Öva på JSP and Servlets Övning 6</title>
  </head>
  <body>

  
  
	<%@ page import="com.jensen.*" %>
    <%
        BlogPost blogPost;
        MockData mockData = new MockData();
        for (int i = 0; i < mockData.getNumberOfPosts(); i++) {
            blogPost = mockData.getBlogPost(i);
            out.append(String.format("<h1> %s </h1>", blogPost.getHeader()))
                    .append(String.format("Author : <i> %s </i><br>", blogPost.getAuthor()))
                    .append(String.format("Date : <time> %s </time><br>", blogPost.getDate().toString()))
                    .append(String.format("Blog : <p> %s ...</p>", blogPost.getPost().substring(0, 44)))
                    .append(String.format("<a href=\"ControllerServlet?id=%d\">Läs mer</a>", i));
        }
    %>
  </body>
</html>
<html>

<body>

F�r och efternamn: <%=request.getParameter("firstName")%> <%= request.getParameter("lastName")%>

<br> <br>

Anv�ndarens spr�k <%= request.getLocale() %>

<br><br>
Anv�ndarens "User Agent" <%= request.getHeader("User-Agent") %>
</body>

<jsp:include page="footer.jsp" />
</html>
<html>

<body>

För och efternamn: <%=request.getParameter("firstName")%> <%= request.getParameter("lastName")%>

<br> <br>

Användarens språk <%= request.getLocale() %>

<br><br>
Användarens "User Agent" <%= request.getHeader("User-Agent") %>
</body>

<jsp:include page="footer.jsp" />
</html>
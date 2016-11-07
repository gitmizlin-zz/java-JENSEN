<html>
<body>

<%

//sparar ned två talen i två variabler (vi får dem som strängar)

//getMethod() returnerar en sträng-representation av vilken metod vi använder
//om get så addera talen
if(request.getMethod().equalsIgnoreCase("get")) // not safe. parameter syns i länken.
{
String number1 = request.getParameter("number1");
String number2 = request.getParameter("number2");
int number=Integer.parseInt(number1) + Integer.parseInt(number2);
out.println(number);
}

//om post så subtrahera talen
if(request.getMethod().equalsIgnoreCase("post")) // används för t ex form. safe.
{
String number1 = request.getParameter("number1");
String number2 = request.getParameter("number2");
int number=Integer.parseInt(number1) - Integer.parseInt(number2);
out.println(number);
}
%>



</body>



</html>				
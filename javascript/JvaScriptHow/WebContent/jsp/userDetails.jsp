<%
String name = request.getParameter("name");
String pwd = request.getParameter("pwd");
if(name.equalsIgnoreCase("John") && pwd.equalsIgnoreCase("Test")){
	out.println("{\"Delivery_City\":\"Pune\",\"Payment_mode\":\"Cash on Delivery\"}");
}
else{
	
	out.println("{\"Delivery_City\":\"unknown\",\"Payment_mode\":\"unknown\"}");
}





%>
<%@ LANGUAGE = JScript %>
<%

   
 var name = Request.QueryString("name");
var pwd = Request.QueryString("pwd");
if(name == "John" && pwd == "Test"){
	Response.Write("{\"Delivery_City\":\"Pune\",\"Payment_mode\":\"Cash on Delivery\"}");
}
else{
	
	Response.Write("{\"Delivery_City\":\"unknown\",\"Payment_mode\":\"unknown\"}");
}





%>
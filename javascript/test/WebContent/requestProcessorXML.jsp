<% 
response.setContentType("text/xml");
int empid = Integer.parseInt(request.getParameter("empid"));
if(empid == 1){
	/* out.println("Anand,Persistent"); */
	out.println("<data><name>Anand</name><company>Persistent</company></data>");
}
%>


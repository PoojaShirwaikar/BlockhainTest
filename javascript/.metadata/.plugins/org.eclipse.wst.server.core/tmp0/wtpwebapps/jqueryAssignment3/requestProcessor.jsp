<%
	String name = request.getParameter("name");
	String pwd = request.getParameter("pwd");
	if (name.equalsIgnoreCase("John") && pwd.equalsIgnoreCase("Test")) {
		out.println("You are logged in as Administrator");
	}
	else{
		
		out.println("You are not logged in as Administrator. You do not have rights to make any changes in the profile settings");
	}

%>
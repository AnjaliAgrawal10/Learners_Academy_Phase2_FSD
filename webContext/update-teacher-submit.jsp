<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.dell.webapp.bean.Teachers" %>
<%@ page import="com.dell.webapp.dao.TeacherDAO" %>
<%@ page import="java.util.List" %>
	<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>
<%
int id = Integer.parseInt(request.getParameter("id"));
String name = request.getParameter("name");
Teachers tea = new Teachers(id,name);
try{
	TeacherDAO.updateTeachers(tea);
	out.println("<h3 style='color:green;'>Teachers is updated successfully</h3>");
	response.setHeader("Refresh","1;url=manage-teachers.jsp");
}
catch(Exception e)
{
	out.println("<h3 style='color:red;'>Teacher is not updated</h3>");
}
%>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="nav.jsp"></jsp:include>
       <form id="login-form"  action="user-login-submit.jsp" method="post">
                            <h3>User Login</h3>
                            <div>
                                <label for="username" >Username:</label><br>
                                <input required type="text" name="username" id="username">
                            </div>
                            <div >
                                <label for="password" >Password:</label><br>
                                <input required type="password" name="password" id="password">
                            </div>
                            <div>
                            	<input type="submit"  value="Login">
                            </div>
                        </form>
                    </div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
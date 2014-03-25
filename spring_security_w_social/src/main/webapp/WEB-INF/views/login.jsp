<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<jsp:include page="common/header.jsp">
	<jsp:param name="title" value="Login Page" />
</jsp:include>

<html>
	<head>
	</head>
	<body>
		<h1>
			Please login to your account
		</h1>
		<form action="j_spring_security_check" method="post">
			<label for="j_username">Username</label>
			<input id="j_username" name="j_username" size="20" maxLength="50" type="text" />
			<br />
			<label for="j_password">Password</label>
			<input id="j_password" name="j_password" size="20" maxLength="50" type="password" />
			<br />
			<input type="submit" value="Login" />
		</form>
	
		<form action="<c:url value="/signin/facebook" />" method="POST">
			<button type="submit">Sign in with Facebook</button>
			<input type="hidden" name="scope"
				value="email,user_likes,friends_likes,publish_stream" />
		</form>
	</body>
</html>

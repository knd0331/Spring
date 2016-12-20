<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>로그인 입력 화면</title>
</head>
<body>
	<!-- login_form.jsp -->
	<form action="login.do" method="post">

		ID:<input type="text" name="userId" size="10"><br> 
		PW:<input type="password" name="userPw" size="10"><br>
		숫자입력:<input type="number" name="num" size="10"><br>  
		<input type="submit" value="로그인">

	</form>

</body>
</html>
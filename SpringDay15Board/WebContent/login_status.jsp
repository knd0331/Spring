<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�α��� ���º���</title>
</head>
<body>

	<c:if test="${not empty sessionScope.loginId}">
       ${sessionScope.loginId} �� �α��� �����Դϴ�.
       <a href="logout.do">[�α׾ƿ�]</a>
	</c:if>

	<c:if test="${empty sessionScope.loginId}">
	�α��� ������ �����ϴ�.<br>
		<a href="loginForm.do">[�α��� �Ϸ�����]</a>
	</c:if>

</body>
</html>
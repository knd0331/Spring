<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		게시판 입장을 원하시면 로그인을 하셔야합니다.<br>
		<a href="loginForm.do"><button>로그인</button></a>
		<a href="joinForm.do"><button>회원가입</button></a>
	</body>
</html>

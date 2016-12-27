<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>삭제 확인 화면</title>
</head>
<body>

	<div>
		<form action=delete.do>
			삭제 하시겠습니까?<br> 
			<a href="delete.do?articleNum=${articleNum}">[YES]</a><br> 
			<a href="boardList.do">[NO]</a> 
		</form>
	</div>

</body>
</html>
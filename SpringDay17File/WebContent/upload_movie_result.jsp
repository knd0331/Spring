<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>��ȭ ���ε� ���</title>
</head>
<body>
	upload_movie_result.jsp<br>
	<h3>���ε�� ���� ����� �Ʒ��� �����ϴ�.</h3>
	<hr>
	<c:forEach var="file" items="${uploadedFileNames}">
		�����̸� : ${file.originalFilename}<br>
	</c:forEach>
</body>
</html>
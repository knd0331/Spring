<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>영화 업로드 결과</title>
</head>
<body>
	upload_movie_result.jsp<br>
	<h3>업로드된 파일 목록은 아래와 같습니다.</h3>
	<hr>
	<c:forEach var="file" items="${uploadedFileNames}">
		파일이름 : ${file.originalFilename}<br>
	</c:forEach>
</body>
</html>
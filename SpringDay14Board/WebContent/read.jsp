<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>글 읽기화면</title>
</head>
<body>

	<table>
		<tr>
			<td>제목:</td>
			<td>${article.title}</td>
		</tr>
		<tr>
			<td>작성자:</td>
			<td>${article.writer}</td>
		</tr>
		<tr>
			<td>조회수:</td>
			<td>${article.readCount}</td>
		</tr>
		<tr>
			<td>작성일:</td>
			<td>${article.writeDate}</td>
		</tr>
		<tr>
			<td>내용:</td>
			<td>${article.content}</td>
		</tr>
	</table>

	<a href="boardList.do">[목록]</a>
	<c:if test="${sessionScope.loginId==article.writer}">
		<a href="updateForm.do?articleNum=${article.articleNum}">[수정]</a>
		<a href="deleteForm.do?articleNum=${article.articleNum}">[삭제]</a>
	</c:if>

</body>
</html>
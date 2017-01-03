<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>글읽기</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>제목:</td>
			<td>${board.title}</td>
		</tr>
		<tr>
			<td>작성자:</td>
			<td>${board.writer}</td>
		</tr>
		<tr>
			<td>조회수:</td>
			<td>${board.readCount}</td>
		</tr>
		<tr>
			<td>작성일:</td>
			<td>${board.writeDate}</td>
		</tr>
		<tr>
			<td>내용:</td>
			<td>${board.content}</td>
		</tr>
	</table>

	<a href="boardList.do"><button>목록</button></a>
	<c:if test="${board.writer==sessionScope.loginId}">
		<a href="updateForm.do?articleNum=${board.articleNum}"><button>수정</button></a>
		<a href="deleteForm.do?articleNum=${board.articleNum}"><button>삭제</button></a>
	</c:if>

</body>
</html>
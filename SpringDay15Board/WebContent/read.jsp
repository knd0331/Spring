<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>글 읽기화면</title>

</head>
<body>

	<form action="comment.do" method="post">
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
		<hr>
		<table>
		<tr>
			<th>작성자</th>
			<th>내용</th>
			<th>작성일</th>
		</tr>
		<c:choose>
			<c:when test="${empty article.commentList}">
				<tr>
					<td colspan="3">댓글이 아직 존재하지 않습니다.</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="co" items="${article.commentList}">
					<tr>
						<td>${co.id}</td>
						<td>${co.content}</td>
						<td>${co.writeDate}</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
			<tr>
				<td colspan="2">
				댓글:
				    <input type="text" name="content" size="20">
					<input type="hidden" name="articleNum" value="${article.articleNum}"> 
					<input type="submit" value="확인"></td>
			</tr>
		</table>
	</form>
	<c:forEach begin="${coPage.startPage}" end="${coPage.startPage}" var="i">
		<a href="coList.do?page=${i}"> [${i}] </a><br>
	</c:forEach>

	<a href="boardList.do">[목록]</a>
	<c:if test="${sessionScope.loginId==article.writer}">
		<a href="updateForm.do?articleNum=${article.articleNum}">[수정]</a>
		<a href="deleteForm.do?articleNum=${article.articleNum}">[삭제]</a>
	</c:if>

</body>
</html>
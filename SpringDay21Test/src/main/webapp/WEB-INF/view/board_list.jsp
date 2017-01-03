<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>게시판 목록</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<c:choose>
			<c:when test="${empty boardPage.boardList}">
				<tr>
					<td colspan="5">게시글이 아직 존재하지 않습니다.</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="board" items="${boardPage.boardList}">
					<tr>
						<td>${board.articleNum}</td>
						<td><a href="read.do?articleNum=${board.articleNum}">
								${board.title} </a></td>
						<td>${board.writer}</td>
						<td>${board.writeDate}</td>
						<td>${board.readCount}</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
	<c:forEach begin="${boardPage.startPage}"
		end="${boardPage.startPage}" var="i">
		<a href="boardList.do?page=${i}"> [${i}] </a>
		<br>
	</c:forEach>
	<a href="writeForm.do"><button>글쓰기</button></a>
	<a href="logout.do"><button>로그아웃</button></a>

</body>
</html>
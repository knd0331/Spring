<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>목록</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>저자</th>
			<th>가격</th>
			<th>출판사</th>
		</tr>
		<c:if test="${empty listBook}">
			<tr>
				<td colspan="5">게시글 없음</td>
			</tr>
		</c:if>

		<c:if test="${not empty listBook}">
			<c:forEach items="${listBook}" var="Book">
				<tr>
					<td>${Book.bookNum}</td>
					<td>${Book.title}</td>
					<td>${Book.writer}</td>
					<td>${Book.price}</td>
					<td>${Book.publisher}</td>
				</tr>
			</c:forEach>
		</c:if>
	</table>
	
	<a href="index.jsp">처음으로</a>

</body>
</html>
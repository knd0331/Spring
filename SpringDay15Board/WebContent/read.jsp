<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�� �б�ȭ��</title>

</head>
<body>

	<form action="comment.do" method="post">
		<table>
			<tr>
				<td>����:</td>
				<td>${article.title}</td>
			</tr>
			<tr>
				<td>�ۼ���:</td>
				<td>${article.writer}</td>
			</tr>
			<tr>
				<td>��ȸ��:</td>
				<td>${article.readCount}</td>
			</tr>
			<tr>
				<td>�ۼ���:</td>
				<td>${article.writeDate}</td>
			</tr>
			<tr>
				<td>����:</td>
				<td>${article.content}</td>
			</tr>
		</table>
		<hr>
		<table>
		<tr>
			<th>�ۼ���</th>
			<th>����</th>
			<th>�ۼ���</th>
		</tr>
		<c:choose>
			<c:when test="${empty article.commentList}">
				<tr>
					<td colspan="3">����� ���� �������� �ʽ��ϴ�.</td>
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
				���:
				    <input type="text" name="content" size="20">
					<input type="hidden" name="articleNum" value="${article.articleNum}"> 
					<input type="submit" value="Ȯ��"></td>
			</tr>
		</table>
	</form>
	<c:forEach begin="${coPage.startPage}" end="${coPage.startPage}" var="i">
		<a href="coList.do?page=${i}"> [${i}] </a><br>
	</c:forEach>

	<a href="boardList.do">[���]</a>
	<c:if test="${sessionScope.loginId==article.writer}">
		<a href="updateForm.do?articleNum=${article.articleNum}">[����]</a>
		<a href="deleteForm.do?articleNum=${article.articleNum}">[����]</a>
	</c:if>

</body>
</html>
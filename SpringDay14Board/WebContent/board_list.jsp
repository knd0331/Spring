<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�Խ���</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>�۹�ȣ</th>
			<th>����</th>
			<th>�ۼ���</th>
			<th>�ۼ���</th>
			<th>��ȸ��</th>
		</tr>
		<c:choose>
			<c:when test="${empty articlePage.articleList}">
				<tr>
					<td colspan="5">�Խñ��� ���� �������� �ʽ��ϴ�.</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="article" items="${articlePage.articleList}">
					<tr>
						<td>${article.articleNum}</td>
						<td>
						<a href="read.do?articleNum=${article.articleNum}">
					    ${article.title} </a>
					    </td>
						<td>${article.writer}</td>
						<td>${article.writeDate}</td>
						<td>${article.readCount}</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
	<a href="writeForm.do"><button>�۾���</button></a>
	<a href="login_success.jsp"><button>���ư���</button></a>

</body>
</html>
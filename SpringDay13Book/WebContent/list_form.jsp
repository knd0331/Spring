<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>��ȣ</th>
			<th>����</th>
			<th>����</th>
			<th>����</th>
			<th>���ǻ�</th>
		</tr>
		<c:if test="${empty listBook}">
			<tr>
				<td colspan="5">�Խñ� ����</td>
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
	
	<a href="index.jsp">ó������</a>

</body>
</html>
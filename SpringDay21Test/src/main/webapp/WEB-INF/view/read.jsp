<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���б�</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>����:</td>
			<td>${board.title}</td>
		</tr>
		<tr>
			<td>�ۼ���:</td>
			<td>${board.writer}</td>
		</tr>
		<tr>
			<td>��ȸ��:</td>
			<td>${board.readCount}</td>
		</tr>
		<tr>
			<td>�ۼ���:</td>
			<td>${board.writeDate}</td>
		</tr>
		<tr>
			<td>����:</td>
			<td>${board.content}</td>
		</tr>
	</table>

	<a href="boardList.do"><button>���</button></a>
	<c:if test="${board.writer==sessionScope.loginId}">
		<a href="updateForm.do?articleNum=${board.articleNum}"><button>����</button></a>
		<a href="deleteForm.do?articleNum=${board.articleNum}"><button>����</button></a>
	</c:if>

</body>
</html>
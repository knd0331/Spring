<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� 2</title>
</head>
<body>
<body>
	<form action="update.do" method="post">
		<table border="1">
			<tr>
				<td>����</td>
				<td><input type="text" name="title" size="10" value="${original.title}"></td>
			</tr>
			<tr>
				<td>����</td>
				<td><input type="text" name="writer" size="10" value="${original.writer}"></td>
			</tr>
			<tr>
				<td>����</td>
				<td><input type="text" name="price" size="10" value="${original.price}"></td>
			</tr>
			<tr>
				<td>���ǻ�</td>
				<td><input type="text" name="publisher" size="10" value="${original.publisher}"></td>
			</tr>
			<tr>
				<td colspan="2">
				  <input type="hidden" name="bookNum" value="${original.bookNum}">
				  <input type="submit" value="����">
				</td>
			</tr>
		</table>
	</form>

</body>
</html>
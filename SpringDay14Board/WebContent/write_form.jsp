<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�۾��� ȭ��</title>
</head>
<body>

	<form action="write.do" method="post">
		<table border="1">
			<tr>
				<td>����:</td>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<td>����:</td>
				<td><textarea rows="5" cols="20" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="�ۼ��Ϸ�"></td>
			</tr>
		</table>
	</form>

</body>
</html>
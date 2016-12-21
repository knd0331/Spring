<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>책추가</title>
</head>
<body>
	<form action="insert.do" method="post">
		<table border="1">
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" size="10"></td>
			</tr>
			<tr>
				<td>저자</td>
				<td><input type="text" name="writer" size="10"></td>
			</tr>
			<tr>
				<td>가격</td>
				<td><input type="text" name="price" size="10"></td>
			</tr>
			<tr>
				<td>출판사</td>
				<td><input type="text" name="publisher" size="10"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="추가"></td>
		</table>
	</form>



</body>
</html>
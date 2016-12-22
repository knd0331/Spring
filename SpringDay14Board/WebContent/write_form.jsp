<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>글쓰기 화면</title>
</head>
<body>

	<form action="write.do" method="post">
		<table border="1">
			<tr>
				<td>제목:</td>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<td>내용:</td>
				<td><textarea rows="5" cols="20" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="작성완료"></td>
			</tr>
		</table>
	</form>

</body>
</html>
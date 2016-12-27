<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>수정 화면</title>
</head>
<body>
	<form action="update.do" method="post">
		<table>
			<tr>
				<td>제목:</td>
				<td><input type="text" name="title" value="${article.title}"></td>
			</tr>
			<tr>
				<td>내용:</td>
				<td><textarea rows="5" cols="20" name="content">${article.content}</textarea></td>
			</tr>
			<tr>
				<td colspan="2">
				<input type="hidden" name="articleNum" value="${article.articleNum}"> 
				<input type="submit" value="수정완료"></td>
			</tr>
		</table>
	</form>

</body>
</html>
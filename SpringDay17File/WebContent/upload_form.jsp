<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>���ε� ��</title>
</head>
<body>
	<form action="upload.do" method="post" 
						enctype="multipart/form-data">
		����:
		<input type="text" name="title" size="10"><br>
		<input type="file" name="myFile"><br>
		<input type="submit" value="����">	
	</form>

</body>
</html>
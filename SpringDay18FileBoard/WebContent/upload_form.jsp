<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>���� ������ ���ε�</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		var fileCount=1;
		
		$('button').click(function(){
			var inputElement ='÷������ : ';
			inputElement += '<input type="file" ';
			inputElement += 'name="fileList['+fileCount+']"><br>';
			fileCount++;
			
			$('input[type="submit"]').before(inputElement);
		})
	})
</script>
</head>
<body>
	<button>�����߰�</button><br>
	<hr>	
	<form action="uplodeFile.do" method="post" 
							enctype="multipart/form-data">
		÷������:<input type="file" name="fileList[0]"><br>
		
		<input type="submit" value="���ε�">
	</form>
</body>
</html>
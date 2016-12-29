<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>회원가입 폼</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
$(function () {
	$('#btnIdCheck').click(function() {
		var inputId = $('#id').val();
		$.ajax({
			url:"idCheck.do",
			data:"id="+inputId,
			success:function(result){
				if(result=='false'){
					$('#idCheckResult').text('사용가능한 아이디 입니다.');
					$('#idCheckResult').css('color','green');
				}else {
					$('#idCheckResult').text('중복된 아이디 입니다.');
					$('#idCheckResult').css('color','red');
				}
			},
			error:function(){
				alert('ajax 통신 에러')
			}
		})
		return false;
	})
})

</script>
<body>
<form action="join.do" method="post">
	<table border="1">
		<tr>
			<td>ID:</td>
			<td>
			    <input type="text" name="id" id="id">
				<button id="btnIdCheck">아이디 중복체크</button>
				<div id="idCheckResult"></div>
			</td>
		</tr>
		<tr>
			<td>PW:</td>
			<td>
			   <input type="password" name="password">
			</td>
		</tr>
		<tr>
			<td>EMAIL:</td>
			<td>
			   <input type="email" name="email">
			</td>
		</tr>
		<tr>
			<td>PHONE:</td>
			<td>
			   <input type="tel" name="phone">
			</td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="submit" value="제출">
			</td>
		</tr>
	</table>
</form>

</body>
</html>
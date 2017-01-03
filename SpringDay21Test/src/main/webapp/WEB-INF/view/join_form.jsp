<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>가입</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
$(function () {
	$('#idCheck').click(function() {
		var id = $('#id').val();
		$.ajax({
			url:"idCheck.do",
			data:"id="+id,
			success:function(result){
				if(result=='false'){
					$('#checkResult').text('사용가능한 아이디');
					$('#checkResult').css('color','green');
				}else {
					$('#checkResult').text('중복된 아이디');
					$('#checkResult').css('color','red');
				}
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
				<th>아이디</th>
				<td>
				<input type="text" name="id" id="id">
				<button id="idCheck">중복체크</button>
				<div id="checkResult"></div>
				</td>
			</tr>

			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="password"></td>
			</tr>

			<tr>
				<th>이메일</th>
				<td><input type="email" name="email"></td>
			</tr>

			<tr>
				<th>주소</th>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<th>핸드폰 번호</th>
				<td><input type="tel" name="phone"></td>
			</tr>

			<tr>
				<td colspan="2"></td>
				<td><input type="submit" value="확인">
			</tr>
		</table>
	</form>

</body>
</html>
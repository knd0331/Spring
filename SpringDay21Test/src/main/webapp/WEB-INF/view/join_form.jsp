<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 5.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>����</title>
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
					$('#checkResult').text('��밡���� ���̵�');
					$('#checkResult').css('color','green');
				}else {
					$('#checkResult').text('�ߺ��� ���̵�');
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
				<th>���̵�</th>
				<td>
				<input type="text" name="id" id="id">
				<button id="idCheck">�ߺ�üũ</button>
				<div id="checkResult"></div>
				</td>
			</tr>

			<tr>
				<th>��й�ȣ</th>
				<td><input type="password" name="password"></td>
			</tr>

			<tr>
				<th>�̸���</th>
				<td><input type="email" name="email"></td>
			</tr>

			<tr>
				<th>�ּ�</th>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<th>�ڵ��� ��ȣ</th>
				<td><input type="tel" name="phone"></td>
			</tr>

			<tr>
				<td colspan="2"></td>
				<td><input type="submit" value="Ȯ��">
			</tr>
		</table>
	</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>join_result.jsp</title>
</head>
<body>
	<h3>ȸ������ �Ϸ�</h3>
	<table>
		<tr>
			<td>�̸�</td>
			<td>${joinMember.name}</td>
		</tr>
		<tr>
			<td>���̵�</td>
			<td>${joinMember.id}</td>
		</tr>
		<tr>
			<td>�̸���</td>
			<td>${joinMember.email}</td>
		</tr>
		<tr>
			<td>�ּ�</td>
			<td>${joinMember.address}</td>
		</tr>
	</table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>join_success.jsp</title>
</head>
<body>
	<h2>���� �Ϸ�</h2>

	<table>
		<tr>
			<th>���̵�</th>
			<th>��ȭ��ȣ</th>
			<th>�̸���</th>
		</tr>
		<tr>
			<td>${joinMemberInfo.id}</td>
			<td>${joinMemberInfo.phone}</td>
			<td>${joinMemberInfo.email}</td>
		</tr>
	</table>

</body>
</html>
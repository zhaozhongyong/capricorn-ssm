<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
   
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>USERS</h1>
<table align="center" width="80%">
	<tr>
		<td>ID</td>
		<td>用户名</td>
		<td>密码</td>
	</tr>
	<c:forEach items="${users }" var="bean">
		<tr>
			<td>${bean.id }</td>
			<td>${bean.username }</td>
			<td>${bean.pwd }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
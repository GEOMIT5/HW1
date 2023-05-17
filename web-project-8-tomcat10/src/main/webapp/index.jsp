<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Controller" method="post">
		<label for="registrlogin">Логин:              
        </label>
        <input type="text" id="registrlogin" name="registrlogin">
        <label for="registrpass">Пароль:
        </label>
        <input type="password" id="registrpass" name="registrpass">
        <label for="registrrepass">Подтвердите пароль:
        </label>
        <input type="password" id="registrrepass" name="registrrepass">
        <button class="sendform" type="submit">Зарегистрироваться</button>
	</form>
</body>
</html>
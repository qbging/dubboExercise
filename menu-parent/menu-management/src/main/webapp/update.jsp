<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
<input type="hidden" name="id" value="${menu.id }"/>
父菜单:<select name="pid">
		<option value="0">根菜单</option>
		<c:forEach items="${allmenu }" var="am">
			<option value="${am.id }" <c:if test="${am.id == menu.pid }">selected="selected"</c:if>   >${am.name }</option>
		</c:forEach>
	</select><br/>
当前菜单名称:<input type="text" name="name" value="${menu.name }"/><br/>
<input type="submit" value="修改"/>
</form>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <%@taglib uri= "http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:out value="name"></c:out>

<jsp:useBean id="test1" class ="DEMO_BEAN.testBean" scope="page"></jsp:useBean>

<p> fdfd111:<c:out value="${test1.name }" /></p>

</body>
</html>
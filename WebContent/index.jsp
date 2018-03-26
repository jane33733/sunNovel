<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html xmlns:spry="http://ns.adobe.com/spry">
<head>

<link href="css/pinkTable.css" rel="stylesheet" type="text/css">
<jsp:include page="pages/basicPage.jsp"></jsp:include>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Novel game</title>
</head>

<body>

<br>
哈囉~歡迎來玩小說小遊戲 ^ w ^, 我是走走~
<br>

<form class="form-inline" action="LoginServlet" method="post">
			
	<label for="rg-from">請輸入遊戲帳號</label>
	<div class="form-group">
	  <input type="text" id="account" name="account" value="haha" class="form-control">
	</div>
	
	<div class="form-group">
		<label for="rg-from">請問你要讀取哪一個檔案?</label>
	 	<!-- 一個表格可以選檔案 -->
	</div>
	
	
	<!--practice restful post-->
	<button type="submit" value="login" class="btn btn-primary fr" id="login">
		進入遊戲
	</button>

</form>

	
	
	
</body>
</html>
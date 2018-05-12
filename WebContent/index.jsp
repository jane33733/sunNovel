<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html xmlns:spry="http://ns.adobe.com/spry">
<head>

<jsp:include page="/pages/basicPage.jsp"></jsp:include>
<script src="<c:url value="/js/pages/index.js"/>"></script>
<link href="<c:url value='/css/dark-theme.css'/>" rel="stylesheet" media="screen">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Novel game</title>
</head>

<body>

<br/>


<div class="container-fluid">
	<div class="row">
		<div class="col-md-8">
		
			<p>
			哈囉~歡迎來玩小說小遊戲 ^ w ^, 我是走走~<br/>
			試著用網頁來作電子小說~ 希望能享受到樂趣~<br/>
			</p>
	
			<!-- 收和版面開頭 -->
			<div id="card-547903">
				<div class="card">
					<div class="card-header">
						 <a class="card-link collapsed" data-toggle="collapse" data-parent="#card-547903" href="#card-element-781361">開始新篇章</a>
					</div>
					<div id="card-element-781361" class="collapse">
						<div class="card-body">
							請輸入新的遊玩帳號<br/>
							<div class="form-group">
								<input type="text" id="newAccount" name="newAccount" placeholder="最多20字" class="form-control" maxlength="20">
								<br/>
								<button type="submit" id="newGameBtn" value="newGame" class="btn btn-secondary fr" onclick="loadGame()">
								進入遊戲
								</button>
							</div>
						</div>
					</div>
				</div>
				<div class="card">
					<div class="card-header">
						 <a class="collapsed card-link" data-toggle="collapse" data-parent="#card-547903" href="#card-element-550431">載入上次進度</a>
					</div>
					<div id="card-element-550431" class="collapse">
						<div class="card-body">
							請輸入上次使用的遊玩帳號<br/>
							<div class="form-group">
								<input type="text" id="loadAccount" name="loadAccount" placeholder="最多20字" class="form-control" maxlength="20">
								<br/>
								<button type="submit" id="loadGameBtn" value="loadGame" class="btn btn-secondary fr" onclick="loadGame()">
								載入遊戲
								</button>
							</div>				
						</div>
					</div>
				</div>
			</div>
			<!-- 收和版面尾巴 -->
			
			

			
		</div>
	</div>
</div>
	
	
	
</body>
</html>
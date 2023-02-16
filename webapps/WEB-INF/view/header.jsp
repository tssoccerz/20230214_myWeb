<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
	<div>
		<c:choose>
			<c:when test="${empty lgnss}">
				<button type="button" class="btn login">로그인</button>
			</c:when>
			<c:otherwise>
				<button type="button" class="btn logout">로그아웃</button>
			</c:otherwise>
		</c:choose>
	</div>

	<div>
		<%
		if(session.getAttribute("lgnss") == null){
		%>
			<button type="button" class="btn login">로그인</button>
		<%
		} else {
		%>
			<button type="button" class="btn logout">로그아웃</button>
		<%
		}
		%>
	</div>
	<hr>
	
	<script>
		$(".btn.login").on("click", handlerClickBtnLogin);
		$(".btn.logout").on("click", handlerClickBtnLogout);
		$(".btn.myinfo").on("click", handlerClickBtnMyinfo);
	
		function handlerClickBtnMyinfo(){
			console.log("BtnMyinfo 눌림");
			location.href="<%=request.getContextPath()%>/myinfo";
		}
		function handlerClickBtnLogin(){
			console.log("btnLogin 눌림");
			location.href="<%=request.getContextPath()%>/login";
		}
		function handlerClickBtnLogout(){
			console.log("btnLogout 눌림");
			location.href="<%=request.getContextPath()%>/logout";
		}
	</script>
</header>
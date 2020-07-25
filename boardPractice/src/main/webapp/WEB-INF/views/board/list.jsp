<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
<div id="root">
	<header>
		<h1>게시판</h1>
	</header>
	<nav>
		홈-글 작성
	</nav>
	<hr />
	
	<section id="container">
		<form role="form" method="post" action="/board/write"> <!-- 왜 action이 write이지? write, list 모두 동작됨 -->
			<table>
				<tr><th>번호</th><th>제목</th><th>작성자</th><th>등록일</th></tr>
				
				<c:forEach items="${list }" var="list"> <!-- boardController에서 이름을 list로 정한 service.list()를 가져온 것 / var를 통해 이름을 list로 선언 -->
					<tr>
						<td><c:out value="${list.bno }" /></td> <!-- list에 있는 bno 불러오기 -->
						<td>
							<a href="/board/readView?bno=${list.bno }"><c:out value="${list.title }" /></a>
						</td>
						<td><c:out value="${list.writer }" /></td>
						<td><fmt:formatDate value="${list.regdate }" pattern="yyyy-MM-dd" /></td>
					</tr>
				</c:forEach>
			</table>
		</form>
		<hr />
	</section>
</div>	
</body>
</html>
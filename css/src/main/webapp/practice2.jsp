<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
#bascket {
	background: black;
	height: 200px;
	width: 300px;
	border-radius: 150px 50px;
	position: fixed;
	top: 5px; /* 화면 위쪽과 몇px 만큼 떨어져 있는지 정하는 속성 */
	right: 5px; /* 마찬가지로 화면 오른쪽과의 거리를 정하는 속성 */
	color: yellow;
	align-content: center;
	text-align: center;
}

#nav {
	background: lime;
	height: 200px;
	width: 1500px;
}

li {
	list-style: none;
	float: left;
	height: 80px;
	width: 200px;
	align-content: center;
	text-align: center;
	font-size: 25px;
	color: red;
}

li:first-child { /* 처음을 고르는 가상선택자 */
	border-radius: 50px 0px 0px 50px;
}

li:last-child { /* 마지막을 고르는 가상선택자 */
	border-radius: 0px 50px 50px 0px;
}

li:nth-child(2n+1) {
	background: orange;
}

li:nth-child(2n) {
	background: pink;
}

li:hover {
	font-size: 40px;
	background: white;
}

#td {
	height: 200px;
	width: 1500px;
}

table{
align-content: center;
}

td{
color: blue;
font-size: 25px;
text-align: center;
}

td:nth-child(2n+1) {
	background: pink;
	width: 200px;
	height: 50px;
}

td:nth-child(2n) {
	background: white;
	width: 400px;
	
}

</style>

</head>
<body>

	<div id="bascket">장바구니 들어가는 위치.</div>
	<div>
		<div id="nav">
			<ul>
				<li><a href="page1.jsp">css 적용</a></li>
				<li><a href="page2.jsp">선택자</a></li>
				<li><a href="page3.jsp">hover</a></li>
				<li><a href="page4.jsp">div 꾸미기</a></li>
			</ul>
		</div>

		<div id="td">
			<table>
				<tr>
					<td>제품번호</td>
					<td>100</td>
				</tr>
				<tr>
					<td>제품이름</td>
					<td>shoes1</td>
				</tr>
				<tr>
					<td>제품설명</td>
					<td>fun shoes1</td>
				</tr>
				<tr>
					<td>제품가격</td>
					<td>1000</td>
				</tr>
				<tr>
					<td>제조회사</td>
					<td>c100</td>
				</tr>
				<tr>
					<td>제품이미지</td>
					<td><img alt="응애" src=""></td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>
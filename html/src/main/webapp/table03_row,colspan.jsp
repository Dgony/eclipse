<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>table의 col, rowspan으로 세로 가로칸을 확장시킬 수 있다.</h3>
<table border="1">
	<tr>
		<th colspan="3">Table Data</th>
		<th rowspan="3">Table Data</th>
	</tr>
	
	<tr>
		<td>Table Data</td>
		<td rowspan="2">Table Data</td>	
		<td>Table Data</td>
	</tr>
	
	<tr>
		<td>Table Data</td>
		<td>Table Data</td>
	</tr>
</table>


<h3>테이블의 칸을 합해보자</h3>
<table border="1">
	<tr>
		<th colspan="3">column 3개를 합친 것</th>
		<th rowspan="3">row 3개를 합친 것</th>
	</tr>
	
	<tr>
		<td>5</td>
		<td rowspan="2">6 + 10</td>
		<td>7</td>
	</tr>
	
	<tr>
		<td>9</td>
		<td>11</td>
	</tr>
</table>

<h3>table 연습 문제</h3>
<table border="1">
	<tr>
		<td rowspan="2", bgcolor="pink">1</td>
		<td>2</td>
		<td>3</td>
		<td>4</td>
		<td>5</td>
	</tr>
	
	<tr>
		<td rowspan="2", bgcolor="green">7</td>
		<td>8</td>
		<td>9</td>
		<td>10</td>
	</tr>
	
	<tr>
		<td>11</td>
		<td colspan="3", bgcolor="blue">13</td>
	</tr>
	
	<tr>
		<td colspan="5", bgcolor="skyblue">16</td>
	</tr>
</table>

</body>
</html>
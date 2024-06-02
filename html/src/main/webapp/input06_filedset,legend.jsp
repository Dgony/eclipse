<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Fieldset ==> 각종 form 요소를 그룹별로 묶기 위해 사용</h2>
	<fieldset>
		<legend>입력 양식</legend>
		<!-- form을 구분하기 위한 태그, div와 비슷한 듯 -->
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" , value="제출 완료"></td>
			</tr>
		</table>
	</fieldset>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type = "text/javascript">
function age() { // input중에서 year를 입력한 정보를 가져와야 함
	alert('나이 계산 처리할 예정');
	// java는 name으로 정보를 가져왔다. js도 name으로 가져올 수 있을까?
	// 가져올 수 있다. 그렇지만 잘 쓰지 않음
	// 왜? ==> name은 여러개가 될 수 있어서 배열로 가지고 온다.
	// 자바스크립트에서 특정한 태그를 인식하고 싶으면 처음엔 id속성을 이용하는 것을 권장한다.
	let yearTag = document.getElementById('year'); //id가 year인 input태그 인식 
	let yearValue = yearTag.value; //'2000', window.parseInt(), parseFloat()
	let year2 = 2023;
	let age = year2 - parseInt(yearValue); // 위 과정을 그냥 한 괄호 안에 집어넣으면 안되나? ==> 됨. 지금은 그냥 과정을 봐야하서 그런 것임
	alert('당신의 나이는 ' + age)
	alert(yearTag) 
}


function rec() {
	alert('사각형의 면적 계산 처리할 예정')
	let width = document.getElementById('w');
	let widthValue = width.value;
	let height = document.getElementById('h');
	let heightValue = height.value;
	let rectangle = parseFloat(widthValue) * parseFloat(heightValue)
	alert('사각형의 면적은 ' + rectangle);
	
}
</script>
</head>
<body>
태어난 해 입력 <input name = "year" id = "year" value ="2000">
<button onclick="age()">나이 계산</button><br>
<br>
사각형의 가로 면적 : <input name = "w" id = "w"><br>
사각형의 세로 면적 : <input name ="h" id = "h">
<button onclick="rec()">사각형의 면적 계산</button><br>
<!-- 이런 경우 버튼이 2개 생겼으니까 js를 쓴다면 함수도 2개 만들어야 함 -->
<hr>
</body>
</html>
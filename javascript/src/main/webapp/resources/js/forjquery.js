function go() {
	let result = "";
	for (var i = 0; i < 1000; i++) {
		result += i + "<br>";
	}
	
	// document.write(result); 
	$("#re").html(result);
}

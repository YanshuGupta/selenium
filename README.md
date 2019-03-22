# selenium
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function myStateMenu() {
		
		var s = "<select id='state' name='state'><option value='' selected='selected'>Select a State</option><option value='Uttar Pradesh'>Uttar Pradesh</option><option value='Panjab'>Panjab</option><option value='MahaRashtra'>MahaRashtra</option></select>"
		
		document.getElementById("myStates").innerHTML = s;
		
	}
</script>
</head>
<body>
	<form action="">
		Emp Number:<input type="text" id="empNumber" name="empNumber">
		Name:<input type="text" id="name" name="name">
		
		<!-- <div id="oo"><select id='state' name='state'><option value='' selected='selected'>Select a State</option><option value='Uttar Pradesh'>Uttar Pradesh</option><option value='Panjab'>Panjab</option><option value='MahaRashtra'>MahaRashtra</option></select></div> -->
		<div id="myStates" name="myStates"></div>
		
		
	</form>
	<button onclick="myStateMenu">States</button>
</body>
</html>

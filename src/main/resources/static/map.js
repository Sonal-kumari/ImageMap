function callFun(value)
{
	let request = new XMLHttpRequest();
	request.open("GET", 'http://localhost:8082/display'+'?'+'sname='+value, true);
	request.send();
	request.onload=function()
	{
		console.log(request.responseText);
	}
	
}

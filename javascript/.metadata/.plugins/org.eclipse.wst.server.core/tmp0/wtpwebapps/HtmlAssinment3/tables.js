var str="";
for(var i=2;i<=10;i++){
	for(var j=1;j<=10;j++){
		str=str+i*j+",";
	}
	str=str+"<br>";
}
postMessage(str);
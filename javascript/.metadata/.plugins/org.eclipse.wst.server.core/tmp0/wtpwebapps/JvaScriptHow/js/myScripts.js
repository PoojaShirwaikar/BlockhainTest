document.getElementById("checkoutdiv").style.display = "none";

document.getElementById("products").onmouseover = function(event){
	
	
	var elem = event.target;
	if(elem.hasAttribute("src")){
		//alert(event.target);
		var id=elem.getAttribute("src");
		id= id.split(".");
		var id1 = id[0].split("/");
		//alert(id1[1]);
		changePic(id1[1],event.target);
		
	}
	
};

document.getElementById("checkout").onclick =function(){
	document.getElementById("checkoutdiv").style.display = "";
};

document.getElementById("products").onclick = function(event){
	document.getElementById("noItemMsg").style.display = "none";
	var elem = event.target;
	if(elem.hasAttribute("src")){
		
		var parent = elem.parentNode;
		
		var title = parent.getElementsByTagName("h2")[0].innerText;
		
		var price = parent.getElementsByTagName("p")[2].innerText;
		
		
		var listItem = document.createElement("li");
		listItem.innerHTML = "<img src='images/invalid.png' class='crossImg'/>&nbsp;"+title+"&nbsp;&nbsp;"+price+"&nbsp;"+
		"Qty<input type='number' id='qty' value=1/>";
		
		document.getElementById("cart-content").getElementsByTagName("ol")[0].appendChild(listItem);
		
		
	}
	
};
document.getElementById("cart-content").onclick = function(event){	
	var elemImg = event.target;
	if(elemImg.hasAttribute("src")){		
		var elemLI = elemImg.parentNode;		
		var elemOL = elemLI.parentNode;		
		elemOL.removeChild(elemLI);		
	}
	var len = elemOL.childNodes.length;
	if(len == 3){
	document.getElementById("noItemMsg").style.display = "block";
	}
	
	
};
document.getElementById("remove").onclick = function(){
	
	var cartDiv = document.getElementById("cart-content");
	var listElem = cartDiv.childNodes[1];
	
	listElem.innerHTML = "<li><label id='noItemMsg'>You have no items in the cart</label></li>";
	
};




document.getElementById("submit").onclick = function(){
	var name = document.getElementById("txtUserName").value;
	var pwd =  document.getElementById("txtPwd").value;	
	 xmlHttp;
	if(window.XMLHttpRequest){
		xmlHttp = new XMLHttpRequest();
	}
	else{
		xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
	}	
	var postData = "name="+name+"&pwd="+pwd;
	xmlHttp.open("POST","jsp/userDetails.jsp",true);
	xmlHttp.onreadystatechange = function(){
		console.log(xmlHttp.readyState);
		if(xmlHttp.readyState == 4 && xmlHttp.status == 200){			
			var res = JSON.parse(xmlHttp.responseText);			
			if(res.Delivery_city == 'unknown'){
				alert('you are not a registered user. Sign in first to Purchase');
			}
			else{
				alert('your order will reach at '+ res.Delivery_City + 'you have chosen your payment mode to' + res.Payment_mode);
			}			
		}
	};
	xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
	xmlHttp.send(postData);
	
};


function changePic(name,elemImg){
	var max = 3;
	var min = 1;
	
	var num = Math.floor(Math.random()* max - min + 1)+ min;
	
	//elemImg.style.display="";
	elemImg.setAttribute("src","laptops/"+name+"/"+name+""+num+".jpg");

	
}
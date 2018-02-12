checkoutdiv.style.display = "none";

var x = document.getElementsByClassName('product');
var count = 0;
var r = document.getElementById('remove');
r.onclick = removeall;

function removeall() {
	// console.log(y);
	if (!document.getElementById('noItemMsg')) {
		var y = document.getElementById('cart-content').firstElementChild;

		while (y.firstChild) {

			y.removeChild(y.firstChild);

		}

		count = 0;
		// if (count==0) {
		var y = document.getElementById('cart-content');
		var li = document.createElement("li");
		li.setAttribute("id", "noItemMsg");
		li.appendChild(document
				.createTextNode("You have no items in your cart."));
		y.firstElementChild.appendChild(li);
		// }
	}

}

x[0].onmouseover = hover;
x[1].onmouseover = hover1;
x[2].onmouseover = hover2;

// console.log(x[0].childNodes[3].childNodes[1].innerHTML);

x[0].onclick = add1;
x[1].onclick = add2;
x[2].onclick = add3;

function hover() {
	// console.log(x[0].firstElementChild);

	var i = Math.floor((Math.random() * 3) + 1);
	x[0].firstElementChild.src = "laptops/apple/apple" + i + ".jpg";

}

function hover1() {

	var i = Math.floor((Math.random() * 3) + 1);
	x[1].firstElementChild.src = "laptops/dell/dell" + i + ".jpg";

}

function hover2() {

	var i = Math.floor((Math.random() * 3) + 1);
	x[2].firstElementChild.src = "laptops/hp/hp" + i + ".jpg";

}

function add1() {
	// alert("hey");
	count++;
	var y = document.getElementById('cart-content');

	if (document.getElementById('noItemMsg'))
		document.getElementById('noItemMsg').remove();

	var li = document.createElement("li");
	var p1 = document.createElement("input");
	p1.setAttribute("type", "number");
//	p1.setAttribute("min", "0");
	var p2 = document.createElement("img");
	p2.setAttribute("id", "removeelement");
	p2.setAttribute("src", "images/invalid.png");

	li.append(p2);

	li.appendChild(document.createTextNode("ITEM:"
			+ x[0].childNodes[3].childNodes[1].innerHTML + " PRICE: "
			+ x[0].childNodes[5].innerHTML));
	li.append(p1);
	y.firstElementChild.appendChild(li);

	p2.addEventListener("click", function() {
		var d = p2.parentNode;
		console.log(d);
		y.firstElementChild.removeChild(d);
		count--;

		if (count == 0) {

			// var y = document.getElementById('cart-content');
			// var li = document.createElement("li");
			var l = document.createElement("lable");
			l.setAttribute("id", "noItemMsg");
			l.appendChild(document
					.createTextNode("You have no items in your cart."));
			// li.appendChild(l);
			y.appendChild(l);
		}
	}, true);

}

function add2() {
	// alert("hey");
	count++;
	if (document.getElementById('noItemMsg'))
		document.getElementById('noItemMsg').remove();

	var p1 = document.createElement("input");
	p1.setAttribute("type", "number");
	var p2 = document.createElement("img");
	p2.setAttribute("id", "removeelement");
	p2.setAttribute("src", "images/invalid.png");

	var y = document.getElementById('cart-content');
	var li = document.createElement("li");
	li.append(p2);
	li.appendChild(document.createTextNode("ITEM:"
			+ x[1].childNodes[3].childNodes[1].innerHTML + " PRICE: "
			+ x[1].childNodes[5].innerHTML));
	li.append(p1);
	y.firstElementChild.appendChild(li);

	p2.addEventListener("click", function() {
		var d = p2.parentNode;
		y.firstElementChild.removeChild(d);
		count--;
		if (count == 0) {

			// var y = document.getElementById('cart-content');
			// var li = document.createElement("li");
			var l = document.createElement("lable");
			l.setAttribute("id", "noItemMsg");
			l.appendChild(document
					.createTextNode("You have no items in your cart."));
			// li.appendChild(l);
			y.appendChild(l);
		}
	}, true);

}

function add3() {
	// alert("hey");
	count++;

	if (document.getElementById('noItemMsg'))
		document.getElementById('noItemMsg').remove();

	var p1 = document.createElement("input");
	p1.setAttribute("type", "number");
	var p2 = document.createElement("img");
	p2.setAttribute("id", "removeelement");
	p2.setAttribute("src", "images/invalid.png");

	var y = document.getElementById('cart-content');
	var li = document.createElement("li");
	li.append(p2);

	li.appendChild(document.createTextNode("ITEM:"
			+ x[2].childNodes[3].childNodes[1].innerHTML + " PRICE: "
			+ x[2].childNodes[5].innerHTML));
	li.append(p1);
	y.firstElementChild.appendChild(li);

	p2.addEventListener("click", function() {
		var d = p2.parentNode;
		y.firstElementChild.removeChild(d);
		count--;
		// console.log(y.hasChildNodes());
		if (count == 0) {

			// var y = document.getElementById('cart-content');
			// var li = document.createElement("li");
			var l = document.createElement("lable");
			l.setAttribute("id", "noItemMsg");
			l.appendChild(document
					.createTextNode("You have no items in your cart."));
			// li.appendChild(l);
			y.appendChild(l);
		}

	}, true);

}

document.getElementById("submit").onclick = getDetails;

function getDetails() {
	checkoutdiv.style.display = "none";

	xmlhttp = new XMLHttpRequest();
	var name = document.getElementById('txtUserName').value;
	var password = document.getElementById('txtPwd').value;

	var url = "jsp/userDetails.jsp";
	xmlhttp.open("POST", url, true);
	xmlhttp.setRequestHeader('Content-type',
			'application/x-www-form-urlencoded');
	xmlhttp.onreadystatechange = handleResponse;

	var data = "name=" + name + "&pwd=" + password;
	xmlhttp.send(data);
}

function handleResponse() {

	if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
		var response = JSON.parse(xmlhttp.responseText);
		alert("Your order will reach at: "+response.Delivery_City+" you have chosen your payment mode as "+response.Payment_mode);

	}

}

document.getElementById('checkout').onclick = checkOut;

function checkOut() {
	checkoutdiv.style.display = "block";

}
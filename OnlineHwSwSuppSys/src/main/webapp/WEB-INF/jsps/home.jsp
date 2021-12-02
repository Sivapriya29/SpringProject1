<!dotype html>
<html>
<head>
<meta charset="utf-8">
<title>Online Hardware and SOftware Support System</title>
<style>
@import url('https://fonts.googleapis.com/css?family=Josefin+Sans&display=swap');
*{
padding:0;
margin: 0;
text-decoration:none;
list-style:none;
box-sizing:border-box;
font-family: 'Josefin Sans', sans-serif;
}
body{
font-family: 'Josefin Sans', sans-serif;
}
.banner{
	height: 100vh;
	width: 100%;
	background:url('https://cdn.wallpapersafari.com/26/71/aH4Fb5.jpg');
	background-position: top;
	background-size:cover;
	background-repeat: no-repeat;
}
nav{
background: #4b4276;
height:80px;
width:100%;

}
label.logo{
color:white;
font-size:25px;
line-height:80px;
padding: 0 100px;
font-weight:bold;
}
nav ul{
float:right;
margin-right:20px;
}
nav ul li{
display:inline-block;
line-height:80px;
margin:0 5px;
}
nav ul li a{
color:white;
font-size:17px;
padding:7px 13px;
border-radius:3px;
text-decoration:none;
color:#fff;
text-transform:uppercase;
}
nav ul li a::after{
content: '';
color:white;
font-size:17px;
padding:7px 13px;
border-radius:3px;
left:0;
bottom:-10px;
transition:0.5s;
text-transform:uppercase;
}
.nav ul li:hover::after{
	width:100%;
}
a.active,a:hover{
transition:.5s;
}
.banner .info{
	margin-top:15%;
	transform: translateY(-15%);
}
.banner .info h1{
	font-size: 2.5em;
	font-weight: 700;
	color: #fff;
	letter-spacing: 2px;
}
.banner .info p{
	font-size: 2em;
	font-weight: 500;
	color: #aaa;
	letter-spacing: 2px;
}
.banner .info h4{
	font-size: 2.5em;
	font-weight: 700;
	color: white;
	
	letter-spacing: 2px;
}
.banner .info h4{
	font-size: 2em;
	font-weight: 500;
	color: #aaa;
	letter-spacing: 2px;
}
.content{
	width:100%;
	position:absolute;
	top:80%;
	transform:translateY(-70%);
	transform:translateZ(-30%);
	text-align:center;
	color:#fff;
}
.content h1{
	font-size:30px;
	margin-top:70px;
}
.contents{
	width:100%;
	position:absolute;
	top:90%;
	transform:translateY(-50%);
	transform:translateZ(-30%);
	text-align:center;
	color:#fff;
}
.contents h1{
	font-size:30px;
	margin-top:70px;
}

</style>
</head>
<body>
<div class="container-fluid banner">
<nav>
<label class="logo">WELCOME</label>
<ul>
<li><a class="active" href="login">LOGIN</a></li>
<li><a href="employee">SIGN-UP</a></li>
</ul>
</nav>
	<div class="col-md-8 offset-md-2 info">
	<h1 class><center>ONLINE HARDWARE/SOFTWARE<br>SUPPORT SYSTEM</center></h1>
	</div>
	<div class="content">
	<h4>SERVICES<br><br>We provide solutions to any kind of hardware and software disfunctions.</h4>
	</div>
	<div class="contents">	
	<h4>CONTACT US<br><br>Reach Out Us On Email: hrs@gmail.com</h4>
	</div>
</div>
</body>
</html>
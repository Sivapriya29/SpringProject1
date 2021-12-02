<!doctype html>
<html>
<head>
<title>Get By ID</title>
</head>
<style>
@import url('https://fonts.googleapis.com/css?family=Josefin+Sans&display=swap');

*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  list-style: none;
  text-decoration: none;
  font-family: 'Josefin Sans', sans-serif;
}

body{
   background-color: #f3f5f9;
   font-size: 18px;
 font-weight: bold;
}

.wrapper{
  display: flex;
  position: relative;
}

.wrapper .sidebar{
  width: 300px;
  height: 100%;
  background: #4b4276;
  padding: 30px 0px;
  position: fixed;
}

.wrapper .sidebar ul{
  margin: 0;
  padding: 0;
  text-align:center;
 color:#fff;
}
.wrapper .sidebar ul u{
  margin: 0;
  padding: 0;
  text-align:center;
 text-decoration-line: underline;
 color:#fff;
 font-size: 18px;
 font-weight: bold;
}
*{
margin: 0;
padding: 0;
}
.banner{
width:100%;
height:100vh;
background-image: linear-gradient(rgba(0,0,0,0.75),rgba(0,0,0,0.75)),url('https://wallpapers.com/images/high/plain-white-background-rw2ymugeo9xdbrpv.jpg');
}
.navbar{
width:85%;
margin:auto;
padding:35px 0;
display:flex;
align-items:center;
justify-content:space-between;
font-size: 18px;
 font-weight: bold;
}
.logo{
width:120px;
cursor:pointer;
}
.navbar ul li{
	list-style:none;
	display:inline-block;
	margin:0 20px;
	position: relative;
}
.navbar ul li a{
text-decoration:none;
color:#fff;
text-transform:uppercase;
}
.navbar ul li::after{
content: '';
height:3px;
width:0;
background-color:white;
position:absolute;
left:0;
bottom:-10px;
transition:0.5s;
}
.navbar ul li:hover::after{
	width:100%;
}
.content{
	width:100%;
	position:absolute;
	top:50%;
	transform:translateY(-50%);
	text-align:center;
	color:#fff;
}
.content h1{
	font-size:30px;
	margin-top:80px;
}
.submit{
  background-color: white;
  color: black;
  padding: 15px 32px;
  text-align: center;
  font-size: 16px;
}

 fieldset{
            background-color: #f1f1f1;
            border: none;
            border-radius: 2px;
            margin-bottom: 12px;
            overflow: hidden;
            padding: 0 .625em;
        }

        label{
            cursor: pointer;
            display: inline-block;
            padding: 3px 6px;
            text-align: right;
            width: 150px;
            vertical-align: top;
        }

        input{
            font-size: inherit;
        }
</style>
<body>
<div class="wrapper">
    <div class="sidebar">
</div>
</div>
<div class="banner">
<div class="navbar">
<img src= "log." class="logo">
<ul>
<li><a href="engportal">Home</a></li>
</ul>
</div>

<div class="content">
<h1>SEARCH BY ENGINEER ID </h1>
<br><br>
<form action="gettingcomplaintByengid" method="get" >
</fieldset>

<label>ENGINEER ID</label>
<input type="text" name="engId" placeholder="EngineerId" required /> 
<br><br>
<input type="submit" value="Get Complaint"class="submit" name="save" id="submit">

</fieldset>
</form>
</div>
</div>
</body>
</html>
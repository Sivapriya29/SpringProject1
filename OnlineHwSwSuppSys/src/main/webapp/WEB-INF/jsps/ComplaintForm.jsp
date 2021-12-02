<!DOCTYPE html>
<head>
<title>Complaint register</title>
<script src="https://kit.fontawesome.com/b99e675b6e.js"></script>
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
}

.wrapper{
  display: flex;
  position: relative;
}

.wrapper .sidebar{
  width: 330px;
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
.button{
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
	<br><br><br><br><br><br><br><br>
	<br><br>
	<ul>
	<li><u>HARDWARE/SOFTWARE SUPPORT</u></li>
	<br><br>
	<li> &#9658;  Maintenance services include both hardware maintenance and support services, and network software maintenance and support services.</li>
	<br>
	<li> &#9658;  Hardware maintenance and support services are preventive and remedial services that physically repair or optimize hardware, including contract maintenance and per-incident repair.</li>
    </ul>
</div>
</div>
<div class="banner">
<div class="navbar">
<img src= "log.png" class="logo">
<ul>
<li><a href="empportal">Home</a></li>
</ul>
</div>
<div class="content">
<h1>COMPLAINT REGISTRATION</h1>
<br><br>
<form id="add" action="registeringcomplaint" method="post">
</fieldset>
<label><b>EMPLOYEE ID</b></label>
<input type="text" name="empId" id="empId" style="width: 350px;" placeholder="Enter employee Id" required>
<br><br>
<label for="type"><b>COMPLAINT</b></label>
 <select id="name" name="compType" style="width: 350px; height: 30px; " required>
 <option value="">None</option>
  <option value="h/w">---------------------------------Hardware-----------------------------------</option>
  <option value="s/w">---------------------------------Software-----------------------------------</option>  
 </select>
 <br><br>
<label for="desc"><b>DESCRIPTION</b></label>
<input type="text" name="compDesc" id="name" style="width: 350px; height: 100px;"required>
<br><br>
<label for="type"><b>STATUS</b></label>
 <select id="status" name="compSts" style="width: 350px; height: 30px; "required>
 <option value="pending">---------------------------------Pending-----------------------------------</option>  
  <option value="solved">---------------------------------Solved-----------------------------------</option>
 </select>
 <br><br>
 <input type="submit" value="Save" class="button" name="save" id="submit">
  <input type="reset" value="Reset" class="button" name="reset" id="reset">
 
</div>
</div>
</fieldset>
</form>
</body>
</html>
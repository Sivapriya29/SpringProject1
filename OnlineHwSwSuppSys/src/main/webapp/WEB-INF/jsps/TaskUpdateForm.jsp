<!doctype html>
<html>
<head>
<title>Assign Engineer</title>
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
background-image: linear-gradient(rgba(0,0,0,0.50),rgba(0,0,0,0.50)),url('https://wallpapers.com/images/high/plain-white-background-rw2ymugeo9xdbrpv.jpg');
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
<h2>ENGINEER TASK STATUS</h2>
<br><br>
<form id="add" action="taskupdating" method="post">
</fieldset>
<label>Engineer Id</label>
<input type="text" name="engId" id="name" placeholder="Enter engineer Id" required>
<br><br>
<label>Engineer Name</label>
<input type="text" name="engName" id="name" placeholder="Enter engineer name" required>
<br><br>
<label>Complaint Id</label>
<input type="text" name="compId" id="name" placeholder="Enter complaint Id" required>
<br><br>
<label>Solution</label>
<input type="text" name="soln" id="name" style="width: 200px; height: 100px;" placeholder="Enter Solution" required>
<br><br>
<label for="engineer status" >Engineer Status</label>
  <select name="engSts" id="name" style="width: 200px; height: 30px; "required>
  <option value="">None</option>
    <option value="allocated">Engaged</option>
    <option value="available">Available</option>   
  </select>
  <br><br>
  <label for="complaint status" >Complaint Status</label>
  <select name="compSts" id="name" style="width: 200px; height: 30px; "required>
  <option value="">None</option>
    <option value="Pending">Pending</option>
    <option value="in-progress">In-Progress</option>
    <option value="solved">Solved</option>
  </select>
  <br><br>
<input type="submit" value="Update" name="submit" id="submit" class="submit">
</div>
</div>
</fieldset>
</form>
</body>
</html>
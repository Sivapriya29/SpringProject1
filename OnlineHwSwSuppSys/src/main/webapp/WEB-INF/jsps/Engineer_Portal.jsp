<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>ENGINEER</title>
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

.wrapper .sidebar h2{
  color: #fff;
  text-transform: uppercase;
  text-align: center;
  margin-bottom: 30px;
}

.wrapper .sidebar ul li{
  padding: 15px;
  border-bottom: 1px solid #bdb8d7;
  border-bottom: 1px solid rgba(0,0,0,0.05);
  border-top: 1px solid rgba(255,255,255,0.05);
}    

.wrapper .sidebar ul li a{
  color: #bdb8d7;
  display: block;
}

.wrapper .sidebar ul li a .fas{
  width: 25px;
}

.wrapper .sidebar ul li:hover{
  background-color: #594f8d;
}
    
.wrapper .sidebar ul li:hover a{
  color: #fff;
}

.wrapper .main_content{
  width: 100%;
  margin-left: 320px;
}

.wrapper .main_content .header{
  padding: 20px;
  background: #fff;
  color: #717171;
  border-bottom: 1px solid #e0e4e8;
}

.wrapper .main_content .info{
  margin: 20px;
  color: #717171;
  line-height: 25px;
}

.wrapper .main_content .info div{
  margin-bottom: 20px;
}

.logoutLblPos{

   position:fixed;
   right:20px;
   top:35px;
}
</style>
<body>
<div class="wrapper">
    <div class="sidebar">
        <h2>DASHBOARD</h2>
        <ul>
             <li><a href="getcomplaintstatus"><i class="fas fa-check"></i>View Task</a></li>
            <li><a href="getcomplaintdesc"><i class="fas fa-check"></i>Complaint Description</a></li>
             
            <li><a href="updatetask"><i class="fas fa-magic"></i>Update Status</a></li>
            
			</ul> 
    </div>
    <div class="main_content">
        <div class="header"><h1><center>ENGINEER PORTAL</center></h1></div>  
        <div class="info">
		<div><Welcome></div>
        </div>
    </div>
	<div class="logoutLblPos">
  <a href="login"><i class="fas fa-user"> Logout</i></a>
  </div>
</div>
</body>
</html>
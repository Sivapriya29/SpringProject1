<!doctype html>
<html><head>
<title>Login</title>
<style>
div.main{

width:400px;
margin:100px auto 0px auto;
}
h2{
text-align:center;
padding:20px;

font-family:sans-serif;
}
div.add{
background-color:rgba(0,0,0,0.5);
width:100%;
font-size:18px;
border-radius:10px;
padding:10px;

border:1px solid rgba(255,255,255,0.3);
box-shadow:2px 2px 15px
rgba(0,0,0 ,0.3);
color:#ff;
}
form #add{
margin:40px;
}
label{
font-family:sans-serif;
font-size:18px;
font-stle:italic;
padding:10px;
margin:10px;
}
input#name{
width:300px;
border:1px solid #ddd;
border-radius:3px;
outline:0;
padding:10px;
margin:10px;
background-color:#fff;
box-shadow :inset 1px 1px 5px
rgba(0,0,0,0.3);
}
input#submit{
width:200px;
padding:7px;
font-size:16px;
font-family:sans-serif;
font-weight:600;
border:none;
border-radius:3px;
padding:10px;
margin:10px;
background-color:rgba(250,100,0,0.8);
color:#fff;
cursor:pointer;
border:1px solid
rgba(255,255,255,0.3);
box-shadow:1px 1px 5px
rgba(0,0,0,0.3);
margin-bottom:20px;

}
label,span,h2{
text-shadow:1px 1px 5px
rgba(0,0,0,0.3);
}



</style>


</head>
<body>
<div class="main">

<div class ="add">
<h2>Login</h2>
<body bgcolor="wheat"/>
<form id="add"action="doLogin" method="post">
<label>Username:</label>
<br>
<input type="email" name="username" id="name" placeholder="Enter email address" required>
<br><br>
<label>Password:</label>
<br>
<input type="password" name="password" id="name" placeholder="Enter password" required>
<br><br>

<label for="loginas">Login As:</label>
  <select name="role" id="name" style="width: 200px; height: 30px;" required>
  <option value="">None</option>
    <option value="hod">HOD</option>
    <option value="engineer">Engineer</option>
    <option value="employee">Employee</option>
   
  </select>
  <br><br>

<input type="submit" value="Login" name="save" id="submit"><hr>
<a href="employee">New Employee? SignUp</a>
</form>
</div>
</div>
</body>
</html>




<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>success</title>
<style>
div.main{

width:500px;
height:500px;
margin:100px auto 0px auto;
}
h2{
text-align:center;
padding:5px;

font-family:sans-serif;
}
div.add{
background-color:rgba(0,0,0.3,0);
width:100%;
font-size:18px;
border-radius:10px;
padding:10px;
border:1px solid rgba(255,255,255,0.3);
box-shadow:2px 2px 15px
rgba(0,0,0 ,0.3);
color:#ff;
}
input#submit{
width:100px;
padding:10px;
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

h1,h2{
text-shadow:1px 1px 5px
rgba(0,0,0,0.3);
}
</style>

</head>
<body bgcolor="wheat" >
<div class="main">
<div class ="add">
<h1 align="center" style="color: maroon;">${ans.engName}(${ans.engId}) is allocated to task successfully..</h1>

<center><a href="hodportal">
<input  type="submit" value="Home" name="save" id="submit"></a></center>


</body>
</html>

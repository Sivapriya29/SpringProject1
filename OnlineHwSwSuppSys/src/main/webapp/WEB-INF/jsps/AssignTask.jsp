<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function clickAndDisable(link) {
    // disable subsequent clicks
    link.onclick = function(event) {
       event.preventDefault();
    }
    var link = document.getElementById("Para");
    link.getAttribute("href");
    link.setAttribute("href",
        "assigningtask");
    link.textContent = "Task Assigned";
  }   
    </script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1 align="right"> <a class="btn btn-primary" href="hodportal"  ><h5> Home</h5></a></h1>



<h1 align="center">Assign a Task</h1>

<hr>

<table class="table">
  <thead>
    <tr>
     
      <th scope="col">Complaint ID</th>
            <th scope="col">Complaint Type</th>
      
            <th scope="col">Complaint Description</th>
      
      
      <th scope="col">Complaint Status</th>
       

    </tr>
  </thead>
  <tbody>
    
  
    
    <c:forEach var="comp" items="${compList}">
    
    <tr>
          
      <td><c:out value="${comp.compId }"></c:out> </td>
            <td><c:out value="${comp.compType }"></c:out> </td>
                  <td><c:out value="${comp.compDesc }"></c:out> </td>
            
      
    
      <td><c:out value="${comp.compSts }"></c:out> </td>
      				     <td><a  class="btn btn-primary" href="assigningtask" id="Para" onclick="clickAndDisable(this);">Assign Task to Engineer</a></td>
      
      
    </tr>

    </c:forEach>
    
    
  </tbody>
</table>
</body>
</html>
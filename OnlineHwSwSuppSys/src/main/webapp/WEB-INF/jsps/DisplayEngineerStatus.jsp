<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1 align="right"> <a class="btn btn-primary" href="hodportal"  ><h5> Home</h5></a></h1>




<h1 align="center">Engineer Status </h1>

<hr>




<table class="table">
  <thead>
    <tr>
      <th scope="col">Engineer ID</th>
      <th scope="col">Engineer Name</th>
      <th scope="col">Engineer Status</th>
       

    </tr>
  </thead>
  <tbody>
    
  
    
    <c:forEach var="comp" items="${compList}">
    
    <tr>
          <td><c:out value="${comp.engId }"></c:out> </td>
    
      <th scope="row"><c:out value="${comp.engName }"></c:out></th>
      
    
      <td><c:out value="${comp.engSts }"></c:out> </td>
     
      
    </tr>

    </c:forEach>
    
    
  </tbody>
</table>




</body>
</html>
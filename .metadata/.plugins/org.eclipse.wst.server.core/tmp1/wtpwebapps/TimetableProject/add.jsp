<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add</title>
<link type="text/css" rel="stylesheet" href="rsc/css/bootstrap.css">
</head>
<body>
  <div class="container" style="margin: 0 auto; padding: 20px;">
   <form method="post" action="CRUD?action=add"">
      <table class="table">
       <tr>
         <th>Station: </th>
         <th><input type="Text" name="St"></th>
        </tr>
       <tr>
         <th>Final Station: </th>
         <th><input type="Text" name="fSt"></th>
        </tr>
       <tr>
         <th>Days walking</th>
         <th>
            <input type="radio" name="walkDays" checked="checked" value="everyday"> Everyday
           <input type="radio" name="walkDays" value="weekend"> Weekend
           <input type="radio" name="walkDays" value="weekdays"> Weekdays
         </th>
        </tr>
       <tr>
       <tr>
         <th>Departure time</th>
          <th> 
           <select name="departurelHour" size=1>
             <c:forEach var="i" begin="0" end="9">
              <option select value="0${i }"> 0${i }
             </c:forEach>
             <c:forEach var="i" begin="10" end="24">
              <option select value="${i}"> ${i }
             </c:forEach>
           </select>
            <select name="departureMinute" size=1>     
              <c:forEach var="i" begin="0" end="9">
                <option select value="0${i }"> 0${i }
              </c:forEach>
              <c:forEach var="i" begin="10" end="60">
                <option select value="${i}"> ${i }
              </c:forEach>
            </select>
          </th>
        </tr>
       <tr>
       <tr>
         <th>Arrival time</th>
         <th>
          <select name="arrivalHour" size=1>
             <c:forEach var="i" begin="0" end="9">
               <option select value="0${i }"> 0${i }
             </c:forEach>
             <c:forEach var="i" begin="10" end="24">
               <option select value="${i}"> ${i }
             </c:forEach>
          </select>
           <select name="arrivalMinute" size=1>       
             <c:forEach var="i" begin="0" end="9">
               <option select value="0${i }"> 0${i }
             </c:forEach>
             <c:forEach var="i" begin="10" end="60">
               <option select value="${i}"> ${i }
             </c:forEach>
           </select>
         </th>
        </tr>
       <tr>
        <td><button type="Submit" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span>Add new railway</button>
         <a href="AppView.jsp" class="btn btn-primary"><span class="glyphicon glyphicon-step-backward"></span>back</a></td>
       </tr>
      </table>
   </form>
 </div>   
 
 <script src="https://ajax.google.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
 <script src="rsc/js.bootstrap.min.js"></script>
 <script src="http://code.jquery.com/jquery-latest.js"></script>
</body>
</html>
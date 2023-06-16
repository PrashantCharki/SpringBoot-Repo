<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 welcome to spring
 <form action="addAlien" method="post">
 <!--  Enter first number:<input type="text" name="num1"><br>
 Enter second number:<input type="text" name="num2"><br> -->
 Enter your id:<input type="text" name="aid"><br>
 Enter your name:<input type="text" name="aname"><br> 
 
 <input type="submit"> 
 </form>
 <hr>
 <form action="getAlien" method="get">
 Enter your id:<input type="text" name="aid"><br>
 <input type="submit"> 
 </form>
 <hr>
</body>
</html>
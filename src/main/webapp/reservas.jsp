<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reserva Hora</title>
</head>
<body>
 <h2> <%= request.getAttribute("reservas")%> </h2>
 <br>
 <h2>Agendamiento de Hora</h2>
   <input type="text" placeholder="Rut Dueño">
   <input type="text" placeholder="Nombre Mascota">
   <input type="time" >
   <input type="date">
   <input type="submit" value="Enviar"/>
   <br>
   
</body>
</html>
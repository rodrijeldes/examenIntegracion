<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
   <title>Login PetSmile</title>
</head>
<body>
<div >
<h1>Bienvenido a petSmile</h1>
<h4> Iniciar sesion</h4>
<form action="controladores" method="POST">
      Usuario: <input type="text" name="usuario"/><br/>
      Constraseña: <input type="text" name="password"/><br/>
      <input type="submit" value="Enviar"/>
</form>
</div>
</body>
</html>
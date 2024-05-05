<?php include "header_estilo.inc.php";?>

<form method="GET" action="http://localhost:8080/WebApplication4/NewServlet">
    <label for="username">Nombre de Usuario:</label>
    <input type="text" id="username" name="username"><br>
    <br>
    <label for="contra">Contraseña de Usuario:</label>
    <input type="text" id="contra" name="contra"><br><br>
    <input type="submit" value="ver en JAVA">
</form>
<br>
<form method="GET" action="http://localhost:54751/Default.aspx">
    <label for="username">Nombre de Usuario:</label>
    <input type="text" id="username" name="username"><br>
    <br>
    <label for="contra">Contraseña de Usuario:</label>
    <input type="text" id="contra" name="contra"><br><br>
    <input type="submit" value="ver en NET">
</form>

<?php include "footer_estilo.inc.php";?>
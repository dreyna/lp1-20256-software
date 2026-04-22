<%-- 
    Document   : index
    Created on : 22 abr. 2026, 8:46:17 a. m.
    Author     : docente.fia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/estilos.css"/>
    </head>
    <body>
        <div class="contenedor-tabla">
            <table class="tabla-productos">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Descripción</th>
                        <th>Precio</th>
                        <th>Stock</th>
                    </tr>
                </thead>
                <tbody id="resultado"></tbody>
            </table>
        </div>
        <script src="js/prod.js"></script>
    </body>
</html>

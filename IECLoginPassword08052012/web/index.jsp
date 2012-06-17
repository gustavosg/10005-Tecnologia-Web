<%-- 
    Document   : index
    Created on : 08/05/2012, 21:12:47
    Author     : Gustavo
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="script/script.js" ></script> 
        <link rel="stylesheet" type="text/css" href="CSS/style.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <form action="IECLoginPassword08052012" method="POST">
            <div id="windowBackground" align="left"> 

                <h1>Título</h1>

                <br>
                <label/>Informe seu nome: <input type="text" id="inputName" name="inputName" /> 
                <br>
                <label/>Informe sua senha: <input type="password" id="inputPassword" name="inputPassword"/> 
                <br>
                <button>Submit</button>

            </div>
            <p />
            <div id="windowDown">
                
                <label />Cadastre um novo usuário: <br />
                <input type="button" value="Cadastrar" onclick="window.open('newUser.jsp', 'Cadastro de Usuário', 'STATUS=YES, TOOLBAR=YES, LOCATION=YES, DIRECTORIES=NO, RESISABLE=NO, SCROLLBARS=YES, TOP=10, LEFT=10, WIDTH=770, HEIGHT=400');" />
                

            </div>
        </form>
    </body>
</html>

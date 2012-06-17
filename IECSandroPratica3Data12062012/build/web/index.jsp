<%-- 
    Document   : index
    Created on : 12/06/2012, 21:17:52
    Author     : Gustavo
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <script type="text/javascript"src="functions/jquery.js"></script>
        
        <title>JSP Page</title>
    </head>
    <body>
        <form>
        <label>Nome:</label>
        <input type="text" id="Nome"  /> <br />
        <label>Endereço</label>
        <input type="text" id="Endereco" /><br />
        <button type="submit" value="Enviar" id="Enviar" >Enviar</button>
        <script type="text/javascript" >
            $(document).ready(function() {
                
              $("#Enviar").click(
                function(){
                    if ($("#Nome:empty") )
                        alert("Campo nome vazio");
                    if ($("#Endereco:empty"))
                        alert("Campo endereço vazio");
                })
            });
            
        </script>
        </form>
    </body>
</html>

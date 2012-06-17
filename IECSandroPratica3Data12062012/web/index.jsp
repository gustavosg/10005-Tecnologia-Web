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
    <body onload="document.getElementById('Nome').focus()">
        <form>
            <label>Nome:</label>
            <input type="text" id="Nome" value="sexo" /><br />
            <label>Endereço</label>
            <input type="text" id="Endereco" value="Endereco"/><br />
            <button type="submit" value="Enviar" id="Enviar" >Enviar</button>
            <input type="hidden" id="dictionary" value="sexo, vagina" ></input>

            <script type="text/javascript" >
                $(document).ready(function() {
                    
                    $("#Enviar").click(
                    function(){
                        if ($("#Nome").val() == "" )
                            alert("Campo nome vazio");
                        //                        if ($("#Endereco:empty").val() == "")
                        //                            alert("Campo endereço vazio");
                        alert(document.getElementById('Nome').value);
                        var word = document.getElementById('dictionary').value;
                        alert(word);
                        for (var i = 0; i <= word.length; i++ ){
                            alert(word[i]);
                            if ($("#Nome").val() == word[i])
                            {
                                alert("Campo não pode conter esta palavra");
                            }
                        }
                    })
                });
            </script>

        </form>
    </body>
</html>

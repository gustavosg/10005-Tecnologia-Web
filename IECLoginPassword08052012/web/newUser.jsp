<%-- 
    Document   : newWindow
    Created on : 08/05/2012, 22:19:09
    Author     : Gustavo
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="script/script.js" ></script> 
        <link rel="stylesheet" type="text/css" href="CSS/style.css"/>
        <title>Cadastro de usuário</title>
    </head>
    <body>
        <h1>Hello World!</h1>

        <form name="newUser" method="POST">
            <table>
                <tr>
                    <td><label id="labelNome" >Nome:</label></td>
                    <td><input type="text" id="inputNome" id="inputNome" onfocus="onFocusNome(this)" /> </td>
                </tr><tr>
                    <td><label id="labelSobreNome">Sobrenome:</label></td>
                    <td><input type="text" id="inputSobreNome"  onfocus="onFocusNome(this)" /></td>
                </tr><tr>
                    <td><label id="labelSenha">Senha:</label></td>
                    <td><input type="password" id="inputSenha" /></td>
                </tr><tr>
                    <td><label id="labelConfirmarSenha">Confirmar Senha:</label></td>
                    <td><input type="password" id="inputConfirmarSenha" /></td>
                </tr><tr>
                    <td><label id="labelEmail"> Email: </label></td>
                    <td><input type="text" id="inputEmail"  onfocus="onFocusNome(this)" /></td>
                </tr><tr>
                    <td><label id="labelTel">Tel.:</label></td>
                    <td><input type="text" id="inputTel" onkeydown="formatTel(this, event)" maxlength="13"  onfocus="onFocusNome(this)" /></td>
                </tr><tr>
                    <td><label id="labelCel">Cel.:</label></td>
                    <td><input type="text" id="inputCel" onkeydown="formatTel(this, event)" maxlength="13"  onfocus="onFocusNome(this)" /></td>
                </tr>

            </table>
            <input type="button" value="Validar" onclick="callValidateServlet();" />
            
            
        </form>
    </body>
</html>

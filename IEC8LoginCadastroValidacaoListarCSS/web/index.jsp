<%-- 
    Document   : index
    Created on : May 8, 2012, 5:02:49 PM
    Author     : Wesley
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <script type="text/javascript" src="script/script.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <title>Instituto de Educação Continuada - PUC Minas</title>
  </head>
  <body>
    <h1>IEC PUC - Minas</h1>
    
    <form name="IECLogin" action="IECServletLogin" method="POST">
      <div id="windowBackground" align="left">
        <p align="center">
          Bem Vindo!
        </p>
        <p>
          E-mail: &nbsp &nbsp &nbsp <input tabindex="1" type="text" name="email_de_login" value="informe seu e-mail" size="35" class="entradaPadrao" onfocus="textoPadrao (this)" onblur="textoPadrao (this)"/>
        </p>

        <p>
          Senha: &nbsp &nbsp &nbsp <input tabindex="2" type="password" name="senha"/>
        </p>
                
        <p align="center">
          <input tabindex="3" type="submit" name="submit" value="Submit" class="botao"/>
        </p>
      </div>
    </form>        
    
    <p></p>
    
    <form name="IECNovaConta" action="page/novaconta.jsp" method="POST">
      <div id="windowDown" align="left">
        <p align="center">
          Gratuito!
        </p>
        <p align="center">
          <input type="submit" name="novaconta" value="Nova Conta" class="botao"/>
        </p>
      </div>
    </form>
  </body>
</html>

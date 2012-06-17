<%-- 
    Document   : index
    Created on : Apr 24, 2012, 5:00:59 PM
    Author     : Wesley
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <script type="text/javascript" src="script/script.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Boas vindas!</title>
  </head>
  <body>
    <h1>Hello World!</h1>

    <form name="boasvindasnome" action="ServletBoasVindasNome" method="POST">
        <p>
          Informe seu nome: &nbsp &nbsp &nbsp <input tabindex="1" type="text" name="login" value="digite seu nome" size="35" class="inputDefault" onfocus="defaultText (this)" onblur="defaultText (this)"/>
        </p>
        <p>
          <input tabindex="2" type="submit" name="submit" value="Submit" class="button"/>
        </p>
    </form>        
    
  </body>
</html>

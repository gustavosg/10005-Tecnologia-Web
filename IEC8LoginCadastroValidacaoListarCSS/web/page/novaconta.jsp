<%-- 
    Document   : novaconta
    Created on : May 8, 2012, 5:11:33 PM
    Author     : Wesley
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <script type="text/javascript" src="../script/script.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="../css/style.css">
    <title>Instituto de Educação Continuada - PUC Minas</title>
  </head>
  <body>
    <h1>IEC PUC - Minas</h1>
    
    <form name="IECNovaConta" id="cadastro" onsubmit="return verificaCamposCadastro ()" action="../IECServletCadastro" method="POST">
      <div id="fundo_padrao" align="left">
        <p align="center">
          Bem Vindo!
        </p>

        <p id="par_nome" class="testoPadrao">
          Nome: &nbsp &nbsp &nbsp <input tabindex="1" id="nome" type="text" name="nome" value="informe seu nome" size="35" class="entradaPadrao" onfocus="textoPadrao (this)" onblur="textoPadrao (this)"/>
        </p>

        <p id="par_sobrenome" class="testoPadrao">
          Sobrenome: &nbsp &nbsp &nbsp <input tabindex="2" id="sobrenome" type="text" name="sobrenome" value="informe seu sobrenome" size="35" class="entradaPadrao" onfocus="textoPadrao (this)" onblur="textoPadrao (this)"/>
        </p>
        
        <p id="par_email" class="testoPadrao">
          E-mail: &nbsp &nbsp &nbsp <input tabindex="3" id="email" type="text" name="email_de_login" value="informe seu e-mail" size="35" class="entradaPadrao" onfocus="textoPadrao (this)" onblur="textoPadrao (this)"/>
        </p>

        <p id ="par_senha" class="testoPadrao">
          Senha: &nbsp &nbsp &nbsp <input tabindex="4" id ="senha" type="password" name="senha"/>
        </p>  
          
        <p id ="par_confsenha" class="testoPadrao">  
          Confirme sua senha: &nbsp &nbsp &nbsp <input tabindex="5" id ="confsenha" type="password" name="confirmacao_senha"/>
        </p>
                
        <p id="par_cel" class="testoPadrao">
          Celular: &nbsp &nbsp &nbsp <input tabindex="6" id="cel" type="text" name="celular" value="" maxlength="16" class="entradaPadrao" onkeypress="mascaraTelefone (this)"/>
        </p>

        <p id="par_tel" class="testoPadrao">
          Telefone: &nbsp &nbsp &nbsp <input tabindex="7" id="tel" type="text" name="telefone" value="" maxlength="16" class="entradaPadrao" onkeypress="mascaraTelefone (this)"/>
        </p>

        <p align="center">          
          <input tabindex="8" id="botao_enviar" type="submit" name="submit" value="Submit" class="botao"/>
        </p>
      </div>
    </form>        
    
  </body>
</html>

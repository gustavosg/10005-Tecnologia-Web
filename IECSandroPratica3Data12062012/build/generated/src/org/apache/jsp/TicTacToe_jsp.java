package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TicTacToe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("        <script type=\"text/javascript\" src=\"functions/jquery.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"functions/script.js\"></script>\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form name=\"formTTT\">\r\n");
      out.write("            <table border=\"2\" rules=\"all\">\r\n");
      out.write("                <tr >\r\n");
      out.write("                    <td id=\"td1\"><input type=\"button\" id=\"0\" value=\"\"></input> </td>\r\n");
      out.write("                    <td id=\"td2\"><input type=\"button\" id=\"1\" value=\"\"></input> </td>\r\n");
      out.write("                    <td id=\"td3\"><input type=\"button\" id=\"2\" value=\"\"></input> </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr >\r\n");
      out.write("                    <td id=\"td4\"><input type=\"button\" id=\"3\" value=\"\"></input> </td>\r\n");
      out.write("                    <td id=\"td5\"><input type=\"button\" id=\"4\" value=\"\"></input> </td>\r\n");
      out.write("                    <td id=\"td6\"><input type=\"button\" id=\"5\" value=\"\"></input> </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr >\r\n");
      out.write("                    <td id=\"td7\"><input type=\"button\" id=\"6\" value=\"\"></input> </td>\r\n");
      out.write("                    <td id=\"td8\"><input type=\"button\" id=\"7\" value=\"\"></input> </td>\r\n");
      out.write("                    <td id=\"td9\"><input type=\"button\" id=\"8\" value=\"\"></input> </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <br />\r\n");
      out.write("            <input type=\"button\" id=\"cleanAll\" value=\"Limpar todos os botoes\"></input>\r\n");
      out.write("            <br />\r\n");
      out.write("\r\n");
      out.write("            <!-- Jogador atual -->\r\n");
      out.write("            <label>Vez do jogador: </label>\r\n");
      out.write("            <input type=\"label\" id=\"player\" value=\"O\"></input>\r\n");
      out.write("            <br />\r\n");
      out.write("\r\n");
      out.write("            <!-- Área de Debug -->\r\n");
      out.write("            <label>Debug:</label>\r\n");
      out.write("            <input type=\"text\" id=\"debug\" value=\"\"></input>\r\n");
      out.write("\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("                $(document).ready(function(){\r\n");
      out.write("\r\n");
      out.write("                    // Jogador Inicial:\r\n");
      out.write("                    var player = \"O\";\r\n");
      out.write("\r\n");
      out.write("                    var game = [\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\" ];\r\n");
      out.write("                    // guarda se teve alguma vitória\r\n");
      out.write("                    var victory = false;\r\n");
      out.write("                    \r\n");
      out.write("                    // Tipos de vitória possível dentro de um tabuleiro de Jogo da Velha\r\n");
      out.write("                    victoryTypes=[ [0,1,2], [3,4,5], [6,7,8], [0,3,6], [1,4,7], [2,5,8], [0,4,8], [2,4,6] ];\r\n");
      out.write("\r\n");
      out.write("                    // @ToDo ver link: http://thingsilearned.com/2009/06/02/tictactoe-in-jquery/\r\n");
      out.write("\r\n");
      out.write("                    $(\"#0\").click(function(){\r\n");
      out.write("                        nextTurn(\"#0\");\r\n");
      out.write("                    });\r\n");
      out.write("                    $(\"#1\").click(function(){\r\n");
      out.write("                        nextTurn(\"#1\");\r\n");
      out.write("                    });\r\n");
      out.write("                    $(\"#2\").click(function(){\r\n");
      out.write("                        nextTurn(\"#2\");\r\n");
      out.write("                    });\r\n");
      out.write("                    $(\"#3\").click(function(){\r\n");
      out.write("                        nextTurn(\"#3\");\r\n");
      out.write("                    });\r\n");
      out.write("                    $(\"#4\").click(function(){\r\n");
      out.write("                        nextTurn(\"#4\");\r\n");
      out.write("                    });\r\n");
      out.write("                    $(\"#5\").click(function(){\r\n");
      out.write("                        nextTurn(\"#5\");\r\n");
      out.write("                    });\r\n");
      out.write("                    $(\"#6\").click(function(){\r\n");
      out.write("                        nextTurn(\"#6\");\r\n");
      out.write("                    });\r\n");
      out.write("                    $(\"#7\").click(function(){\r\n");
      out.write("                        nextTurn(\"#7\");\r\n");
      out.write("                    });\r\n");
      out.write("                    $(\"#8\").click(function(){\r\n");
      out.write("                        nextTurn(\"#8\");\r\n");
      out.write("                    });\r\n");
      out.write("                    \r\n");
      out.write("                    /**\r\n");
      out.write("                     * faz a limpeza de todos os campos da tela e do vetor que armazena quem fez as jogadas.\r\n");
      out.write("                     */\r\n");
      out.write("                    if ($(\"#cleanAll\").click(function(){\r\n");
      out.write("                        this.game = [\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\" ];\r\n");
      out.write("                        var buttonName = \"#\";\r\n");
      out.write("                        var inputs = document.getElementsByTagName(\"input\");\r\n");
      out.write("                        for (var i = 1; i<=inputs.length; i++){\r\n");
      out.write("                            buttonName = \"#\"+i;\r\n");
      out.write("                            ($(buttonName).val(\"\"));\r\n");
      out.write("                        }\r\n");
      out.write("                    }))\r\n");
      out.write("                  \r\n");
      out.write("                    /**\r\n");
      out.write("                     * Função que atribui o valor ao evento chamado.\r\n");
      out.write("                     * $param = objeto passado para receber tratamento.\r\n");
      out.write("                     */\r\n");
      out.write("                    function nextTurn(param){\r\n");
      out.write("                 \r\n");
      out.write("                        if ($(param).val() == \"\")\r\n");
      out.write("                        {\r\n");
      out.write("                            // guarda qual é o turno do jogador:\r\n");
      out.write("                            var playerTurn = \"\";\r\n");
      out.write("                            if ($(\"#player\").val() == \"O\")\r\n");
      out.write("                                playerTurn = \"X\";\r\n");
      out.write("                            else\r\n");
      out.write("                                playerTurn = \"O\";\r\n");
      out.write("                            ($(param).val(playerTurn));\r\n");
      out.write("                            ($(\"#player\").val(playerTurn));\r\n");
      out.write("                            \r\n");
      out.write("                            //Informa qual é o próximo jogador.\r\n");
      out.write("                            player = playerTurn;\r\n");
      out.write("                            \r\n");
      out.write("                            debugValue();\r\n");
      out.write("                            \r\n");
      out.write("                            playerMove(param);\r\n");
      out.write("                            \r\n");
      out.write("                            this.game[param] = player;\r\n");
      out.write("                            \r\n");
      out.write("                        \r\n");
      out.write("                            // Verifica se já teve um ganhador, e informa quem foi.\r\n");
      out.write("                            if (this.victory)\r\n");
      out.write("                                this.endGame();\r\n");
      out.write("                            \r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                    \r\n");
      out.write("                    /**\r\n");
      out.write("                     * Verifica se é possível do jogador realizar a jogada.\r\n");
      out.write("                     */\r\n");
      out.write("                    function playerMove(id){\r\n");
      out.write("                        alert('Dentro de playerMove(): ' + id);\r\n");
      out.write("                        if (!this.game[id] && !this.win) \r\n");
      out.write("                            this.game[id] = this.player;\r\n");
      out.write("                    }\r\n");
      out.write("                    \r\n");
      out.write("                    function hasWinner(){\r\n");
      out.write("                        for (value in this.wins)\r\n");
      out.write("                        {\r\n");
      out.write("                            var search = this.wins[value];\r\n");
      out.write("                            var found = this.game[search[0]] + this.game[search[1]] + this.game[search[2]];\r\n");
      out.write("                                \r\n");
      out.write("                            if (found == \"XXX\")\r\n");
      out.write("                                return \"X\";\r\n");
      out.write("                            else (found == \"OOO\")\r\n");
      out.write("                            return \"O\";\r\n");
      out.write("                                \r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                    \r\n");
      out.write("                    /**\r\n");
      out.write("                     * Verifica se ainda é possível executar o jogo.\r\n");
      out.write("                     */\r\n");
      out.write("                    function endGame(){\r\n");
      out.write("                        if (this.victory == \"Velha\"){\r\n");
      out.write("                            ($(\"#player\").val(\"Deu jogo da velha!\"));\r\n");
      out.write("                            this.victory = true;\r\n");
      out.write("                        }\r\n");
      out.write("                        else{\r\n");
      out.write("                            ($(\"#player\").val(\"O jogador \"+ ($(\"#player\")).val() + \" ganhou!\"));\r\n");
      out.write("                            this.victory = true;\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                    \r\n");
      out.write("                    /**\r\n");
      out.write("                     *Faz o debug de valores:\r\n");
      out.write("                     *\r\n");
      out.write("                     */\r\n");
      out.write("                    function debugValue(){\r\n");
      out.write("                        ($(\"#debug\").val(game));\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("            \r\n");
      out.write("            </script>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

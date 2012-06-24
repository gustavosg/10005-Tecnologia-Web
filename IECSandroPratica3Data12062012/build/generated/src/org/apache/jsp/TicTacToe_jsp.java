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
      out.write("            <input type=\"label\" id=\"player\" value=\"O\" disabled=\"true\"></input>\r\n");
      out.write("            <br />\r\n");
      out.write("\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("                $(document).ready(function(){\r\n");
      out.write("\r\n");
      out.write("                    // Fields Region\r\n");
      out.write("                    \r\n");
      out.write("                    // Initializing player                    \r\n");
      out.write("                    if ($(\"#player\").val() == \"\"){\r\n");
      out.write("                            ($(\"#player\").val(\"X\"));\r\n");
      out.write("                        }\r\n");
      out.write("                    \r\n");
      out.write("                    // Defining player\r\n");
      out.write("                    var player = \"X\";\r\n");
      out.write("\r\n");
      out.write("                    // Types of victory. Represents which fields is a win situation\r\n");
      out.write("                    victoryTypes = [ [0,1,2], [3,4,5], [6,7,8], [0,3,6], [1,4,7], [2,5,8], [0,4,8], [2,4,6] ];\r\n");
      out.write("\r\n");
      out.write("                    // Start the board with no field checked\r\n");
      out.write("                    game = [\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\" ];\r\n");
      out.write("                    \r\n");
      out.write("                    // Initializes with no victory\r\n");
      out.write("                    victory = false;\r\n");
      out.write("\r\n");
      out.write("                    // End Fields Region\r\n");
      out.write("\r\n");
      out.write("                    // Methods and Functions Region\r\n");
      out.write("                    \r\n");
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
      out.write("                     * Clean fields and board game. Also, tells than there's no victory yet.\r\n");
      out.write("                     */\r\n");
      out.write("                    if ($(\"#cleanAll\").click(function(){\r\n");
      out.write("                        game = [\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\" ];\r\n");
      out.write("                        var buttonName = \"#\";\r\n");
      out.write("                        var inputs = document.getElementsByTagName(\"input\");\r\n");
      out.write("                        for (var i = 0; i<=inputs.length; i++){\r\n");
      out.write("                            buttonName = \"#\"+i;\r\n");
      out.write("                            ($(buttonName).val(\"\"));\r\n");
      out.write("                        }\r\n");
      out.write("                        victory = false;\r\n");
      out.write("                        \r\n");
      out.write("                    }))\r\n");
      out.write("                  \r\n");
      out.write("                    /**\r\n");
      out.write("                     * Attributes value to call button\r\n");
      out.write("                     * $param = assignature's object\r\n");
      out.write("                     */\r\n");
      out.write("                    function nextTurn(param){\r\n");
      out.write("                        if (($(param).val() == \"\") && !victory)\r\n");
      out.write("                        {\r\n");
      out.write("                            // who's actual player\r\n");
      out.write("                            ($(\"#player\").val(player));\r\n");
      out.write("                        \r\n");
      out.write("                            if ($(\"#player\").val() == \"O\")\r\n");
      out.write("                                player = \"X\";\r\n");
      out.write("                            else\r\n");
      out.write("                                player = \"O\";\r\n");
      out.write("\r\n");
      out.write("                            //assign player\r\n");
      out.write("                            ($(param).val(player));\r\n");
      out.write("                          \r\n");
      out.write("                            //assign player into the board\r\n");
      out.write("                            var value = param.replace(\"#\", \"\");\r\n");
      out.write("                            playerMove(value);\r\n");
      out.write("                              \r\n");
      out.write("                            // Check if there's a winner\r\n");
      out.write("                            this.player = hasWinner();\r\n");
      out.write("                            checkEndGame();\r\n");
      out.write("                            \r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                    \r\n");
      out.write("                    /**\r\n");
      out.write("                     * Check if player can make next move on the board\r\n");
      out.write("                     */\r\n");
      out.write("                    function playerMove(id){\r\n");
      out.write("                        if (!this.game[id] && !this.victory) \r\n");
      out.write("                            this.game[id] = player;\r\n");
      out.write("                    }\r\n");
      out.write("                    \r\n");
      out.write("                    /**\r\n");
      out.write("                     * Check if there's a winner\r\n");
      out.write("                     */\r\n");
      out.write("                    function hasWinner(){\r\n");
      out.write("                        // if every board field is checked, then its an old lady game (Tic Tac Toe!)\r\n");
      out.write("                        var center = 0;\r\n");
      out.write("                        for (s in this.game) {\r\n");
      out.write("                            if (this.game[s]) \r\n");
      out.write("                                center+=1; \r\n");
      out.write("                        }\r\n");
      out.write("                        if (center == 9) {\r\n");
      out.write("                            return \"Velha\";\r\n");
      out.write("                            checkEndGame();\r\n");
      out.write("                        }\r\n");
      out.write("                        \r\n");
      out.write("                        for (value in victoryTypes)\r\n");
      out.write("                        {\r\n");
      out.write("                            var search = this.victoryTypes[value];\r\n");
      out.write("                            var found = this.game[search[0]] + this.game[search[1]] + this.game[search[2]];\r\n");
      out.write("                            \r\n");
      out.write("                            if (found == \"XXX\")\r\n");
      out.write("                            {\r\n");
      out.write("                                this.victory = true;\r\n");
      out.write("                                return \"X\";\r\n");
      out.write("                                checkEndGame();\r\n");
      out.write("                            }\r\n");
      out.write("                            else if (found == \"OOO\")\r\n");
      out.write("                            {\r\n");
      out.write("                                this.victory = true;\r\n");
      out.write("                                return \"O\";\r\n");
      out.write("                                checkEndGame();\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                    \r\n");
      out.write("                    /**\r\n");
      out.write("                     * End this TTT game\r\n");
      out.write("                     */\r\n");
      out.write("                    function checkEndGame(){\r\n");
      out.write("                        if (this.player.toString() == \"Velha\")\r\n");
      out.write("                            result = \"Deu jogo da velha!\";\r\n");
      out.write("                        else\r\n");
      out.write("                            result = \"O jogador \"+ this.player.toString() + \" ganhou!\";\r\n");
      out.write("                        ($(\"#player\").val(result));\r\n");
      out.write("                        alert(result);\r\n");
      out.write("                    }\r\n");
      out.write("                    \r\n");
      out.write("                    // End Region Methods and Functions \r\n");
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

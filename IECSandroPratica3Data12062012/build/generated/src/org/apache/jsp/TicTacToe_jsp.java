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
      out.write("                <tr id=\"111\">\r\n");
      out.write("                    <td id=\"td1\"><input type=\"button\" id=\"1\" value=\"\"></input> </td>\r\n");
      out.write("                    <td id=\"td2\"><input type=\"button\" id=\"2\" value=\"\"></input> </td>\r\n");
      out.write("                    <td id=\"td3\"><input type=\"button\" id=\"3\" value=\"\"></input> </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr id=\"222\">\r\n");
      out.write("                    <td id=\"td4\"><input type=\"button\" id=\"4\" value=\"\"></input> </td>\r\n");
      out.write("                    <td id=\"td5\"><input type=\"button\" id=\"5\" value=\"\"></input> </td>\r\n");
      out.write("                    <td id=\"td6\"><input type=\"button\" id=\"6\" value=\"\"></input> </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr id=\"333\">\r\n");
      out.write("                    <td id=\"td7\"><input type=\"button\" id=\"7\" value=\"\"></input> </td>\r\n");
      out.write("                    <td id=\"td8\"><input type=\"button\" id=\"8\" value=\"\"></input> </td>\r\n");
      out.write("                    <td id=\"td9\"><input type=\"button\" id=\"9\" value=\"\"></input> </td>\r\n");
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
      out.write("            <table border=\"2\" rules=\"all\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"text\" id=\"debug1\" value=\"\"></input> </td>\r\n");
      out.write("                    <td><input type=\"text\" id=\"debug2\" value=\"\"></input> </td>\r\n");
      out.write("                    <td><input type=\"text\" id=\"debug3\" value=\"\"></input> </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"text\" id=\"debug4\" value=\"\"></input> </td>\r\n");
      out.write("                    <td><input type=\"text\" id=\"debug5\" value=\"\"></input> </td>\r\n");
      out.write("                    <td><input type=\"text\" id=\"debug6\" value=\"\"></input> </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"text\" id=\"debug7\" value=\"\"></input> </td>\r\n");
      out.write("                    <td><input type=\"text\" id=\"debug8\" value=\"\"></input> </td>\r\n");
      out.write("                    <td><input type=\"text\" id=\"debug9\" value=\"\"></input> </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("                $(document).ready(function(){\r\n");
      out.write("                    //var arr = [1,2,3,4,5,6,7,8,9];\r\n");
      out.write("                    $(this.id).click(function(){\r\n");
      out.write("                        attrValue(\"#1\");\r\n");
      out.write("                        debugValue(this.id, ($(this).val())) ;\r\n");
      out.write("                    });\r\n");
      out.write("//                    $(\"#2\").click(function(){\r\n");
      out.write("//                        attrValue(\"#2\");\r\n");
      out.write("//                    });\r\n");
      out.write("//                    $(\"#3\").click(function(){\r\n");
      out.write("//                        attrValue(\"#3\");\r\n");
      out.write("//                    });\r\n");
      out.write("//                    $(\"#4\").click(function(){\r\n");
      out.write("//                        attrValue(\"#4\");\r\n");
      out.write("//                    });\r\n");
      out.write("//                    $(\"#5\").click(function(){\r\n");
      out.write("//                        attrValue(\"#5\");\r\n");
      out.write("//                    });\r\n");
      out.write("//                    $(\"#6\").click(function(){\r\n");
      out.write("//                        attrValue(\"#6\");\r\n");
      out.write("//                    });\r\n");
      out.write("//                    $(\"#7\").click(function(){\r\n");
      out.write("//                        attrValue(\"#7\");\r\n");
      out.write("//                    });\r\n");
      out.write("//                    $(\"#8\").click(function(){\r\n");
      out.write("//                        attrValue(\"#8\");\r\n");
      out.write("//                    });\r\n");
      out.write("//                    $(\"#9\").click(function(){\r\n");
      out.write("//                        attrValue(\"#9\");\r\n");
      out.write("//                        \r\n");
      out.write("//                    });\r\n");
      out.write("                    if ($(\"#cleanAll\").click(function(){\r\n");
      out.write("                        cleanFields();\r\n");
      out.write("                    }))\r\n");
      out.write("                  \r\n");
      out.write("                /**\r\n");
      out.write("                 * Função que atribui o valor ao evento chamado.\r\n");
      out.write("                 * $param = objeto passado para receber tratamento.\r\n");
      out.write("                 */\r\n");
      out.write("                function attrValue(param){\r\n");
      out.write("                 \r\n");
      out.write("                    if ($(param).val() == \"\")\r\n");
      out.write("                    {\r\n");
      out.write("                        // guarda qual é o turno do jogador:\r\n");
      out.write("                        var playerTurn = \"\";\r\n");
      out.write("                        if ($(\"#player\").val() == \"O\")\r\n");
      out.write("                            playerTurn = \"X\";\r\n");
      out.write("                        else\r\n");
      out.write("                            playerTurn = \"O\";\r\n");
      out.write("                        ($(param).val(playerTurn));\r\n");
      out.write("                        ($(\"#player\").val(playerTurn));\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                    \r\n");
      out.write("                /**\r\n");
      out.write("                 * Limpa todos os botões marcados.\r\n");
      out.write("                 */\r\n");
      out.write("                function cleanFields(){\r\n");
      out.write("                    var buttonName = \"#\";\r\n");
      out.write("                    var inputs = document.getElementsByTagName(\"input\");\r\n");
      out.write("                    for (var i = 1; i<=inputs.length; i++){\r\n");
      out.write("                        buttonName = \"#\"+i;\r\n");
      out.write("                        ($(buttonName).val(\"\"));\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                function debugValue(param, val){\r\n");
      out.write("                    alert(\"parametro: \" + param + \" valor: \" + val);\r\n");
      out.write("                    var linha = [0, 0, 0];\r\n");
      out.write("                    var coluna = [0, 0, 0];\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    var field = \"#debug\"+param;\r\n");
      out.write("                    //alert(\"Linha: \"+ linha + \" coluna\" + coluna);\r\n");
      out.write("                    \r\n");
      out.write("                    ($(field).val(val));\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
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

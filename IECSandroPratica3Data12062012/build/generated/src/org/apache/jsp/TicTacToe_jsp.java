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
      out.write("        <form>\r\n");
      out.write("            <table border=\"2\" rules=\"all\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"button\" id=\"button1\" value=\"\" onclick=\"disableThis (this)\"></input> </td>\r\n");
      out.write("                    <td><input type=\"button\" id=\"button2\" value=\"\" onclick=\"disableThis(this)\"></input> </td>\r\n");
      out.write("                    <td><input type=\"button\" id=\"button3\" value=\"\"></input> </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"button\" id=\"button4\" value=\"\"></input> </td>\r\n");
      out.write("                    <td><input type=\"button\" id=\"button5\" value=\"\"></input> </td>\r\n");
      out.write("                    <td><input type=\"button\" id=\"button6\" value=\"\"></input> </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"button\" id=\"button7\" value=\"\"></input> </td>\r\n");
      out.write("                    <td><input type=\"button\" id=\"button8\" value=\"\"></input> </td>\r\n");
      out.write("                    <td><input type=\"button\" id=\"button9\" value=\"\"></input> </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("            <label>Vez do jogador: </label>\r\n");
      out.write("            <input type=\"label\" id=\"player\" value=\"O\"></input>\r\n");
      out.write("\r\n");
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
      out.write("                    $(\"#button1\").click(function(){\r\n");
      out.write("                        if ($(\"#debug1\").val() == \"O\")\r\n");
      out.write("                            ($(\"#debug1\")).val(\"X\");\r\n");
      out.write("                        else\r\n");
      out.write("                            ($(\"#debug1\")).val(\"O\");\r\n");
      out.write("                    });\r\n");
      out.write("                    $(\"#button2\").click(function(){\r\n");
      out.write("                        if ($(\"#debug2\").val() == \"O\")\r\n");
      out.write("                            ($(\"#debug2\")).val(\"X\");\r\n");
      out.write("                        else\r\n");
      out.write("                            ($(\"#debug2\")).val(\"O\");\r\n");
      out.write("                    });\r\n");
      out.write("                    $(\"#button3\").click(function(){\r\n");
      out.write("                        if ($(\"#player\").val() == \"O\")\r\n");
      out.write("                            ($(\"#player\")).val(\"X\");\r\n");
      out.write("                        else\r\n");
      out.write("                            ($(\"#player\")).val(\"O\");\r\n");
      out.write("                    });\r\n");
      out.write("                    $(\"#button4\").click(function(){\r\n");
      out.write("                        if ($(\"#player\").val() == \"O\")\r\n");
      out.write("                            ($(\"#player\")).val(\"X\");\r\n");
      out.write("                        else\r\n");
      out.write("                            ($(\"#player\")).val(\"O\");\r\n");
      out.write("                    });\r\n");
      out.write("                    $(\"#button5\").click(function(){\r\n");
      out.write("                        if ($(\"#player\").val() == \"O\")\r\n");
      out.write("                            ($(\"#player\")).val(\"X\");\r\n");
      out.write("                        else\r\n");
      out.write("                            ($(\"#player\")).val(\"O\");\r\n");
      out.write("                    });\r\n");
      out.write("                    $(\"#button6\").click(function(){\r\n");
      out.write("                        if ($(\"#player\").val() == \"O\")\r\n");
      out.write("                            ($(\"#player\")).val(\"X\");\r\n");
      out.write("                        else\r\n");
      out.write("                            ($(\"#player\")).val(\"O\");\r\n");
      out.write("                    });\r\n");
      out.write("                    $(\"#button7\").click(function(){\r\n");
      out.write("                        if ($(\"#player\").val() == \"O\")\r\n");
      out.write("                            ($(\"#player\")).val(\"X\");\r\n");
      out.write("                        else\r\n");
      out.write("                            ($(\"#player\")).val(\"O\");\r\n");
      out.write("                    });\r\n");
      out.write("                    $(\"#button8\").click(function(){\r\n");
      out.write("                        if ($(\"#player\").val() == \"O\")\r\n");
      out.write("                            ($(\"#player\")).val(\"X\");\r\n");
      out.write("                        else\r\n");
      out.write("                            ($(\"#player\")).val(\"O\");\r\n");
      out.write("                    });\r\n");
      out.write("                    $(\"#button9\").click(function(){\r\n");
      out.write("                        if ($(\"#player\").val() == \"O\")\r\n");
      out.write("                            ($(\"#player\")).val(\"X\");\r\n");
      out.write("                        else\r\n");
      out.write("                            ($(\"#player\")).val(\"O\");\r\n");
      out.write("                    });\r\n");
      out.write("                    \r\n");
      out.write("                });\r\n");
      out.write("            \r\n");
      out.write("            </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

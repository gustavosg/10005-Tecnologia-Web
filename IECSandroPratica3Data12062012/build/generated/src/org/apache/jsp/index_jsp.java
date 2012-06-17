package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <script type=\"text/javascript\"src=\"functions/jquery.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form onload=\"alert('a')\">\n");
      out.write("            <label>Nome:</label>\n");
      out.write("            <input type=\"text\" id=\"Nome\"  /> <br />\n");
      out.write("            <label>Endereço</label>\n");
      out.write("            <input type=\"text\" id=\"Endereco\" /><br />\n");
      out.write("            <button type=\"submit\" value=\"Enviar\" id=\"Enviar\" >Enviar</button>\n");
      out.write("            <input type=\"hidden\" id=\"dictionary\" value=\"sexo vagina\" ></input>\n");
      out.write("\n");
      out.write("            <script type=\"text/javascript\" >\n");
      out.write("                $(document).ready(function() {\n");
      out.write("                \n");
      out.write("                    $(\"#Enviar\").click(\n");
      out.write("                    function(){\n");
      out.write("                        if ($(\"#Nome\").val() == \"\" )\n");
      out.write("                            alert(\"Campo nome vazio\");\n");
      out.write("                        if ($(\"#Endereco:empty\").val() == \"\")\n");
      out.write("                            alert(\"Campo endereço vazio\");\n");
      out.write("                    \n");
      out.write("                        if ($(\"$Nome\").contains(document.getElementById(dictionary).value))\n");
      out.write("                            alert(\"Campo não pode conter esta palavra\");\n");
      out.write("                    })\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

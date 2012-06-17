/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.LinkedList;
import bancodados.BancoDados;
import produto.Produto;


/**
 *
 * @author Wesley
 */
public class IECServletLogin extends HttpServlet {

  /**
   * Processes requests for both HTTP
   * <code>GET</code> and
   * <code>POST</code> methods.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  protected void processRequest (HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    response.setContentType ("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter ();
    try {
      String email_login = request.getParameter ("email_de_login").toString ();
      String senha = request.getParameter ("senha").toString ();
      /*
       * TODO output your page here. You may use following sample code.
       */
      int i;
      LinkedList tabela = new LinkedList ();
      BancoDados bd = new BancoDados ();
      bd.leProdutos ();
      tabela = bd.getTabela ();
      
      
      
      out.println ("<html>");
      out.println ("<head>");
      out.println ("<script type=\"text/javascript\" src=\"script/script.js\"></script>");
      out.println ("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
      out.println ("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">");
      out.println ("<title>Página de resposta gerada pelo Servlet IECServletLogin.</title>");      
      out.println ("</head>");
      out.println ("<body>");
      out.println ("<div id=\"windowBackground\" align=\"left\">");
      out.println ("<p>Bem vindo(a) " + email_login + "!</p>");
      out.println ("<p>Sua senha atual é: " + senha + "</p>");
      
      out.println ("\n\nLista de Produtos:");
      for (i = 0; i < tabela.size (); i++) {
        Produto p = (Produto) tabela.get (i);
        out.println ("<li />"+p.getNome () + "\t" + p.getUnidade ());
      }
      out.println ("<br />");
      out.println ("Email: " + email_login + "\t Senha: " + senha);
      out.println ("");
      
      out.println ("</div>");      
      out.println ("</body>");
      out.println ("</html>");
         
      
    } finally {      
      out.close ();
    }
  }

  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /**
   * Handles the HTTP
   * <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet (HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    processRequest (request, response);
  }

  /**
   * Handles the HTTP
   * <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost (HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    processRequest (request, response);
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo () {
    return "Short description";
  }// </editor-fold>
}

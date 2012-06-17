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

/**
 *
 * @author Gustavo
 */
public class newUser extends HttpServlet {

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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String nome = request.getParameter("nome").toString();
            String sobreNome = request.getParameter("sobreNome").toString();
            String senha = request.getParameter("senha").toString();
            String confirmarSenha = request.getParameter("confirmarSenha").toString();
            String email = request.getParameter("email").toString();
            String tel = request.getParameter("tel").toString();
            String cel = request.getParameter("cel").toString();

            if (!senha.trim().equals(confirmarSenha.trim())) {
                out.println("senha não confere");
            } else if ((senha.trim().equals("")) || (confirmarSenha.trim().equals(""))) {
                out.println("por favor informe uma senha");
            } else if (nome.trim().equals("")) {
                out.println("por favor informe seu nome");
            } else if (sobreNome.trim().equals("")) {
                out.println("por favor informe seu sobrenome");
            } else if (email.trim().equals("")) {
                out.println("por favor informe seu email");
            } else if (tel.trim().equals("")) {
                out.println("por favor informe seu telefone");
            } else if (cel.trim().equals("")) {
                out.println("por favor informe seu celular");
            } else {

                /*
                 * TODO output your page here. You may use following sample code.
                 */
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet newUser</title>");
                out.println("Cadastro realizado com sucesso: <br />");
                out.println("Nome: " +nome + "<br/>");
                out.println("Sobrenome: " +sobreNome + "<br/>");
                out.println("Senha:" +senha + "<br/>");
                out.println("Email: " +email + "<br/>");
                out.println("Telefone: " +tel + "<br/>");
                out.println("Celular: " +cel + "<br/>");
                
                out.println("</head>");
                out.println("<body>");

                out.println("</body>");
                out.println("</html>");
            }
        } finally {
            out.close();
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

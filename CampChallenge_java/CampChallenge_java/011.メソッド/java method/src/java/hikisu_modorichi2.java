/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 *
 * @author jung_yucheol
 */
@WebServlet(urlPatterns = {"/hikisu_modorichi2"})
public class hikisu_modorichi2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    public String[] data(String id){
        String[] data0 = {"01","一郎","1990年1月1日","北区1-1"};
        String[] data1 = {"02","二郎","1990年1月2日","北区1-2"};
        String[] data2 = {"03","三郎","1990年1月3日","北区1-3"};
        if(id.equals(data0[0])){
            return data0;
            } else if(id.equals(data1[0])){
            return data1;
            } else if(id.equals(data2[0])){
            return data2;
            }
        return null;
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hikisu_modorichi2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet hikisu_modorichi2 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        ArrayList<String[]> List = new ArrayList<String[]>();
        for(int a = 1; a <= 3; a++){
            String n = String.valueOf(a);
            List.add(data(n));
        }
        for(int b = 0; b < List.size(); b++){
            String[] pro = List.get(b);
            for(int cab = 1; cab < pro.length; cab++){
                if(pro[cab] == null){
                    continue;
                }
            out.print(pro[cab]);
            out.print("<br>");
            }
        }
    }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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


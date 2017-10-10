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
@WebServlet(urlPatterns = {"/hikisu_modorichi1"})
public class hikisu_modorichi1 extends HttpServlet {

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
        String[] data0 = {"1","一郎","1990年1月1日",null};
        String[] data1 = {"2","二郎","1990年1月2日","北区1-2"};
        String[] data2 = {"3","三郎","1990年1月3日","北区1-3"};
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
           ArrayList<String[]> al = new ArrayList<String[]>();
           for(int i = 1; i <= 3; i++){
               String n = String.valueOf(i);
               al.add(data(n));
           }
           for(int j = 0; j < al.size(); j++){
               String[] pro = al.get(j);
               out.print(pro+"<br>");
               
               for(int lol = 1; lol <pro.length; lol++){
                   if(pro[lol] == null){
                       continue;
                   }
                   out.print(pro[lol]);
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

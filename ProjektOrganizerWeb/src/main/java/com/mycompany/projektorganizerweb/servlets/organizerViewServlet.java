/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.projektorganizerweb.servlets;

import com.mycompany.projektorganizerweb.model.Day;
import com.mycompany.projektorganizerweb.model.DaysList;
import com.mycompany.projektorganizerweb.model.Event;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Arek
 */
@WebServlet("/OrganizerView")
public class organizerViewServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
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

        HttpSession session = request.getSession();
        DaysList model = (DaysList) session.getAttribute("dayList");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Projekt organizer</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table>");
        out.println("<tr>");
        out.println("<th>Nazwa<th>");
        out.println("<th>Data<th>");
        out.println("<th>Godzina<th>");
        out.println("</tr>");
        
        System.out.println("ile dni: " + model.getDays().size());
         for (int i = 0; i < model.getDays().size(); i++) {
            
            Day day = model.getDays().get(i);
            
            for (int j = 0; j < day.getEvents().size(); j++)
            {
            out.println("<tr>");
            out.println("<td>");
            out.println(day.getEvents().get(j).getName());
            out.println("<td>");
            
            out.println("<td>");
            out.println(model.getDays().get(i).getDate());
            out.println("<td>");
            
            out.println("<td>");
            out.println(day.getEvents().get(j).getHour());
            out.println("<td>");
            out.println("</tr>"); 
            }         
        }
                   
        out.println("</body>");
        out.println("</html>");   
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

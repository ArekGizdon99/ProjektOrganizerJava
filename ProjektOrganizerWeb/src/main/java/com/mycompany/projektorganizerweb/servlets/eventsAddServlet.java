/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.projektorganizerweb.servlets;

import com.mycompany.projektorganizerweb.model.Day;
import com.mycompany.projektorganizerweb.model.DaysList;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet("/AddingEvent")
public class eventsAddServlet extends HttpServlet {

    private DaysList model = new DaysList();
    
   
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
        session.setAttribute("dayList", model);
             
        String eventName = request.getParameter("eventName");
        String eventDate = request.getParameter("eventDate");
        String eventHour = request.getParameter("eventHour");

        if (eventName.length() == 0 || eventDate.length() == 0 || eventHour.length() == 0) {
        response.sendError(response.SC_BAD_REQUEST, "Podaj wszystkie parametry!");
        }
        else{
            Day day = new Day();
            day.addEvent(eventHour, eventName);
            day.setDate(eventDate);
           
            model.addToDays(day);
            System.out.println("ilosc dni w modelu: " + model.getDays().size());
            request.getRequestDispatcher("/index.html").forward(request, response);
            
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

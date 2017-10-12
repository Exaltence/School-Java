/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Bubble;
import model.Insertion;
import model.Merge;
import model.NumberArray;
import model.Sorteer;

/**
 *
 * @author shaun
 */
public class SorteerS extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        int aantalg = Integer.parseInt(request.getParameter("aantalg"));
        int maxg = Integer.parseInt(request.getParameter("grootsteg"));
        String algo = request.getParameter("sorteermethode");
        Sorteer s = new Sorteer();

        switch (algo) {
            case "bubble":
                s.setSortMethod(new Bubble());
                break;
            case "insertion":
                s.setSortMethod(new Insertion());
                break;
            case "merge":
                s.setSortMethod(new Merge());
                break;
            default:
                break;
        }

        int[] tobeSorted = new int[maxg];
        int[] tobeSortedStored = new int[maxg];
    
        NumberArray ar = new NumberArray();

        tobeSorted = ar.randomFill(maxg, aantalg);
        tobeSortedStored = tobeSorted.clone();
        
        tobeSorted = s.executeSorteer(tobeSorted);
        
        this.getServletContext().setAttribute("in", tobeSortedStored);
        this.getServletContext().setAttribute("out", tobeSorted);
        
        /*
        out.println("after" + Arrays.toString(tobeSortedStored));
        out.println("<br>");
        out.println("after" + Arrays.toString(tobeSorted));
        */
        
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);
         
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

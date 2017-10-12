/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AzertyToQwerty;
import model.Keyboard;

/**
 *
 * @author shaun
 */
public class KeyboardS extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        String input = request.getParameter("azerty");
        Keyboard kb = new Keyboard(new AzertyToQwerty());
        String output = kb.Translate(input);

        this.getServletContext().setAttribute("in", input);
        this.getServletContext().setAttribute("out", output);
        
        //doorverwijzen resultaat naar keyboard.jsp
        RequestDispatcher view = request.getRequestDispatcher("keyboard.jsp");
        //daadwerkelijke dispatch
        view.forward(request, response);

    }

}

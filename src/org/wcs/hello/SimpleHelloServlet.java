package org.wcs.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/simple-hello", "/custom-hello"})
public class SimpleHelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String matinsoir = "";
        String prenom = request.getParameter("firstname");
        String nom = request.getParameter("lastname");
        String hour = request.getParameter("hour");



        int inthour = Integer.valueOf(hour.substring(0,2));

        if ( inthour >= 0 && inthour <= 12) {
            matinsoir = "Good Morning ";
        }
        if ( inthour >= 13 && inthour <= 18) {
            matinsoir = "Good Afternoon ";
        }
        if ( inthour >= 18 && inthour <= 24) {
            matinsoir = "Good Night ";
        }

        String result = matinsoir + prenom + " " + nom;

        request.setAttribute("resultat", result);

        this.getServletContext().getRequestDispatcher("/custom-hello.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

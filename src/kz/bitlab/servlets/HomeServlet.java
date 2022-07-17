package kz.bitlab.servlets;

import kz.bitlab.db.DBManager;
import kz.bitlab.db.Footballer;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/homeservlet")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String name = request.getParameter("footballer_name");
        String surname = request.getParameter("footballer_surname");
        int salary = Integer.parseInt(request.getParameter("footballer_salary"));
        String club = request.getParameter("club");
        int price = Integer.parseInt(request.getParameter("footballer_price"));

        Footballer footballer = new Footballer();
        footballer.setName(name);
        footballer.setSurname(surname);
        footballer.setSalary(salary);
        footballer.setClub(club);
        footballer.setTransferPrice(price);
        DBManager.addFootballer(footballer);

        response.sendRedirect("/index.jsp");
    }

}

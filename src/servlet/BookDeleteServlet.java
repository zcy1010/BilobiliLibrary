package servlet;

import dao.BookDao;
import dao.LibrarianDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BookDeleteServlet")
public class BookDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String booknumber = (String) request.getParameter("booknumber");

        BookDao bookDao = new BookDao();
        bookDao.deleteBook(booknumber);
        request.getRequestDispatcher("librarian.jsp").forward(request, response);
    }
}
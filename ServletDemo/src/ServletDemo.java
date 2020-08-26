import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServeletDemo")
public class ServletDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletDemo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletDemo at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlets</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<br /><h2>First Demo Servlet application</h2><br />Here, the URL-pattern is ServletDemo in web.xml. So, the address s <i>WebApplicationServletDemo/ServletDemo</i>.");
            out.println("<br /><br /><a href=\"page1.jsp\">Previous Page</a>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}

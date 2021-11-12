package hello.sv.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hellServlet
 */
@WebServlet("/hellServlet")
public class hellServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public hellServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.getWriter().write("<h1> hello worl </h1> ");
	}

}

package BTASM1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ASM
 */

public class ASM extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ASM() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String userName = request.getParameter("userName");
			String passWord = request.getParameter("passWord");

			String userId = getServletContext().getInitParameter("userName1");
			String passW = getServletContext().getInitParameter("passWord1");

			if (userName.equalsIgnoreCase(userId) && passWord.equals(passW)) {
				RequestDispatcher index = request.getRequestDispatcher("/index.jsp");
				index.forward(request, response);
			} else {

				RequestDispatcher index1 = request.getRequestDispatcher("/Login.jsp");
				request.setAttribute("check", "mật khẩu hoặc ID không chính xác");
				index1.include(request, response);
			}
		} catch (Exception e) {
			response.getWriter().println("ex");
		}
	}

}

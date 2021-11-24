package SEVERLET_ASM2;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class severLet_Login extends HttpServlet {
	
	 public severLet_Login() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	response.setContentType("text/html; charset=UTF-8");
	request.setCharacterEncoding("utf-8");		
		try {
			request.getSession(true).invalidate();
			//check user and passW
			Pattern s = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
			
			String checkPassW = " [a-zA-Z0-9_!@#$%^&*]+";
			
			// get date from Login
			String userName = request.getParameter("userName");
			String passWord = request.getParameter("passWord");
			
			//set date to objeck acountAdmin
			Acount acountAdmin = new Acount(userName, passWord);
			// creare objeck session
			HttpSession session = request.getSession(true);
			// check character from Longin 
			if(!s.matcher(userName).find() ) {
				RequestDispatcher index1 = request.getRequestDispatcher("/Login.jsp");
				session.setAttribute("check1", "userName or passWord không hợp lệ eee");
			}
			//get date from Context
			String userId = getServletContext().getInitParameter("userName1");
			String passW = getServletContext().getInitParameter("passWord1");
			
			// check date from Login
			if (acountAdmin.getUser().equalsIgnoreCase(userId) && acountAdmin.getPassW().equals(passW)) {
				session.setAttribute("user",userName);
				RequestDispatcher index = request.getRequestDispatcher("/ManagAdmin.jsp");
				index.forward(request, response);
			} else {

				RequestDispatcher index1 = request.getRequestDispatcher("/Login.jsp");
				session.setAttribute("check", "mật khẩu hoặc ID không chính xác");
				index1.include(request, response);
			}
		} catch (Exception e) {
			response.getWriter().println("ex");
		}
	}

}
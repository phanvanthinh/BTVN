package msita.jspservlet.phanvanthinh.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import msita.jspservlet.phanvanthinh.dao.UserDao;
import msita.jspservlet.phanvanthinh.dao.UserDaoImpl;
import msita.jspservlet.phanvanthinh.model.User;

/**
 * Servlet implementation class ControllerLogin
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		   RequestDispatcher requestDispatcher = request.getRequestDispatcher("view-a/view/login.jsp");
		   requestDispatcher.forward(request, response);
            
            
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String userName = request.getParameter("userName");
		 String password = request.getParameter("password");
         UserDao userDao = new UserDaoImpl();
         User user = userDao.findUserByUserNameAndPassword(userName, password);
         
         if(user !=null) {
         	HttpSession session = request.getSession();
         	session.setAttribute("user", user);
         	RequestDispatcher requestDispatcher = request.getRequestDispatcher("homeAdmin");
         	requestDispatcher.forward(request, response);
         			
         }else {
        	 
         	response.sendRedirect("view-a/view/loginFaill.jsp");
         }
	}

}

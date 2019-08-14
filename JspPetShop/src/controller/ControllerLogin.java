package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ProductDao;
import dao.ProductDaoImpl;
import dao.UserDao;
import dao.UserDaoImpl;
import model.Product;
import model.User;

/**
 * Servlet implementation class ControllerLogin
 */
@WebServlet("/login")
public class ControllerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		   RequestDispatcher rd = request.getRequestDispatcher("view-a/view/login.jsp");
		   rd.forward(request, response);
            
            
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
         	ProductDao product = new ProductDaoImpl();
         	List<Product> listproduct = product.findAll();
         	request.setAttribute("listproduct", listproduct);
         	RequestDispatcher rd = request.getRequestDispatcher("homeAdmin");
         	rd.forward(request, response);
         			
         }else {
        	 
         	response.sendRedirect("view-a/view/loginFaill.jsp");
         }
	}

}

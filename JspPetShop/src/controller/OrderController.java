package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.OrderDao;
import dao.OrderDaoImpl;
import dao.ProductDao;
import dao.ProductDaoImpl;
import model.Orderr;
import model.Product;

/**
 * Servlet implementation class ControllerOrder
 */
@WebServlet("/order")
public class OrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		       
		int id = Integer.parseInt(request.getParameter("id"));
		ProductDao product1 = new ProductDaoImpl();
		Product product = product1.findProductById(id);
		request.setAttribute("product", product);
		RequestDispatcher rd = request.getRequestDispatcher("view-a/view/Order.jsp");
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String customeName = request.getParameter("customeName");
		String gender      = request.getParameter("gender");
		int age = Integer.parseInt(request.getParameter("age"));
		int phone = Integer.parseInt(request.getParameter("phoneNumber"));
		String address = request.getParameter("address");
		String status = request.getParameter("status");
		
		Orderr order = new Orderr();
		order.setCustomerName(customeName);
		order.setGender(gender);
		order.setAge(age);
		order.setPhoneNumber(phone);
		order.setAddress(address);
		order.setStatus(status);
		
		OrderDao orderDao = new OrderDaoImpl();
		orderDao.addOrder(order);
		response.sendRedirect("view-a/view/OrderOk.jsp");
		
	}

}

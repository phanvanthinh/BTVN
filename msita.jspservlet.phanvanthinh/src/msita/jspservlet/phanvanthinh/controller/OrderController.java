package msita.jspservlet.phanvanthinh.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import msita.jspservlet.phanvanthinh.dao.OrderDao;
import msita.jspservlet.phanvanthinh.dao.OrderDaoImpl;
import msita.jspservlet.phanvanthinh.dao.ProductDao;
import msita.jspservlet.phanvanthinh.dao.ProductDaoImpl;
import msita.jspservlet.phanvanthinh.model.Orderr;
import msita.jspservlet.phanvanthinh.model.Product;

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
		ProductDao productDao = new ProductDaoImpl();
		Product product = productDao.findProductById(id);
		request.setAttribute("product", product);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("view-a/view/Order.jsp");
		requestDispatcher.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("productid"));
		String customeName = request.getParameter("customeName");
		int phone = Integer.parseInt(request.getParameter("phoneNumber"));
		String address = request.getParameter("address");
		int total = Integer.parseInt(request.getParameter("total"));
		
		System.out.println(customeName);

		
		Orderr order = new Orderr();
		
		order.setCustomerName(customeName);
		order.setPhoneNumber(phone);
		order.setAddress(address);
		order.setProductId(id);
		order.setTotal(total);

		
		OrderDao orderDao = new OrderDaoImpl();
		orderDao.addOrder(order);
		response.sendRedirect("view-a/view/OrderOk.jsp");
		
	}

}

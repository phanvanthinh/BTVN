package msita.jspservlet.phanvanthinh.controller;

import java.io.IOException;
import java.util.List;

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

/**
 * Servlet implementation class editStatusOrderAndStatusProductController
 */
@WebServlet("/setStatusOrderAndProduct")
public class EditStatusOrderIsSuccessAndStatusProductIsSoldController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditStatusOrderIsSuccessAndStatusProductIsSoldController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		int orderId = Integer.parseInt(request.getParameter("id").trim());
		int productId = Integer.parseInt(request.getParameter("productId").trim());
		OrderDao orderDao = new OrderDaoImpl();
		ProductDao productDao = new ProductDaoImpl();
		
		orderDao.setStatusSuccess(orderId);
		productDao.setStatusSold(productId);
	
		OrderDao orderDao1 = new OrderDaoImpl();
		List<Orderr> listOrder = orderDao1.findOrderByStatusByCreate();
		
		request.setAttribute("listOrder", listOrder);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("view-a/view/listOrderWait.jsp");
		requestDispatcher.forward(request, response);
		
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

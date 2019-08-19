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
import msita.jspservlet.phanvanthinh.model.Orderr;

/**
 * Servlet implementation class ListOrderCancelController
 */
@WebServlet("/listOrderCancel")
public class ListOrderCancelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListOrderCancelController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
		OrderDao orderDao = new OrderDaoImpl();
		List<Orderr> listOrder = orderDao.findOrderByStatusByCancel();
		request.setAttribute("listOrder", listOrder);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("view-a/view/listOrderCancel.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package msita.jspservlet.phanvanthinh.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import msita.jspservlet.phanvanthinh.dao.ProductDao;
import msita.jspservlet.phanvanthinh.dao.ProductDaoImpl;
import msita.jspservlet.phanvanthinh.model.Product;

/**
 * Servlet implementation class ListProductErrorController
 */
@WebServlet("/listProductError")
public class ListProductErrorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListProductErrorController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    
		   ProductDao productDao = new ProductDaoImpl();
		   List<Product> listProduct = productDao.findProductByStatusByError();
		   request.setAttribute("listProduct", listProduct);
		   RequestDispatcher requestDispatcher = request.getRequestDispatcher("view-a/view/listProductError.jsp");
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

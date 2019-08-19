package msita.jspservlet.phanvanthinh.controller;

import java.io.IOException;

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
 * Servlet implementation class ControllerAddProduct
 */
@WebServlet("/addProduct")
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   RequestDispatcher requestDispatcher = request.getRequestDispatcher("view-a/view/addProduct.jsp");
		   requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String dogBreed = request.getParameter("dogBreed");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
		int price = Integer.parseInt(request.getParameter("price"));
		String status = request.getParameter("status");
		String avatar = request.getParameter("avatar");
		
		
		Product product = new Product();
		product.setDogBreed(dogBreed);
		product.setGender(gender);
		product.setAge(age);
		product.setPrice(price);
		product.setStatus(status);
		product.setAvatar(avatar);
		
		ProductDao productDao = new ProductDaoImpl();
		productDao.addProduct(product);
		
		response.sendRedirect("homeAdmin");
		
		
		
		
	}

}

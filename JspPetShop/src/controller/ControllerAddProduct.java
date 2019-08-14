package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProductDao;
import dao.ProductDaoImpl;
import model.Product;

/**
 * Servlet implementation class ControllerAddProduct
 */
@WebServlet("/addProduct")
public class ControllerAddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerAddProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   RequestDispatcher rd = request.getRequestDispatcher("view-a/view/addProduct.jsp");
		   rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String dogName = request.getParameter("dogName");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");
//		int age = Integer.parseInt("agee");
		String health = request.getParameter("health");
		String pricee = (String) request.getParameter("price");
		int price = Integer.parseInt("pricee");
		
		String status = request.getParameter("status");
		String avatar = request.getParameter("avatar");
		
		
		Product product = new Product();
		product.setDogName(dogName);
		product.setGender(gender);
		product.setAge(age);
		product.setHealth(health);
		product.setPrice(price);
		product.setStatus(status);
		product.setAvatar(avatar);
		
		ProductDao productDao = new ProductDaoImpl();
		productDao.addProduct(product);
		
		response.sendRedirect("homeAdmin");
		
		
		
		
	}

}

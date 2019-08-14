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
 * Servlet implementation class ControllerEditProduct
 */
@WebServlet("/editProduct")
public class EditProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
		int id = Integer.parseInt(request.getParameter("id"));
		
		ProductDao productDao = new ProductDaoImpl();
		Product prodcut = productDao.findProductById(id);
		
		request.setAttribute("prodcut", prodcut);
		
		RequestDispatcher rd = request.getRequestDispatcher("view-a/view/editProdcut.jsp");
		rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            int id = Integer.parseInt(request.getParameter("id"));
		    String dogName = request.getParameter("dogName");
			String gender = request.getParameter("gender");
			String age = request.getParameter("age");
			String health = request.getParameter("health");
			int price = Integer.parseInt(request.getParameter("price"));
			String status = request.getParameter("status");
			String avatar = request.getParameter("avatar");
			
			Product product = new Product();
			product.setId(id);
			product.setDogName(dogName);
			product.setGender(gender);
			product.setAge(age);
			product.setHealth(health);
			product.setPrice(price);
			product.setStatus(status);
			product.setAvatar(avatar);
			
			ProductDao productDao = new ProductDaoImpl();
			productDao.editProduct(product);
			
			response.sendRedirect("homeAdmin");
	}

}

package msita.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import msita.spring.demo.model.Product;
import msita.spring.demo.service.ProductService;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/getall")
	public String getAll(Model model) {
		List<Product> product = productService.getProduct();
		model.addAttribute("product", product);

		return "homeAdmin";
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String creatProduct(Model model) {
		model.addAttribute("product", new Product());
		return "createProduct";

	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createProductActionModel(@ModelAttribute("prodcut") Product product) {
		
		productService.createProduct(product);
		return "redirect:getall";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String deleteProduct(@RequestParam("id") int id) {
		productService.deleteProduct(id);
		return "redirect:getall";
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateProduct(Model model, @RequestParam("id") int id) {
		Product product = productService.findProductById(id);
		model.addAttribute("product", product);
		return "updateProduct";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateProductAction(@ModelAttribute("product") Product product) {
		productService.updateProduct(product);
		return "redirect:getall";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String searchProduct(Model model, @RequestParam("dogBreed") String dogBreed) {

		productService.findProductByUsername(dogBreed);
		System.out.println(productService.findProductByUsername(dogBreed));
	
		
		model.addAttribute("product", productService.findProductByUsername(dogBreed));
		return "home";
	}
	
}

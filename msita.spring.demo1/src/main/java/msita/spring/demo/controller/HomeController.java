package msita.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import msita.spring.demo.model.Product;
import msita.spring.demo.service.ProductService;

@Controller
public class HomeController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = { "/home"}, method = RequestMethod.GET)
	public String getAll(Model model) {
		List<Product> product = productService.getProduct();
		model.addAttribute("product", product);

		return "home";
	}

	@RequestMapping("/login")
	public String home() {
		return "login";
	}

	@RequestMapping(value = "/403")
	public String accessDenied() {
		return "403";
	}

}

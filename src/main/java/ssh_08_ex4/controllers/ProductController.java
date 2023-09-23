package ssh_08_ex4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;
import ssh_08_ex4.services.ProductService;

@Controller
@AllArgsConstructor
public class ProductController {
	
	private final ProductService productService;
	
	@GetMapping("/products")
	public String products(Model backData) {
		var products = productService.getProductList();
		backData.addAttribute("products", products);
		
		return "products.html";
	}
	
}

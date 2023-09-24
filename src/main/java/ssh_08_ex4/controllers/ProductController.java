package ssh_08_ex4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.AllArgsConstructor;
import ssh_08_ex4.model.Product;
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
	
	@PostMapping("/add")
	public String addProduct(@RequestParam String name,
			@RequestParam Double price, Model model) {
		var product = new Product();
		product.setName(name);
		product.setPrice(price);
		productService.addProduct(product);
		
		model.addAttribute("products", productService.getProductList());
		
		return "products.html";
	}
	
}

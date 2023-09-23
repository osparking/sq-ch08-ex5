package ssh_08_ex4.controllers;

import org.springframework.stereotype.Controller;

import lombok.AllArgsConstructor;
import ssh_08_ex4.services.ProductService;

@Controller
@AllArgsConstructor
public class ProductController {
	
	private final ProductService productService;
	
}

package ssh_08_ex4.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ssh_08_ex4.model.Product;

@Service
public class ProductService {
	private List<Product> productList = new ArrayList<>();
	
	public void addProduct(Product product) {
		productList.add(product);
	}
	
	public List<Product> getProductList() {
		return productList;
	}

}

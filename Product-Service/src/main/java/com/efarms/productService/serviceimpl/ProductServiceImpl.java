package com.efarms.productService.serviceimpl;

import java.util.List;

import org.springframework.data.domain.Page;

import com.efarms.productService.Exception.ProductException;
import com.efarms.productService.entity.Category;
import com.efarms.productService.entity.Product;
import com.efarms.productService.repository.CategoryRepository;
import com.efarms.productService.repository.ProductRepository;
import com.efarms.productService.request.CreateProductRequest;
import com.efarms.productService.service.ProductService;
import com.efarms.userService.service.UserService;

public class ProductServiceImpl implements ProductService{
	private ProductRepository productRepository;
	private UserService userService;
	private CategoryRepository categoryRepository;
	
	public ProductServiceImpl(ProductRepository productRepository,UserService userService,CategoryRepository categoryRepository) {
		this.productRepository=productRepository;
		this.userService=userService;
		this.categoryRepository=categoryRepository;
	}

	@Override
	public Product createProduct(CreateProductRequest req) throws ProductException {
		Category topLevel=categoryRepository.findByName(req.getTopLavelCategory());
		
		
		return null;
	}

	@Override
	public String deleteProduct(Long productId) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Long productId, Product product) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findProductById(Long id) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findProductByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> searchProduct(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Product> getAllProduct(String category, List<String> colors, List<String> sizes, Integer minPrice,
			Integer maxPrice, Integer minDiscount, String sort, String stock, Integer pageNumber, Integer pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> recentlyAddedProduct() {
		// TODO Auto-generated method stub
		return null;
	}
	

}

package com.proje.repository;

import java.util.List;

import com.proje.model.Brand;
import com.proje.model.Category;
import com.proje.model.Product;
import com.proje.model.ProductDetails;

public interface IProductRepository {
	
	Product saveProduct(Product product);
	
	Brand saveBrand(Brand brand);
	
	Category saveCategory(Category category);
	
	List<Product> findProducts();
	
	List<Product> findProductsEntities(int firstResult,int maxResult);
	
	Product findProductById(int productId);
	
	List<ProductDetails> findProductDetails();
	
	ProductDetails findProductDetailsById(int productId);
	
	List<String> findProductNames();
	
	List<Object[]> findProductNameAndPrice();
	
	List<Product> findGreatPrice(double unitPrice);
	
	List<Product> findGreateAndLessPrice(double minUnitPrice, double maxUnitPrice);
	
	List<Product> findBetweenPrice(double minUnitPrice, double maxUnitPrice);
	
	List<Product> findLikeProductName(String productName);
	
	List<Product> findInCategoryName(String categoryName1, String categoryName2);
	
	//Verilen Kategorilerinin Price Degerinden yüksek olan getir
	
	List<Product> findAllProduct(int categoryId);
	
	List<Object[]> findFuctionsPrice();
	
	List<Object[]> findGroupByCategory();
	
	List<Object[]> findGroupByHavingCategory(double unitPrice);
	
	List<Product> findOrderByPrice();
	
}

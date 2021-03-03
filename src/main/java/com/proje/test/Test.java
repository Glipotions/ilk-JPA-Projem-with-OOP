package com.proje.test;

import java.util.Date;

import com.proje.model.Brand;
import com.proje.model.Category;
import com.proje.model.Product;
import com.proje.repository.IProductRepository;
import com.proje.repositoryImpl.ProductRepositoryImpl;


public class Test {

	private static IProductRepository productRepository=new ProductRepositoryImpl();
	
	public static void main(String[] args) {
		/*
		//Tüm ürünleri yazdýrma
		List<Product> products=productRepository.findProducts();
		for (Product product : products) {
			System.out.println(product);
		}
		*/
		
		/*
		List<Product> findProductsEntities=productRepository.findProductsEntities(3000, 5000);
		for (Product product : findProductsEntities) {
			System.out.println(product);
		}
		*/

		/*  Çalýþtý
		Product product=productRepository.findProductById(3);
		System.out.println(product);
		*/
		
		/* Çalýþtý
		List<ProductDetails> productDetails =productRepository.findProductDetails();
		productDetails.forEach(System.out::println);
		*/
		
		/*  Çalýþtý
		 ProductDetails productDetails=productRepository.findProductDetailsById(3);
		 System.out.println(productDetails);
		 */
		
		/* Çalýþtý
		 List<String> products=productRepository.findProductNames();
		 products.forEach(System.out::println);
		*/
		
		/* Çalýþtý
		List<Object[]> list =productRepository.findProductNameAndPrice();
		for (Object[] objects : list) {
			System.out.println(objects[0] +" - "+ objects[1]);
		}
		*/
		
		/* Çalýþtý
		List<Product> findGreatPrice=productRepository.findGreatPrice(3500);
		findGreatPrice.forEach(System.out::println);
		*/
		
		/* Çalýþtý
		List<Product> findGreateAndLessPrice=productRepository.findGreateAndLessPrice(2600, 3400);
		findGreateAndLessPrice.forEach(System.out::println);
		*/
		
		/* Çalýþtý
		List<Product> findBetweenPrice=productRepository.findBetweenPrice(2600, 3400);
		findBetweenPrice.forEach(System.out::println);
		
		*/
		
		/* Çalýþtý
		List<Product> findLikeProductName =productRepository.findLikeProductName("8");
		findLikeProductName.forEach(System.out::println);
		
		*/
		
		/*
		List<Product> findInCategoryName=productRepository.findInCategoryName("Telefon", "Televizyon");
		findInCategoryName.forEach(System.out::println);
		
		*/
		
		
		/*  GARÝP ÇALIÞTI
		List<Product> findAllProduct=productRepository.findAllProduct(1);
		findAllProduct.forEach(System.out::println);

		
		*/
		
		/*
		List<Object[]> findFuctionsPrice=productRepository.findFuctionsPrice();
		Object[] objects =findFuctionsPrice.get(0);
		System.out.println("AVG: "+ objects[0] + " - SUM : " +objects[1] + " - MAX : "+objects[2]+" - MIN : "+objects[3] +" - COUNT : " + objects[4]);
		*/
		
		/*
		List<Object[]> findGroupByCategory=productRepository.findGroupByCategory();
		for (Object[] objects : findGroupByCategory) {
			System.out.println("CategoryName : " +objects[0] + " - AVG : " + objects[1]);
		}
		*/
		
		/*
		List<Object[]> findGroupByHavingCategoryList=productRepository.findGroupByHavingCategory(4700);
		for (Object[] objects : findGroupByHavingCategoryList) {
			System.out.println("CategoryName : " +objects[0] + " - AVG : " + objects[1]);
		}
		
		*/
		
		/* ÇALIÞTI
		List<Product> findOrderByPrice=productRepository.findOrderByPrice();
		findOrderByPrice.forEach(System.out::println);
		*/
		
	}
	
	
	public static void insertData() {
		Brand brand1=new Brand("Apple");
		Brand brand2=new Brand("LG");
		Brand brand3=new Brand("Samsung");
		Brand brand4=new Brand("Sony");
		Brand brand5=new Brand("Asus");
		
		Category category1=new Category("Telefon");
		Category category2=new Category("Televizyon");
		Category category3=new Category("Bilgisayar");
		
		Product product1=new Product("Iphone 8", 3500, 4, brand1, category1, new Date());
		Product product2=new Product("Note 8 Pro", 7000, 6, brand3, category1, new Date());
		Product product3=new Product("Xperia Xz Premium", 3000, 3, brand4, category1, new Date());
		
		Product product4=new Product("MacBook Air", 12000, 8, brand1, category3, new Date());
		Product product5=new Product("AsusPC", 7500, 7, brand5, category3, new Date());
		Product product6=new Product("Vaio", 2500, 2, brand4, category3, new Date());
		
		Product product7=new Product("50Q60T", 6100, 8, brand3, category2, new Date());
		Product product8=new Product("32LM6300 ", 3000, 3, brand2, category2, new Date());
		Product product9=new Product("AppleTV", 9350, 7, brand1, category2, new Date());
		
		productRepository.saveBrand(brand1);
		productRepository.saveBrand(brand2);
		productRepository.saveBrand(brand3);
		productRepository.saveBrand(brand4);
		productRepository.saveBrand(brand5);
		
		productRepository.saveCategory(category1);
		productRepository.saveCategory(category2);
		productRepository.saveCategory(category3);
		
		productRepository.saveProduct(product1);
		productRepository.saveProduct(product2);
		productRepository.saveProduct(product3);
		productRepository.saveProduct(product4);
		productRepository.saveProduct(product5);
		productRepository.saveProduct(product6);
		productRepository.saveProduct(product7);
		productRepository.saveProduct(product8);
		productRepository.saveProduct(product9);
		
		
		
	}
}

package com.proje.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.proje.JpaFactory.IJpaFactory;
import com.proje.JpaFactoryImpl.JpaFactoryImpl;
import com.proje.model.Brand;
import com.proje.model.Category;
import com.proje.model.Product;
import com.proje.model.ProductDetails;
import com.proje.queries.ProductQueries;
import com.proje.repository.IProductRepository;

public class ProductRepositoryImpl implements IProductRepository{

	private IJpaFactory jpaFactory=new JpaFactoryImpl();
	
	private EntityManager entityManager=jpaFactory.getEntityManager();
	
	private EntityTransaction transaction=jpaFactory.getTransaction();

	@Override
	public Product saveProduct(Product product) {
		transaction.begin();
		entityManager.persist(product);
		transaction.commit();
		return product;
	}

	@Override
	public Brand saveBrand(Brand brand) {
		transaction.begin();
		entityManager.persist(brand);
		transaction.commit();
		return brand;
	}

	@Override
	public Category saveCategory(Category category) {
		transaction.begin();
		entityManager.persist(category);
		transaction.commit();
		return category;
	}

	@Override
	public List<Product> findProducts() {
		TypedQuery<Product> typedQuery=this.entityManager.createQuery(ProductQueries.findProducts, Product.class);
		List<Product> products=typedQuery.getResultList();
		return products;
	}

	@Override
	public List<Product> findProductsEntities(int firstResult, int maxResult) {
		TypedQuery<Product> typedQuery=this.entityManager.createQuery(ProductQueries.findProducts, Product.class);
		typedQuery.setFirstResult(firstResult);
		typedQuery.setMaxResults(maxResult);
		List<Product> products=typedQuery.getResultList();
		return products;
	}

	@Override
	public Product findProductById(int productId) {
		TypedQuery<Product> typedQuery=this.entityManager.createQuery(ProductQueries.findProductsById, Product.class);
		typedQuery.setParameter("productId", productId);
		
		Product product=typedQuery.getSingleResult();
		return product;
	}

	@Override
	public List<ProductDetails> findProductDetails() {
		TypedQuery<ProductDetails> typedQuery=this.entityManager.createQuery(ProductQueries.findProductsDetails, ProductDetails.class);	
		List<ProductDetails> products=typedQuery.getResultList();
		return products;
	}

	@Override
	public ProductDetails findProductDetailsById(int productId) {
		TypedQuery<ProductDetails> typedQuery=this.entityManager.createQuery(ProductQueries.findProductsDetailsById, ProductDetails.class);	
		typedQuery.setParameter("productId", productId);
		ProductDetails productDetails=typedQuery.getSingleResult();
		return productDetails;
	}

	@Override
	public List<String> findProductNames() {
		TypedQuery<String> typedQuery=this.entityManager.createQuery(ProductQueries.findProductNames, String.class);	
		List<String> productNames=typedQuery.getResultList();
		return productNames;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findProductNameAndPrice() {
		Query query=this.entityManager.createQuery(ProductQueries.findProductNamesPrice);
		List<Object[]> productNameAndPrice=query.getResultList();
		
		return productNameAndPrice;
	}

	@Override
	public List<Product> findGreatPrice(double unitPrice) {
		TypedQuery<Product> typedQuery=this.entityManager.createQuery(ProductQueries.findGreatPrice, Product.class);
		typedQuery.setParameter("unitPrice",unitPrice);
		List<Product> products=typedQuery.getResultList();
		return products;
	}

	@Override
	public List<Product> findGreateAndLessPrice(double minUnitPrice, double maxUnitPrice) {
		TypedQuery<Product> typedQuery=this.entityManager.createQuery(ProductQueries.findGreatlessPrice, Product.class);
		typedQuery.setParameter("minUnitPrice", minUnitPrice);
		typedQuery.setParameter("maxUnitPrice", maxUnitPrice);
		List<Product> products=typedQuery.getResultList();
		return products;
		
	}

	@Override
	public List<Product> findBetweenPrice(double minUnitPrice, double maxUnitPrice) {
		TypedQuery<Product> typedQuery=this.entityManager.createQuery(ProductQueries.findBetweenPrice, Product.class);
		typedQuery.setParameter("minUnitPrice", minUnitPrice);
		typedQuery.setParameter("maxUnitPrice", maxUnitPrice);
		List<Product> products=typedQuery.getResultList();
		return products;
	}

	@Override
	public List<Product> findLikeProductName(String productName) {
		TypedQuery<Product> typedQuery=this.entityManager.createQuery(ProductQueries.findLikeProductName, Product.class);
		typedQuery.setParameter("productName","%"+productName+"%");
		List<Product> products=typedQuery.getResultList();
		return products;
	}

	@Override
	public List<Product> findInCategoryName(String categoryName1, String categoryName2) {
		TypedQuery<Product> typedQuery=this.entityManager.createQuery(ProductQueries.findInCategoryName, Product.class);
		typedQuery.setParameter("categoryName1",categoryName1);
		typedQuery.setParameter("categoryName2",categoryName2);
		List<Product> products=typedQuery.getResultList();
		return products;
	}

	@Override
	public List<Product> findAllProduct(int categoryId) {
		TypedQuery<Product> typedQuery=this.entityManager.createQuery(ProductQueries.findAllProduct, Product.class);
		typedQuery.setParameter("categoryId",categoryId);
		List<Product> products=typedQuery.getResultList();
		return products;
	}

	@Override
	public List<Object[]> findFuctionsPrice() {
		Query query=this.entityManager.createQuery(ProductQueries.findFuctionPrice);
		@SuppressWarnings("unchecked")
		List<Object[]> findFuctionsPrice=query.getResultList();
		return findFuctionsPrice;
	}

	@Override
	public List<Object[]> findGroupByCategory() {
		Query query=this.entityManager.createQuery(ProductQueries.findGroupByCategory);
		@SuppressWarnings("unchecked")
		List<Object[]> findGroupByCategory=query.getResultList();
		return findGroupByCategory;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Object[]> findGroupByHavingCategory(double unitPrice) {
		Query query=this.entityManager.createQuery(ProductQueries.findGroupByHavingCategory);
		query.setParameter("unitPrice", unitPrice);
		List<Object[]> findGroupByHavingCategory=query.getResultList();
		return findGroupByHavingCategory;
	}

	@Override
	public List<Product> findOrderByPrice() {
		TypedQuery<Product> typedQuery=this.entityManager.createQuery(ProductQueries.findOrderByPrice, Product.class);	
		List<Product> findOrderByPrice=typedQuery.getResultList();
		return findOrderByPrice;
	}
	
	
	
}

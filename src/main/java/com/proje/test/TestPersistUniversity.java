package com.proje.test;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class TestPersistUniversity {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager entityManager = factory.createEntityManager();
		
		EntityTransaction transaction=entityManager.getTransaction();

		
		transaction.begin();

		
		transaction.commit();
		
	}
	
	
}

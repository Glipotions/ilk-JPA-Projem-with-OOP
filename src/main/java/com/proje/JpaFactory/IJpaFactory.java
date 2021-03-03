package com.proje.JpaFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public interface IJpaFactory {
	
	EntityManager getEntityManager();
	
	EntityTransaction getTransaction();
	
	
	
}

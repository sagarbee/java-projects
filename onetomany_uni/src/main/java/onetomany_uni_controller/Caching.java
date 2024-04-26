package onetomany_uni_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import onetomany_uni_dto.Company;

public class Caching {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		
		//Only executed on time select query 
		manager.find(Company.class, 1002);
		manager.find(Company.class, 1002);
		manager.find(Company.class, 1002);

		EntityManager manager2 = factory.createEntityManager();
		manager.find(Company.class, 1002);

		EntityManager manager3 = factory.createEntityManager();
		manager.find(Company.class, 1002);

	}
	
}

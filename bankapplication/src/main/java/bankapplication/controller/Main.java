package bankapplication.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import bankapplication.dto.Bank;
import bankapplication.dto.User;

public class Main {

	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vibhas");
		EntityManager manager =factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Bank bank = new Bank();
		bank.setName("SBI");
		bank.setAccountNo(7887905972l);
		bank.setAddress("Pune");
		bank.setUserName("Vibhas");
		bank.setInitalBalence(0);
		
		User user = new User();
		user.setName("Sagar");
		user.setAddress("Pune");
		user.setAge(23);
		user.setEmail("vibhas@mail");
		user.setPassword("1234");
		user.setBank(bank);
		
		
		transaction.begin();
		manager.persist(bank);
		manager.persist(user);
		transaction.commit();
		
		
	}

}

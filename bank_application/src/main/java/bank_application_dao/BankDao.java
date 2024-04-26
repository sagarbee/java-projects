package bank_application_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import bank_application_dto.Bank;

public class BankDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	public void deposite(int id, int amount) {
		// Minimum amount to deposite in bank
		if (amount < 100) {
			System.out.println("Please Enter amount more than 100Rs;");
		} else {
			Bank user = manager.find(Bank.class, id);
			double currentBalance = user.getBalance();
			double newBalance = currentBalance + amount;
			
			user.setBalance(newBalance);
			
			transaction.begin();
			manager.merge(user);
			transaction.commit();
		}

	}

	public void createAccount() {
	
	}

	public void editUser() {

	}

	public void withdraw() {

	}

}

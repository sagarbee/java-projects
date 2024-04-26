package bankapplication.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import bankapplication.dto.Bank;

public class BankDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("vibhas");
	EntityManager manager =factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	public void saveBank(Bank bank) {
		
		Bank dbbank=manager.find(Bank.class, bank.getId());
		
		if(dbbank==null)
		{
			transaction.begin();
			manager.persist(bank);
			transaction.commit();
		}
		else
		{
			System.out.println("user is already registered with given id:"+bank.getId());
		}
	}
	
	public void editBalance(int id, double newBalance) {
        transaction.begin();
        Bank bank = manager.find(Bank.class, id);
        if (bank != null) {
            bank.setBalance(newBalance);
            manager.merge(bank);
            transaction.commit();
            System.out.println("Balance updated successfully for user with ID: " + id);
        } else {
            System.out.println("User not found with ID: " + id);
        }
    }
}

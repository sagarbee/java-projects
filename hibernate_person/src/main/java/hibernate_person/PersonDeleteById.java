package hibernate_person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PersonDeleteById {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Person person = manager.find(Person.class, 4);
		
		if(person!=null)
		{
			transaction.begin();
			manager.remove(person);
			transaction.commit();
		}
		else
		{
			System.out.println("Student does not found");
		}
		
	}

}

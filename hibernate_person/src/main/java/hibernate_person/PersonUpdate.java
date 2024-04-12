package hibernate_person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonUpdate {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Person person = manager.find(Person.class, 2);

		if (person != null) {
			
			person.setName("Harshada Ghare");
			person.setPhone(899945455);
			
			transaction.begin();
			manager.merge(person);
			transaction.commit();

		}
		else
		{
			System.out.println("Person Id does not found");
		}
	}
}

package hibernate_person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonInsert {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Person person1 = new Person();
		person1.setId(1);
		person1.setName("Sagar More");
		person1.setEmail("sagar.sdmore@gmail.com");
		person1.setPhone(9876541235L);
		
		Person person2 = new Person();
		person2.setId(2);
		person2.setName("Akash Shilimkar");
		person2.setEmail("Akash2000@gmail.com");
		person2.setPhone(78458541235L);
		
		Person person3 = new Person();
		person3.setId(3);
		person3.setName("Ruvighna Bhalerao");
		person3.setEmail("Ruvighna@gmail.com");
		person3.setPhone(8994587895L);
		
		transaction.begin();
		
		manager.persist(person1);
		manager.persist(person2);
		manager.persist(person3);
		
		transaction.commit();
		
		 
	}
}

package hibernate_person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersonFetch {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		
		int id = 1;
		Person person = manager.find(Person.class, id);
		
		if(person != null)
		{
			System.out.println(person);
		}
		else
		{
			System.out.println("Person with ID "+id+" not found...");
		}
		
		
	}
	
}

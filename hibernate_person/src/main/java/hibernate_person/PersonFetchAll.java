package hibernate_person;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PersonFetchAll {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("select p from Person p");
		List<Person> person = query.getResultList();
		System.out.println(person);
	}
}

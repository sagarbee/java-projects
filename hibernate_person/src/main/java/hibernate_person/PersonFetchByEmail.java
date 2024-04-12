package hibernate_person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PersonFetchByEmail {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();

		String email = "sagar.sdmore@gmail.com";
		Query query = manager.createQuery("SELECT p FROM Person p where p.email=:email");
		query.setParameter("email", email);

		Person person = (Person) query.getSingleResult();
		System.out.println(person);
	}

}

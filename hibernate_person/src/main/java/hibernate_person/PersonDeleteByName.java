package hibernate_person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PersonDeleteByName {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		String name = "Ruvighna";
		Query query = manager.createQuery("select p from Person p where p.name =: name");
		query.setParameter("name", name);

		try {
			Person person = (Person) query.getSingleResult();
			if (person != null) {
				transaction.begin();
				manager.remove(person);
				transaction.commit();
			}
		} catch (NoResultException e) {
			System.out.println("Person does not found");
		}
	}
}

package hibernate_person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PersonDeleteByPhone {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		long phone = 89945895L;
		Query query = manager.createQuery("select p from Person p where p.phone =: phone");
		query.setParameter("phone", phone);

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

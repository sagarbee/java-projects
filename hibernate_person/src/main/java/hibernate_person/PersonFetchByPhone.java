package hibernate_person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PersonFetchByPhone {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		
		long phone = 78458541235L;
		Query query = manager.createQuery("select p from Person p where p.phone =: phone");
		query.setParameter("phone", phone);
		Person person = (Person)query.getSingleResult();
		System.out.println(person);
		
	
	}

}

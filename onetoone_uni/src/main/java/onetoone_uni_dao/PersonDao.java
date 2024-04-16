package onetoone_uni_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone_uni_dto.AdharCard;
import onetoone_uni_dto.Person;

public class PersonDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("sagar").createEntityManager();
	}

	public void savePerson(Person person) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();
		manager.persist(person.getAdharCard());
		manager.persist(person);
		transaction.commit();

	}

	public void fetchPerson(int id) {
		EntityManager manager = getEntityManager();
		Person person = manager.find(Person.class, id);
		if (person != null) {
			System.out.println(person);
		} else {
			System.out.println("person ID not found");
		}
	}

	public void deletePerson(int id) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Person person = manager.find(Person.class, id);

		if (person != null) {
			transaction.begin();
			manager.remove(person.getAdharCard());
			manager.remove(person);
			transaction.commit();
		}
	}

//	public void deleteAdharCard(int id) {
//		EntityManager manager = getEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//
//		Person person = manager.find(Person.class, id);
//		AdharCard adharCard = manager.find(AdharCard.class, id);
//		if(person !=null)
//		{
//			
//		}
//	}

	public void updatePerson(int id, Person person) {
		EntityManager manager = getEntityManager();
		Person dbPerson = manager.find(Person.class, id);
		if(dbPerson!=null)
		{
			EntityTransaction transaction = manager.getTransaction();
			person.setId(id);
			person.setAdharCard(dbPerson.getAdharCard());
			
			transaction.begin();
			manager.merge(person);
			transaction.commit();
		}
		else{
			System.out.println("Person not found");
		}
	}
	
	public void updateBoth(int id, Person person)
	{
		EntityManager manager = getEntityManager();
		Person dbPerson = manager.find(Person.class, id);
		if(dbPerson!=null)
		{

			person.setId(id);
			person.getAdharCard().setA_id(dbPerson.getAdharCard().getA_id());
			
			EntityTransaction transaction = manager.getTransaction();			
			transaction.begin();
			manager.merge(person.getAdharCard());
			manager.merge(person);
			transaction.commit();
		}
		else{
			System.out.println("Person not found");
		}
	}

}
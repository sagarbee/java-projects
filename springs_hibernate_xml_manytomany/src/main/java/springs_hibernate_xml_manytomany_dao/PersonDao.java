package springs_hibernate_xml_manytomany_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import springs_hibernate_xml_manytomany_dto.Language;
import springs_hibernate_xml_manytomany_dto.Person;

public class PersonDao {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("sagar").createEntityManager();
	}

	public void savePerson(Person person) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(person);
		transaction.commit();

	}

	public void getPerson(int id) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		Person person = manager.find(Person.class, id);
		if (person != null) {
			System.out.println(person);
		} else {
			System.out.println("error occ");

		}

	}

	public void deletePerson(int id) {
		EntityManager manager = getEntityManager();
		Person person = manager.find(Person.class, id);
		if (person != null) {
			EntityTransaction transaction = manager.getTransaction();

			transaction.begin();
			manager.remove(person);
			transaction.commit();
		} else {
			System.out.println("Person not found");
		}
	}

	public void update(int id, Person person) {
		EntityManager manager = getEntityManager();
		Person person2 = manager.find(Person.class, id);
		if (person2 != null) {
			EntityTransaction transaction = manager.getTransaction();

			person2.setId(id);
			person2.setAddress(person.getAddress());
			person2.setName(person.getName());
			person2.setPhone(person.getPhone());

			person2.setLanguages(person.getLanguages());

			transaction.begin();
//			manager.merge(person2.getLanguages());

			manager.merge(person2);
			System.out.println("update successful");
			transaction.commit();

		} else {
			System.out.println("Person not found");
		}

	}

	public void saveLanguage(Language language) {
		EntityManager manager = getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(language);
		transaction.commit();

	}

}

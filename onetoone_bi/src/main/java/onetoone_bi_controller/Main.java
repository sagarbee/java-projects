package onetoone_bi_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone_bi_dao.AdharDao;
import onetoone_bi_dao.PersonDao;
import onetoone_bi_dto.AdharCard;
import onetoone_bi_dto.Person;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		AdharCard adharCard = new AdharCard();
		
		adharCard.setName("Sagar");
		adharCard.setAddress("Pune");

		
		Person person = new Person();
		person.setName("Sagar");
		person.setPhone(9874562155L);
		person.setAddress("Pune Talegaon");
		person.setAdharCard(adharCard);
		adharCard.setPerson(person);		

		transaction.begin();
		manager.persist(adharCard);
		manager.persist(person);
		transaction.commit();
		
//		PersonDao p = new PersonDao();
//		p.fetchPerson(2);
		
		AdharDao ac = new AdharDao();
	ac.fetchAdhar(1);
	}
}

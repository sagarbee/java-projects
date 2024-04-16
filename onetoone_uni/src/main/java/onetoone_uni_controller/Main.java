package onetoone_uni_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone_uni_dao.PersonDao;
import onetoone_uni_dto.AdharCard;
import onetoone_uni_dto.Person;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		AdharCard adharCard = new AdharCard();
		adharCard.setA_id(578955565645l);
		adharCard.setName("Sagar");
		adharCard.setAddress("Pune");
		
//		Person person = new Person();
//		person.setId(3);
//		person.setName("Sagar");
//		person.setPhone(9874562155L);
//		person.setAddress("Pune Talegaon");
//		person.setAdharCard(adharCard);
//		
		PersonDao person1 = new PersonDao();
	
//		person1.savePerson(person);
//		person1.fetchPerson(3);
//		person1.deletePerson(3);
	
		Person person = new Person();
		person.setName("Sagar More");
		person1.updatePerson(1, person);
	}
}

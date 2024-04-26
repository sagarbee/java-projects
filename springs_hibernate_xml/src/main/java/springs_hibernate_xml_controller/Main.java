package springs_hibernate_xml_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springs_hibernate_xml_dto.Person;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("person.xml");
		Person person = (Person) context.getBean("pr");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tr = manager.getTransaction();
		tr.begin();
		manager.persist(person);
		tr.commit();
		
	}
	
}

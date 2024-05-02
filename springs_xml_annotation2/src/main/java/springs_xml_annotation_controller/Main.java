package springs_xml_annotation_controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springs_xml_annotation_dto.Person;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("myperson.xml");
		Person person =(Person) context.getBean("person");
		person.walk();
	}
	
}

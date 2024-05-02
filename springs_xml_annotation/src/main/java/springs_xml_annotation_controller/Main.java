package springs_xml_annotation_controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import school.School;
import springs_xml_annotation_dto.Person;


public class Main {

	public static void main(String[] args) {
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("myperson.xml");
		Person person =(Person) context.getBean("person");
		person.walk();
		System.out.println(person.getName());
		System.out.println(person.getAge());
//		ApplicationContext context = new ClassPathXmlApplicationContext("myperson.xml");
//		Person person =(springs_xml_annotatio) context.getBean("person");
//		person.talk();
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("myschool.xml");
		School school = (School)context1.getBean("school");
		school.teach();
	}
	
}

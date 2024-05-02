package zoo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("animalConfig.class");
		Animal animal = context.getBean("animal",Animal.class);
		animal.sound();
		
	}
	
}

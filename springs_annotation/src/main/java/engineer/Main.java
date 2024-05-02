package engineer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EngineerConfig.class);
		
		Engineer engineer = context.getBean("engineer",Engineer.class);
		engineer.branch();
	}
}

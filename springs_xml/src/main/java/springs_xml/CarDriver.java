package springs_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("car.xml");
		
//		Car car = (Car)context.getBean("ca");
		Car car = context.getBean("ca",Car.class);
		car.info();
	}
}

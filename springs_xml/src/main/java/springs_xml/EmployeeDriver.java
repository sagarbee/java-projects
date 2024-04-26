package springs_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		Employee empl = (Employee) context.getBean("emp");
		System.out.println(empl);
	}

}

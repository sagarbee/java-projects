package employeeBankAccount;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		ApplicationContext context = new AnnotationConfigApplicationContext(AccountConfig.class);
		Employee employee = context.getBean("Employee",Employee.class);
		employee.check();
	}

}

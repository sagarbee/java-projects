package springs_xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComputerDriver {

	public static void main(String[] args) {

//		Computer comp = new Computer();
//		comp.used();

		//Using Springs
		BeanFactory factory = new ClassPathXmlApplicationContext("mycomputer.xml");
		Computer computer =(Computer) factory.getBean("comp");
		System.out.println(computer);
//		computer.used();
		
		Computer computer1 =(Computer) factory.getBean("comp");
		System.out.println(computer1);
	
	}

}

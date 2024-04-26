package springs_xml;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("student.xml");
		Student stu =(Student) factory.getBean("stud");
		
		stu.used();
		System.out.println(stu.name);
		System.out.println(stu.age);
		
		
	}
	
}

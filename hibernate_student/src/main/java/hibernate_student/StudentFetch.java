package hibernate_student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentFetch {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		
		Student student = manager.find(Student.class, 10);
		if(student!=null)
		{
			System.out.println(student);
		}
		else
		{
			System.out.println("Student ID not found");
		}
	}
}

package hibernate_student;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentFetchAll {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("Select stud from Student stud");
		List<Student> student = query.getResultList();
		System.out.println(student);
		
	}

}

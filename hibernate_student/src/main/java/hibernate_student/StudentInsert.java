package hibernate_student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentInsert {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Sagar More");
		student1.setMarks(78.92d);
		student1.setAddress("Pune Charholi Bk");
		student1.setPhone(7855563254L);
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Ravi Shastri");
		student2.setMarks(60.92d);
		student2.setAddress("Noida");
		student2.setPhone(8574563254L);
		
		Student student3 = new Student();
		student3.setId(3);
		student3.setName("Bhushan jagatap");
		student3.setMarks(55.54d);
		student3.setAddress("Nagpur");
		student3.setPhone(9874563254L);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();

		manager.persist(student1);
		manager.persist(student2);
		manager.persist(student3);
		
		transaction.commit();

	}

}

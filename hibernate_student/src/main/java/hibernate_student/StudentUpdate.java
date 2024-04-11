package hibernate_student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentUpdate {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Student student = manager.find(Student.class, 1);
		student.setMarks(99.98d);
		student.setPhone(83089044134l);
		if (student != null) {
			transaction.begin();
			manager.merge(student);
			transaction.commit();

		} else {
			System.out.println("Student ID not found");
		}

	}

}

package manytomany_bi_controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomany_bi_dto.Course;
import manytomany_bi_dto.Student;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("Sagar More");
		s1.setPhone(9874563215l);
		s1.setAddress("Pune Maharashtra");
		
		Student s2 = new Student();
		s2.setName("Aditya Chaudhary");
		s2.setPhone(9874563215l);
		s2.setAddress("Pune Maharashtra");
		
		Student s3 = new Student();
		s3.setName("Shubham Rathi");
		s3.setPhone(9874563215l);
		s3.setAddress("Pune Maharashtra");
		
		
		Course c1 = new Course();
		c1.setName("SQL");
		c1.setFees(5000.00);
		c1.setDuration(1);
		c1.setStudent(null);
		
		List<Student> cL1 = new ArrayList<Student>();
		cL1.add(s1);
		
		
		
		Course c2 = new Course();
		c2.setName("Java");
		c2.setFees(15000.00);
		c2.setDuration(4.5);

		
		Course c3 = new Course();
		c3.setName("Manual Testing");
		c3.setFees(8000.00);
		c3.setDuration(2);

		Course c4 = new Course();
		c4.setName("Advance Java");
		c4.setFees(25000.00);
		c4.setDuration(2);

		List<Course> cList1 = new ArrayList<Course>();
		cList1.add(c1);
		cList1.add(c2);
		cList1.add(c3);
		cList1.add(c4);
		
		s1.setCourse(cList1);
		
		List<Course> cList2 = new ArrayList<Course>();
		cList2.add(c1);
		cList2.add(c2);
		cList2.add(c4);
		s2.setCourse(cList2);
		
		List<Course> cList3 = new ArrayList<Course>();
		cList3.add(c1);
		cList3.add(c2);

		s3.setCourse(cList3);
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(s1);
		manager.persist(s2);
		manager.persist(s3);
		manager.persist(c1);
		manager.persist(c2);
		manager.persist(c3);
		manager.persist(c4);

		transaction.commit();
		
	}
	
}

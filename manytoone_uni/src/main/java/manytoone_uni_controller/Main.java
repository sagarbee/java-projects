package manytoone_uni_controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytoone_uni_dao.StudentDao;
import manytoone_uni_dto.College;
import manytoone_uni_dto.Student;

public class Main {

	public static void main(String[] args) {

//		College c1 = new College();
//		c1.setId(1);
//		c1.setName("Cusrow Wadia Pune");
//		c1.setFees(40000.00);
//		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		
//		transaction.begin();
//		manager.persist(c1);
//		transaction.commit();

//		Student s1 = new Student();
//		s1.setId(1);
//		s1.setName("Sagar");
//		s1.setAddress("Pune Charholi Bk");
//		s1.setPhone(9234657893l);
//		
//		Student s2 = new Student();
//        s2.setId(2);
//        s2.setName("Nilesh");
//        s2.setPhone(987233210l);
//        s2.setAddress("456 Avenue, Town");
//        
//        Student s3 = new Student();
//        s3.setId(3);
//        s3.setName("Bhaskar");
//        s3.setPhone(91223176210l);
//        s3.setAddress("456 Avenue, Town");
//        
//        List<Student> st = new ArrayList<Student>();
//        st.add(s1);
//        st.add(s2);
//        st.add(s3);

//		Student s1 = new Student();
//		s1.setId(3);
//		s1.setName("Ruvighna");
//		s1.setAddress("Nashik, Maharashtra");
//		s1.setPhone(7584657893l);
//		
//		StudentDao stud = new StudentDao();
//		stud.saveStudent(s1, 1);
//		stud.saveMulitpleStudent(st, 1);
//		 stud.saveStudent(s1, 1);
		
//		stud.removeStudent(3, 1);
	}

}

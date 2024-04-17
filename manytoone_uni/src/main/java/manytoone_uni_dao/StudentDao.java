package manytoone_uni_dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytoone_uni_dto.College;
import manytoone_uni_dto.Student;

public class StudentDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	public void saveStudent(Student stud, int clgId) {
		College clg = manager.find(College.class, clgId);
		if (clg != null) {
			transaction.begin();
			manager.persist(stud);
			transaction.commit();
		} else {
			System.out.println("Company ID not found");
		}
	}

	public void saveMulitpleStudent(List<Student> stud, int id) {

		College clg = manager.find(College.class, id);
		if (clg != null) {
			transaction.begin();
			for (Student st : stud) {
				st.setC(clg);
				manager.persist(st);

			}

			transaction.commit();

		} else {
			System.out.println("Company ID not found");
		}
	}
	
	public void removeStudent(int stId, int clgId)
	{
		College clg = manager.find(College.class,clgId);
		if(clg != null)
		{
			Student stud = manager.find(Student.class, stId);
			if(stud != null)
			{
				transaction.begin();
				manager.remove(stud);
				transaction.commit();
			}
			else
			{
				System.out.println("Student ID not found");
			}
		}
		else
		{
			System.out.println("Company ID not found");
		}
	}

	public void updateStudent()
	{
		
	}
	
}

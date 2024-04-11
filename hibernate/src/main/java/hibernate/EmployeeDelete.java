package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDelete {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager employee = factory.createEntityManager();
		EntityTransaction transaction = employee.getTransaction();
		
		Employee e = employee.find(Employee.class, 1);
		transaction.begin();
		
		employee.remove(e);
		
		transaction.commit();
	}

}

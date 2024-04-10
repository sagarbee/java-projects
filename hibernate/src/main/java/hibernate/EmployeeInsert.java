package hibernate;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeInsert {

	public static void main(String[] args) {
	
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Sagar");
		employee.setPhno(9899484488l);
		employee.setAddress("Pune");
		
	EntityManagerFactory factory	= Persistence.createEntityManagerFactory("sagar");
	EntityManager manager =	factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	transaction.begin();
	
	manager.persist(employee);
	
	transaction.commit();
	
	}
}

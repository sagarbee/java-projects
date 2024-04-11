package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeUpdate {

	public static void main(String[] args) {

//		Employee employee = new Employee();
//		employee.setId(300);
//		employee.setName("Ravi");
//		employee.setAddress("Mumbai");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		Employee checkEmployee = manager.find(Employee.class,1);
//		if (checkEmployee != null) {
//			transaction.begin();
//			manager.merge(employee);
//			transaction.commit();
//		} else {
//			System.out.println("Id Not found");
//		}

		// To update specific data
		
		if(checkEmployee != null)
		{
			checkEmployee.setName("Akash");
			transaction.begin();
			manager.merge(checkEmployee);
			transaction.commit();
		}
		else
		{
			System.out.println("ID not found");
		}
	}
}

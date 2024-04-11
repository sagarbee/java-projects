package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeFetch {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
		EntityManager employee = factory.createEntityManager();

		Employee e = employee.find(Employee.class, 1);

		if (employee != null)
			System.out.println(e);
		else
			System.out.println("Employee Id Not found");

	}

}

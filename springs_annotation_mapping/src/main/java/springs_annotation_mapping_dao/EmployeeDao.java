package springs_annotation_mapping_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springs_annotation_mapping_dto.Employee;

@Component
public class EmployeeDao {

	@Autowired
	EntityManager manager;

	public void saveEmployee(Employee employee) {

		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(employee);
		transaction.commit();

	}

	public void updateEmployee(Employee employee, int eid) {
		Employee dbEmployee = manager.find(Employee.class, eid);
		if (dbEmployee != null) {
				employee.setId(dbEmployee.getId());
				EntityTransaction transaction = manager.getTransaction();
				transaction.begin();
				manager.merge(employee);
				transaction.commit();
		} else {
			System.out.println("Employee not found");
		}
	}

	public void deleteEmployee(int eid) {
		Employee employee = manager.find(Employee.class, eid);

		if (employee != null) {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.remove(employee);
			transaction.commit();
		} else {
			System.out.println("Employee data not found");
		}
	}
}

package onetomany_uni_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomany_uni_dto.Company;
import onetomany_uni_dto.Employee;

public class CompanyDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("sagar");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	public void saveCompany(Company cmp) {
		List<Employee> list = cmp.getList();
		transaction.begin();
		for (Employee emp : list) {

			manager.persist(emp);
		}
		manager.persist(cmp);
		transaction.commit();
	}

	public void getCompany(int id) {

		Company cmp = manager.find(Company.class, id);
		if (cmp != null) {
			System.out.println(cmp);
		} else {
			System.out.println("Company ID not found");
		}
	}

	public void deleteCompany(int id) {

		Company cmp = manager.find(Company.class, id);

		if (cmp != null) {

			List<Employee> list = cmp.getList();

			transaction.begin();

			for (Employee emp : list) {
				manager.remove(emp);
			}
			manager.remove(cmp);
			transaction.commit();
		} else {
			System.out.println("No company found with id: " + id);
		}
	}

	public void updateCompany(int id, Company cmp) {

		Company cmp2 = manager.find(Company.class, id);
		if (cmp2 != null) {
			cmp.setId(id);
			cmp.setList(cmp2.getList());

			transaction.begin();
			manager.merge(cmp);
			transaction.commit();
		} else {
			System.out.println("No Company found with id: " + id);
		}
	}

	public void updateBoth(int id, Company cmp) {
		Company cmp2 = manager.find(Company.class, id);
		if (cmp2 != null) {
			cmp.setId(id);
			for (int i = 0; i < cmp2.getList().size(); i++) {
				cmp.getList().get(i).setId(cmp2.getList().get(i).getId());
			}

			transaction.begin();
			for (Employee emp : cmp.getList()) {
				manager.merge(emp);
			}
			manager.merge(cmp);
			transaction.commit();
		} else {
			System.out.println("No Company found with id: " + id);
		}
	}

	public void addEmployeeToExistingCompany(int companyId, Employee employee) {
		EntityTransaction transaction = manager.getTransaction();
		Company company = manager.find(Company.class, companyId);
		if (company != null) {
			transaction.begin();
			List<Employee> employees = company.getList();
			employees.add(employee);
			transaction.commit();
		} else {
			System.out.println("Company with ID " + companyId + " not found.");
		}
	}

	public void addMultipleEmployeeInExistingCompany(int companyId, List<Employee> employees) {
		EntityTransaction transaction = manager.getTransaction();
		Company company = manager.find(Company.class, companyId);
		if (company != null) {
			transaction.begin();
			List<Employee> existingEmployees = company.getList();
			existingEmployees.addAll(employees);
			transaction.commit();
		} else {
			System.out.println("Company with ID " + companyId + " not found.");
		}
	}

	public void removeEmployee(int companyId, int employeeId) {
		EntityTransaction transaction = manager.getTransaction();
		Company company = manager.find(Company.class, companyId);
		if (company != null) {
			transaction.begin();
			List<Employee> employees = company.getList();
			employees.removeIf(emp -> emp.getId() == employeeId);
			transaction.commit();
		} else {
			System.out.println("Company with ID " + companyId + " not found.");
		}
	}

	public void removeMultipleEmployee(int companyId, List<Integer> employeeIds) {
		EntityTransaction transaction = manager.getTransaction();
		Company company = manager.find(Company.class, companyId);
		if (company != null) {
			transaction.begin();
			List<Employee> employees = company.getList();
			employees.removeIf(emp -> employeeIds.contains(emp.getId()));
			transaction.commit();
		} else {
			System.out.println("Company with ID " + companyId + " not found.");
		}
	}
}

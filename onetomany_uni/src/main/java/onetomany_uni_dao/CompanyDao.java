package onetomany_uni_dao;

import java.util.Iterator;
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
			
			System.out.print(cmp);
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
	    Company company = manager.find(Company.class, companyId);
	    if (company != null) {
	        transaction.begin();
	        manager.persist(employee);
	        company.getList().add(employee);
	        transaction.commit();
	        System.out.println("Employee added to company successfully");
	    } else {
	        System.out.println("Company not found");
	    }
	}

	
	public void addMultipleEmployeesToExistingCompany(int companyId, List<Employee> employees) {
	    Company company = manager.find(Company.class, companyId);
	    if (company != null) {
	        transaction.begin();
	        for (Employee employee : employees) {
	            manager.persist(employee);
	            company.getList().add(employee);
	        }
	        transaction.commit();
	        System.out.println("Employees added to company successfully");
	    } else {
	        System.out.println("Company not found");
	    }
	}

	
	public void removeEmployeeFromExistingCompany(int companyId, int employeeId) {
	    Company company = manager.find(Company.class, companyId);
	    if (company != null) {
	        Employee employeeToRemove = null;
	        for (Employee employee : company.getList()) {
	            if (employee.getId() == employeeId) {
	                employeeToRemove = employee;
	                break;
	            }
	        }
	        if (employeeToRemove != null) {
	            transaction.begin();
	            company.getList().remove(employeeToRemove);
	            manager.remove(employeeToRemove);
	            transaction.commit();
	            System.out.println("Employee removed from company successfully");
	        } else {
	            System.out.println("Employee not found in company");
	        }
	    } else {
	        System.out.println("Company not found");
	    }
	}

	
	public void removeMultipleEmployeesFromExistingCompany(int companyId, List<Integer> employeeIds) {
	    Company company = manager.find(Company.class, companyId);
	    if (company != null) {
	        transaction.begin();
	        Iterator<Employee> iterator = company.getList().iterator();
	        while (iterator.hasNext()) {
	            Employee employee = iterator.next();
	            if (employeeIds.contains(employee.getId())) {
	                iterator.remove();
	                manager.remove(employee);
	            }
	        }
	        transaction.commit();
	        System.out.println("Employees removed from company successfully");
	    } else {
	        System.out.println("Company not found");
	    }
	}
}

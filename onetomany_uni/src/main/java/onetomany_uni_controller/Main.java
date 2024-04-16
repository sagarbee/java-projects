package onetomany_uni_controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomany_uni_dao.CompanyDao;
import onetomany_uni_dto.Company;
import onetomany_uni_dto.Employee;

public class Main {

	public static void main(String[] args) {
	
		Employee e3 = new Employee();
		e3.setId(8);
		e3.setName("Phule");
		e3.setAddress("Nagpur");
		e3.setPhone(989456456454454l);

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e3);
		
		Company c1 = new Company();
		c1.setId(1002);
		c1.setName("EPAM");
		c1.setLocation("Hydrabad");
		c1.setList(empList);
		
		CompanyDao companydao = new CompanyDao();
//		companydao.saveCompany(c1);
	
//		companydao.deleteCompany(1002);
//		companydao.updateCompany(1001, c1);
		
		companydao.addEmployeeToExistingCompany(1001,e3); 
		
	}
	
}

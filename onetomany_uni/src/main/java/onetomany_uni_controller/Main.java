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
	
//		Employee e1 = new Employee();
//		e1.setId(1);
//		e1.setName("Dipak");
//		e1.setAddress("Nashik");
//		e1.setPhone(87954456454454l);
//
//		Employee e2 = new Employee();
//		e2.setId(2);
//		e2.setName("sampar");
//		e2.setAddress("Nashik");
//		e2.setPhone(87954456454454l);
//		
//		Employee e3 = new Employee();
//		e3.setId(3);
//		e3.setName("omkar");
//		e3.setAddress("Nashik");
//		e3.setPhone(87954456454454l);
//		
		Employee addInCompany = new Employee();
		addInCompany.setId(5);
		addInCompany.setName("Vipul");
		addInCompany.setAddress("Nashik");
		addInCompany.setPhone(87954456454454l);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(addInCompany);
//		empList.add(e2);
//		empList.add(e3);
//		empList.add(e4);
		
		Company c1 = new Company();
		c1.setId(1002);
		c1.setName("IBM");
		c1.setLocation("Kochi");
		c1.setList(empList);
		
		CompanyDao companydao = new CompanyDao();
//		companydao.saveCompany(c1);
	
//		companydao.deleteCompany(1002);
//		companydao.updateCompany(1001, c1);
		
		companydao.addEmployeeToExistingCompany(1002,addInCompany); 
		
	}
	
}

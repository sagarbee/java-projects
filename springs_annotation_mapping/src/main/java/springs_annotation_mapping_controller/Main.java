package springs_annotation_mapping_controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springs_annotation_mapping_dao.EmployeeDao;
import springs_annotation_mapping_dao.OTOConfig;
import springs_annotation_mapping_dto.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(OTOConfig.class);
		EmployeeDao dao = context.getBean("employeeDao",EmployeeDao.class);
		
		Employee employee = context.getBean("employee",Employee.class);
//		dao.saveEmployee(employee);
		
		employee.setName("Luffy");
		employee.setPhone(8945632147l);

		dao.updateEmployee(employee, 2);
	}

}

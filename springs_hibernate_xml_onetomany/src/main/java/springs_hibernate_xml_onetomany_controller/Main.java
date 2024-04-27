package springs_hibernate_xml_onetomany_controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springs_hibernate_xml_onetomany_dao.CountryDao;
import springs_hibernate_xml_onetomany_dto.Country;
import springs_hibernate_xml_onetomany_dto.State;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("c");
		CountryDao dao =(CountryDao)context.getBean("dao");
//		dao.saveCountry(country);
//		dao.fetchCountry(1);
//		dao.deleteCountry(1);
		
//		State karnataka =(State)context.getBean("s3");
//		dao.addState(1, karnataka);
		
		dao.removeStateFromCountry(1, 2);
		
		
	}

}

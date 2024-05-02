package eShop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("eshop.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Customer customer = factory.getBean(Customer.class);
		customer.buy();
		customer.buy();
		
	}
	
}

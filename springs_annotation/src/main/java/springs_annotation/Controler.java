package springs_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Controler {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Product product=context.getBean("product", Product.class);
		product.description();
		System.out.println(product.getName()+" has price : "+product.getPrice());
		
		Product product1=context.getBean("product", Product.class);
		product1.description();
		System.out.println(product1.getName()+" has price : "+product1.getPrice());

		System.out.println(product);
		System.out.println(product1);

	}

	
}

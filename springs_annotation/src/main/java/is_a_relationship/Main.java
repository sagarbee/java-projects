package is_a_relationship;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ItemConfig.class);
		Item item1=context.getBean("computer", Computer.class);
		item1.used();
		Item item2=context.getBean("pen", Pen.class);
		item2.used();
		System.out.println(	((Pen) item2).cost);
		Item item3=context.getBean("bike", Bike.class);
		item3.used();
	}

}

package ver6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext
				 ("ver6/applicationContext.xml");
		
		Car mycar = context.getBean("sonata", Car.class);
		
		
		mycar.printCarInfo();
	}

}

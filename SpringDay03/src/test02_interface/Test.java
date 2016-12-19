package test02_interface;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext
				("test02_interface/applicationContext.xml");
		
		
//		Sample s = context.getBean("sample",Sample.class)
		context.close();

	}
}

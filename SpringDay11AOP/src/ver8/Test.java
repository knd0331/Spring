package ver8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//AOP ���¿��� ��ü ���� �� �׽�Ʈ
public class Test {
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ver8/applicationContext.xml");
		
		Person p = context.getBean("boy",Person.class);
		p.makeFood(5);
		
		
		
	}

}

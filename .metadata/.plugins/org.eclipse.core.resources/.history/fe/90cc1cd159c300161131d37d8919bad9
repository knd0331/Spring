package ver5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//AOP 상태에서 객체 설계 및 테스트
public class Test {
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ver5/applicationContext.xml");
		
		Person p = context.getBean("lee",Person.class);
		p.makeFood(7);
		
		
		
	}

}

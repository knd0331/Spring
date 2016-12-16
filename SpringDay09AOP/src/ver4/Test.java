package ver4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//AOP 상태에서 객체 설계 및 테스트
public class Test {
	public static void main(String[] args) throws Exception {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("ver4/applicationContext.xml");
		
		Person p = context.getBean("lee",Person.class);
		Person p1 = context.getBean("kim",Person.class);
		p.makeFood(777);
//		p1.makeFood(500);
		
		
		
	}

}

package test01_named;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import vo.BookVO;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("test01_named/applicationContext.xml");
		
		BookDaoNamed daoNamed = context.getBean("dao",BookDaoNamed.class);
		
		BookVO book = new BookVO(100, "Spring DB","Kim", 15000, "¸ÖÄ·");
		
		System.out.println("insert:"+daoNamed.insert(book));
		
	
	}

}

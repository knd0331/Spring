package test01_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test01_spring.vo.BookVO;

public class Test {
	public static void main(String[] args) {
//		BookDao dao = new BookDao();
		ApplicationContext context = new 
				ClassPathXmlApplicationContext
				("test01_spring/applicationContext.xml");
		
		BookDao dao = 
				context.getBean("dao", BookDao.class);
		
		BookVO book = 
				new BookVO("Spring","yangyu",20000,"sds");
		System.out.println(dao.insert(book));
//		System.out.println(dao.update(2, book));
//		System.out.println(dao.delete(3));
//		System.out.println(dao.select(2));
		
//		for(BookVO b : dao.selectAll()){
//			System.out.println(b);
//		}
	}
}






package test01_oracle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test01_oracle.vo.BookVO;


public class Test {
	public static void main(String[] args) {
//		BookDao dao = new BookDao();
		ApplicationContext context = new 
				ClassPathXmlApplicationContext
				("test01_oracle/applicationContext.xml");
		
		BookDao dao = 
				context.getBean("book", BookDao.class);
		
		BookVO book = 
				new BookVO("Spring",20000,"sds");
		System.out.println(dao.insert(book));
//		System.out.println(dao.update(2, book));
//		System.out.println(dao.delete(3));
//		System.out.println(dao.select(2));
	}
}






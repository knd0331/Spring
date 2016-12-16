package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import repository.BookDao;
import vo.Book;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new
			ClassPathXmlApplicationContext
						("applicationContext.xml");
		
		Book b = new Book(3,"new title","","",1000);
		
		
		BookDao dao = 
				context.getBean("bookDao",BookDao.class);
		
		System.out.println(dao.update(b));
//		for(Book b: dao.selectAllList()){
//			System.out.println(b);
//		}
		
	}
}









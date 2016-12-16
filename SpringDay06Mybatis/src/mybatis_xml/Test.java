package mybatis_xml;

import vo.Book;

public class Test {
	
	public static void main(String[] args) {
		
		BookDao dao = new BookDao();
		
		
//		for(Book b : dao.selectList()){
//			System.out.println(b);
//		}
//		
		Book b = new Book();
//		b.setTitle("Á¦¸ñ");
//		b.setWriter("Kim");
//		b.setPublisher("¸ÖÄ·");
//		b.setPrice(35000);
//		b.setBook_num(2);
		
		
//		System.out.println("insert:"+dao.insert(b));
		System.out.println(dao.select(2));
//		System.out.println(dao.update(50000, 2));
	
	}

}

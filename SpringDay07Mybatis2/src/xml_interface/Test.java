package xml_interface;

import vo.Book;

public class Test {
	
	public static void main(String[] args) {
		
		BookDao dao = new BookDao();
		
		Book book = new Book("Mybatis", "가메4", "Choi", 25000);
		
		System.out.println(dao.insert(book));
		System.out.println("책번호:"+book.getB_book_num());
//		System.out.println(dao.select(2));
//		System.out.println(dao.selectList());
//		System.out.println(dao.delete(5, 6));
//		System.out.println(dao.updateBook(15000, 4));
	}

}

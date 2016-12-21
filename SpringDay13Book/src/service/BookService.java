package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.BookDao;
import vo.Book;

@Component
public class BookService {

	@Autowired
	private BookDao dao;

	public void setDao(BookDao dao) {
		this.dao = dao;
	}

	public boolean insertBook(Book book) {
		if (dao.insert(book) > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean deleteBook(Book book) {
		if (dao.delete(book) > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean updateBook(Book book) {
		if (dao.update(book) > 0) {
			return true;
		} else {
			return false;
		}
	}

	public Book selectBook(int bookNum) {
		return dao.select(bookNum);
	}

	public List<Book> bookList(int currentPage) {
		int Count = 10;
		int startRow = (currentPage - 1) * Count;
		int endRow = Count;
		return dao.selectList(startRow, endRow);

	}

}

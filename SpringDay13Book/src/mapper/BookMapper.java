package mapper;

import java.util.List;
import java.util.Map;

import vo.Book;

public interface BookMapper {
	
	public int insert(Book book);
	
	public int delete(Book book);
	
	public int update(Book book);
	
	public Book select(int bookNum);
	
	public List<Book> selectList(Map<String, Integer>param);

}

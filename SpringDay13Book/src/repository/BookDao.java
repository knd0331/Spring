package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mapper.BookMapper;
import vo.Book;

@Component
public class BookDao {
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
		this.sessionTemplate = sessionTemplate;
	}
	
	public int insert(Book book){
		BookMapper mapper = sessionTemplate.getMapper(BookMapper.class);
		return mapper.insert(book);
	}
	public int update(Book book){
		BookMapper mapper = sessionTemplate.getMapper(BookMapper.class);
		return mapper.update(book);
	}
	public int delete(Book book){
		BookMapper mapper = sessionTemplate.getMapper(BookMapper.class);
		return mapper.delete(book);
	}
	public Book select(int bookNum){
		BookMapper mapper = sessionTemplate.getMapper(BookMapper.class);
		return mapper.select(bookNum);
	}
	public List<Book> selectList(int startRow,int endRow){
		BookMapper mapper = sessionTemplate.getMapper(BookMapper.class);
		Map<String, Integer>param = new HashMap<>();
		param.put("startRow", startRow);
		param.put("endRow", endRow);
		return mapper.selectList(param);
	}
	

}

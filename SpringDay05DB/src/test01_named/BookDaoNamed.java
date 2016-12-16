package test01_named;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import vo.BookVO;

public class BookDaoNamed {
	
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	//////////////////////////////////////////////////
	public int insert(BookVO book){
		String sql =
				"insert into book(book_num,title,writer,publisher,price)"+
				"values(:bookNum,:title,:writer,:publisher,:price)";
		SqlParameterSource param = new BeanPropertySqlParameterSource(book);
		return jdbcTemplate.update(sql, param);
	}
	public int delete(int bookNum){
		String sql = 
				"delete from book where book_num=:bn";
		Map<String, Integer>paramMap = new HashMap<>();
		paramMap.put("bn", bookNum);
		return jdbcTemplate.update(sql, paramMap);
	}

}

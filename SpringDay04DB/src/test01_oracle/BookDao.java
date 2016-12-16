package test01_oracle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import test01_oracle.vo.*;

@Component("dao")
public class BookDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public BookDao(){}
	
	public BookDao(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insert(BookVO book){
		String sql = 
				"insert into book(book_num,title,price,publisher)"
				+ "values(book_seq.nextval, ?, ?, ?)";
		return jdbcTemplate.update(sql,
				book.getTitle(), 
				book.getPrice(),
				book.getPublisher()
				);
	}
//	public int update(int bookNum,BookVO book){
//		String sql = 
//				"update book set price=? where book_num=?";
//		 return jdbcTemplate.update(sql,
//					book.getPrice(),
//					bookNum
//					);
//	}
//	public int delete(int bookNum){
//		String sql = 
//				"delete from book where book_num=?";
//		 return jdbcTemplate.update(sql,
//					bookNum
//					);
//	}
//	public BookVO select(int bookNum){
//		List<BookVO>result = jdbcTemplate.query("select * from book where book_num=?", 
//				new RowMapper<BookVO>() {
//			
//			@Override
//			public BookVO mapRow(ResultSet rs, int rowNum) throws SQLException {
//				BookVO bookVO = new BookVO(
//						rs.getInt("book_num"),
//						rs.getString("title"),
//						rs.getString("writer"),
//						rs.getInt("price"),
//						rs.getString("publisher")
//						);
//				return bookVO;
//			}
//		},
//				bookNum);
//		return result.isEmpty()?null:result.get(0);
//				
//	}
}








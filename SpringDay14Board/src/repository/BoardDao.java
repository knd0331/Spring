package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.mapper.BoardMapper;
import vo.Article;

@Component
public class BoardDao {

	@Autowired
	private SqlSessionTemplate session;

	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}

	public int insert(Article article) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.insert(article);
	}

	public int updateReadCount(int articleNum) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.updateReadCount(articleNum);
	}

	public Article select(int articleNum) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.select(articleNum);
	}

	public List<Article> selectList(int startRow, int count) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		Map<String, Integer> map = new HashMap<>();
		map.put("startRow", startRow);
		map.put("count", count);
		return mapper.selectList(map);
	}

	public int selectCount() {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.selectArticleCount();
	}
	public int update(Article article){
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.update(article);
	}
	public int delete(Article article){
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.delete(article);
	}

}

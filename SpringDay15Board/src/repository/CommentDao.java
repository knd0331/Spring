package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.mapper.CommentMapper;
import vo.Comment;

@Component
public class CommentDao {
	@Autowired
	private SqlSessionTemplate session;

	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}

	public int insert(Comment comment) {
		CommentMapper mapper = session.getMapper(CommentMapper.class);
		return mapper.insert(comment);
	}

	public int update(Comment comment) {
		CommentMapper mapper = session.getMapper(CommentMapper.class);
		return mapper.update(comment);
	}

	public int delete(Comment comment) {
		CommentMapper mapper = session.getMapper(CommentMapper.class);
		return mapper.delete(comment);
	}

	public Comment select(int commentNum) {
		CommentMapper mapper = session.getMapper(CommentMapper.class);
		return mapper.select(commentNum);
	}

	public List<Comment> selectList(int startRow, int count, int articleNum) {
		CommentMapper mapper = session.getMapper(CommentMapper.class);
		Map<String, Integer> map = new HashMap<>();
		map.put("startRow", startRow);
		map.put("count", count);
		map.put("articleNum", articleNum);
		return mapper.selectList(map);
	}

	public int selectCoCount() {
		CommentMapper mapper = session.getMapper(CommentMapper.class);
		return mapper.selectCommentCount();
	}
}

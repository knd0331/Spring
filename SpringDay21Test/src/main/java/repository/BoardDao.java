package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mapper.BoardMapper;
import vo.Board;

@Component
public class BoardDao {

	@Autowired
	private SqlSessionTemplate session;

	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}

	public int insert(Board board) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.insert(board);
	}

	public int updateReadCount(int articleNum) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.updateReadCount(articleNum);
	}

	public Board select(int articleNum) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.select(articleNum);
	}

	public List<Board> selectList(int startRow, int count) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		Map<String, Integer> map = new HashMap<>();
		map.put("startRow", startRow);
		map.put("count", count);
		return mapper.selectList(map);
	}

	public int selectCount() {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.selectBoardCount();
	}
	public int update(Board board){
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.update(board);
	}
	public int delete(Board board){
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		return mapper.delete(board);
	}

}

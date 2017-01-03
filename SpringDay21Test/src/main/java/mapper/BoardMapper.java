package mapper;

import java.util.List;
import java.util.Map;

import vo.Board;

public interface BoardMapper {

	public int insert(Board board);

	public int update(Board board);
	
	public int updateReadCount(int articleNum);

	public int delete(Board board);

	public Board select(int articleNum);

	public List<Board> selectList(Map<String, Integer> map);

	public int selectBoardCount();
	

}

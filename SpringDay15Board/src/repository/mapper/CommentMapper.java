package repository.mapper;

import java.util.List;
import java.util.Map;

import vo.Comment;

public interface CommentMapper {

	public int insert(Comment comment);

	public int update(Comment comment);

	public int delete(Comment comment);

	public Comment select(int commentNum);

	public List<Comment> selectList(Map<String, Integer> map);
	
	public int selectCommentCount();

}

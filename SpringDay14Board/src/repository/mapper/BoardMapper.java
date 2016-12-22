package repository.mapper;

import java.util.List;
import java.util.Map;

import vo.Article;

public interface BoardMapper {

	public int insert(Article article);

	public int updateReadCount(int articleNum);

	public Article select(int articleNum);

	public List<Article> selectList(Map<String, Integer> map);

	public int selectArticleCount();

}

package mapper;

import java.util.List;
import java.util.Map;

import vo.Article;

public interface ArticleMapper {
	public Article selectArticle(int article_num);
	public List<Article> selectArticleList(Map<String,Integer> paramMap);
	public int updateArticle(Article article);
	public int deleteArticle(int article_num);
	public int insertArticle(Article article);
	public int updateReadCount(int article_num);
	public int updateFamily(int article_num);
	public int insertReply(Article article);
}

package repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mapper.ArticleMapper;
import vo.Article;

@Component
public class ArticleDao {
	@Autowired
	private SqlSessionTemplate session;
	
	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
	
	public int insert(Article article){
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		return mapper.insertArticle(article);
	}
	public int delete(int article_num){
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		return mapper.deleteArticle(article_num);
	}
	public int update(Article article){
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		return mapper.updateArticle(article);
	}
	public Article select(int article_num){
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		return mapper.selectArticle(article_num);
	}
	public List<Article> selectArticleList(int startRow,int endRow){
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		Map<String,Integer> paramMap = new HashMap<>();
		paramMap.put("startRow", startRow);
		paramMap.put("endRow", endRow);
		return mapper.selectArticleList(paramMap);
	}
	public int updateReadCount(int article_num){
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		return mapper.updateReadCount(article_num);
	}
	public int updateFamily(int article_num) {
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		return mapper.updateFamily(article_num);
	}

	public int insertReply(Article article) {
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		return mapper.insertReply(article);
	}
}

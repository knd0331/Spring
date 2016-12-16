package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.ArticleDao;
import vo.Article;

@Component
public class ArticleService {
	@Autowired
	private ArticleDao dao;

	public void setDao(ArticleDao dao) {
		this.dao = dao;
	}
	
	public Article selectNoReadCount(int article_num){
		return dao.select(article_num);
	}
	public Article selectReadCount(int article_num){
		dao.updateReadCount(article_num);
		return dao.select(article_num);
	}
	public List<Article> selectPage(int startRow,int endRow){
		return dao.selectArticleList(startRow,endRow);
	}
	public int insert(Article article){
		return dao.insert(article);
	}
	public int update(Article article){
		return dao.update(article);
	}
	public int delete(int article_num){
		return dao.delete(article_num);	
	}
	public boolean isPassword(int article_num,String password){
		Article savedArticle = dao.select(article_num);
		if(savedArticle==null){
			return false;
		} else{
			if(password.equals(savedArticle.getPassword())){
				return true;
			} else {
				return false;
			}
		}
	}

	public int updateFamily(int article_num) {
		return dao.updateFamily(article_num);		
	}
	public int insertReply(Article article){
		return dao.insertReply(article);
	}
}

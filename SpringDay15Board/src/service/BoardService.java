package service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.BoardDao;
import repository.CommentDao;
import vo.Article;
import vo.ArticlePage;
import vo.CommentPage;

@Component
public class BoardService {

	@Autowired
	private BoardDao dao;
	private CommentDao commentDao;

	public void setDao(BoardDao dao) {
		this.dao = dao;
	}
	
	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}

	// 글쓰기
	public int write(Article article) {
		int result = 0;

		article.setReadCount(0);
		article.setWriteDate(new Date());

		if (dao.insert(article) > 0) {
			result = article.getArticleNum();
		}
		return result;
	}

	// 글읽기
	public Article read(int articleNum, String id,int currentPage) {
		final int COUNT_PER_PAGE = 10;

		int startRow = (currentPage - 1) * COUNT_PER_PAGE;
		Article article = dao.select(articleNum);

		if (id == null || article != null && !id.equals(article.getWriter())) {
			dao.updateReadCount(articleNum);
			article.setReadCount(article.getReadCount() + 1);
			article.setCommentList(commentDao.selectList(startRow, COUNT_PER_PAGE, articleNum));
		}
		return article;
	}

	// 글 목록보기
	public ArticlePage makePage(int currentPage) {
		final int COUNT_PER_PAGE = 10;
		int totalArticleCount = dao.selectCount();
		// 게시글없으면 끝냄
		if (totalArticleCount == 0) {
			return new ArticlePage();
		}
		// 보여줄 게시글 가져오기
		int startRow = (currentPage - 1) * COUNT_PER_PAGE;
		List<Article> articleList = dao.selectList(startRow, COUNT_PER_PAGE);
		// 총 페이지수 계산
		int totalPage = totalArticleCount / COUNT_PER_PAGE;
		if (totalArticleCount % COUNT_PER_PAGE != 0) {
			totalPage++;
		}
		// 아래 페이지 링크계산
		int startPage = (currentPage - 1) / 10 * 10 + 1;
		int endPage = startPage + 9;
		if (endPage > totalPage)
			endPage = totalPage;
		return new ArticlePage(articleList, startPage, endPage, currentPage, totalPage);

	}

	// 글수정
	public int modify(String id, Article article) {
		Article original = dao.select(article.getArticleNum());
		int result = 0;

		if (id.equals(original.getWriter())) {
			result = dao.update(article);
		}
		return result;

	}

	// 글 삭제
	public int delete(String id, Article article) {
		Article original = dao.select(article.getArticleNum());
		int result = 0;

		if (id.equals(original.getWriter())) {
			result = dao.delete(article);
		}
		return result;
	}
	public Article nomalRead(int articleNum, String id){

		Article article = dao.select(articleNum);

		if (id == null || article != null && !id.equals(article.getWriter())) {
			dao.updateReadCount(articleNum);
			article.setReadCount(article.getReadCount() + 1);
		}
		return article;
	}

}

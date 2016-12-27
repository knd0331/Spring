package service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.CommentDao;
import vo.Comment;
import vo.CommentPage;

@Component
public class CommentService {

	@Autowired
	private CommentDao dao;

	public void setDao(CommentDao dao) {
		this.dao = dao;
	}

	public int writeCo(Comment comment, int articleNum) {

		comment.setArticleNum(articleNum);
		comment.setWriteDate(new Date());

		return dao.insert(comment);
	}
	
	public CommentPage makeCoPage(int currentPage,int articleNum) {
		final int COUNT_PER_PAGE = 10;
		int totalCommentCount = dao.selectCoCount();

		if (totalCommentCount == 0) {
			return new CommentPage();
		}

		int startRow = (currentPage - 1) * COUNT_PER_PAGE;
		List<Comment> commentList = dao.selectList(startRow, COUNT_PER_PAGE, articleNum);

		int totalPage = totalCommentCount / COUNT_PER_PAGE;
		if (totalCommentCount % COUNT_PER_PAGE != 0) {
			totalPage++;
		}
		
		int startPage = (currentPage - 1) / 10 * 10 + 1;
		int endPage = startPage + 9;
		if (endPage > totalPage)
			endPage = totalPage;
		return new CommentPage(commentList, startPage, endPage, currentPage, totalPage);

	}

}

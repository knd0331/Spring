package service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.BoardDao;
import vo.Board;
import vo.BoardPage;

@Component
public class BoardService {

	@Autowired
	private BoardDao dao;

	public void setDao(BoardDao dao) {
		this.dao = dao;
	}

	public int write(Board board) {
		int result = 0;

		board.setReadCount(0);
		board.setWriteDate(new Date());

		result = dao.insert(board);

		return result;
	}

	public Board read(int articleNum, String id, int currentPage) {

		Board board = dao.select(articleNum);

		if (id == null || board != null && !id.equals(board.getWriter())) {
			dao.updateReadCount(articleNum);
			board.setReadCount(board.getReadCount() + 1);
		}

		return board;
	}

	public BoardPage makePage(int currentPage) {
		final int COUNT_PER_PAGE = 10;
		int totalBoardCount = dao.selectCount();
		if (totalBoardCount == 0) {
			return new BoardPage();
		}
		int startRow = (currentPage - 1) * COUNT_PER_PAGE;
		List<Board> boardList = dao.selectList(startRow, COUNT_PER_PAGE);
		int totalPage = totalBoardCount / COUNT_PER_PAGE;
		if (totalBoardCount % COUNT_PER_PAGE != 0) {
			totalPage++;
		}
		int startPage = (currentPage - 1) / 10 * 10 + 1;
		int endPage = startPage + 9;
		if (endPage > totalPage)
			endPage = totalPage;
		return new BoardPage(boardList, startPage, endPage, currentPage, totalPage);

	}

	public int modify(String id, Board board) {
		Board original = dao.select(board.getArticleNum());
		int result = 0;

		if (id.equals(original.getWriter())) {
			result = dao.update(board);
		}
		return result;

	}

	public int delete(String id, Board board) {
		Board original = dao.select(board.getArticleNum());
		int result = 0;

		if (id.equals(original.getWriter())) {
			result = dao.delete(board);
		}
		return result;
	}

}

package vo;

import java.util.List;

public class BoardPage {
	
	private List<Board>boardList;
	private int startPage;
	private int endPage;
	private int currentPage;
	private int totalpage;
	
	
	
	public BoardPage() {
	}


	public BoardPage(List<Board> boardList, int startPage, int endPage, int currentPage, int totalpage) {
		this.boardList = boardList;
		this.startPage = startPage;
		this.endPage = endPage;
		this.currentPage = currentPage;
		this.totalpage = totalpage;
	}


	public List<Board> getBoardList() {
		return boardList;
	}


	public void setBoardList(List<Board> boardList) {
		this.boardList = boardList;
	}


	public int getStartPage() {
		return startPage;
	}


	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}


	public int getEndPage() {
		return endPage;
	}


	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}


	public int getCurrentPage() {
		return currentPage;
	}


	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}


	public int getTotalpage() {
		return totalpage;
	}


	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}
	
	

}

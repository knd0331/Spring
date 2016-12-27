package vo;

import java.util.List;

public class CommentPage {

	private List<Comment> commentList;
	private int startPage;
	private int endPage;
	private int currentPage;
	private int totalpage;

	public CommentPage() {
	}

	public CommentPage(List<Comment> commentList, int startPage, int endPage, int currentPage, int totalpage) {
		this.commentList = commentList;
		this.startPage = startPage;
		this.endPage = endPage;
		this.currentPage = currentPage;
		this.totalpage = totalpage;
	}
	

	public List<Comment> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
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

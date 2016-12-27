package vo;

import java.util.List;

public class ArticlePage {

	private List<Article> articleList;
	private int startPage;
	private int endPage;
	private int currentPage;
	private int totalpage;

	public ArticlePage() {
	}

	public ArticlePage(List<Article> articleList, int startPage, int endPage, int currentPage, int totalpage) {
		this.articleList = articleList;
		this.startPage = startPage;
		this.endPage = endPage;
		this.currentPage = currentPage;
		this.totalpage = totalpage;
	}

	public List<Article> getArticleList() {
		return articleList;
	}

	public void setArticleList(List<Article> articleList) {
		this.articleList = articleList;
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

package vo;

import java.util.Date;

public class Comment {

	private int commentNum;
	private int articleNum;
	private String id;
	private String content;
	private Date writeDate;


	public Comment() {
	}

	public Comment(String id, String content, Date writeDate) {
		this.id = id;
		this.content = content;
		this.writeDate = writeDate;
	}

	public Comment(int commentNum, int articleNum, String id, String content, Date writeDate) {
		this.commentNum = commentNum;
		this.articleNum = articleNum;
		this.id = id;
		this.content = content;
		this.writeDate = writeDate;
	}

	public int getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}

	public int getArticleNum() {
		return articleNum;
	}

	public void setArticleNum(int articleNum) {
		this.articleNum = articleNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

}

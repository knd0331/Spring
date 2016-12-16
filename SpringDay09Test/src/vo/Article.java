package vo;

public class Article {
	private int article_num;
	private String writedate;
	private int readcount;
	private String writer;
	private String password;
	private String title;
	private String content;
	private int family;
	private int parent;
	private int depth;
	
	public Article(){}
	
	public Article(int article_num, String writedate, int readcount, String writer, String password, String title,
			String content, int family, int parent, int depth) {
		super();
		this.article_num = article_num;
		this.writedate = writedate;
		this.readcount = readcount;
		this.writer = writer;
		this.password = password;
		this.title = title;
		this.content = content;
		this.family = family;
		this.parent = parent;
		this.depth = depth;
	}



	public int getArticle_num() {
		return article_num;
	}
	public void setArticle_num(int article_num) {
		this.article_num = article_num;
	}
	public String getWritedate() {
		return writedate;
	}
	public void setWritedate(String writedate) {
		this.writedate = writedate;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public int getFamily() {
		return family;
	}

	public void setFamily(int family) {
		this.family = family;
	}

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	@Override
	public String toString() {
		return "Article [article_num=" + article_num + ", writedate=" + writedate + ", readcount=" + readcount
				+ ", writer=" + writer + ", password=" + password + ", title=" + title + ", content=" + content
				+ ", family=" + family + ", parent=" + parent + ", depth=" + depth + "]";
	}
	
	
}

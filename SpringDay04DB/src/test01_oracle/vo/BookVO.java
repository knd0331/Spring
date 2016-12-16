package test01_oracle.vo;

public class BookVO {
	private int bookNum;
	private String title;
	private int price;
	private String publisher;
////////////////////////////////////////////////////////
	public BookVO(){}
	public BookVO(String title, int price, String publisher) {
		this.title = title;
		this.price = price;
		this.publisher = publisher;
	}
	public BookVO(int bookNum,String title,int price, String publisher) {
		this.bookNum = bookNum;
		this.title = title;
		this.price = price;
		this.publisher = publisher;
	}	
////////////////////////////////////////////////////////	
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return "BookVO [bookNum=" + bookNum + ", title=" + title + ", price=" + price
				+ ", publisher=" + publisher + "]";
	}	
}

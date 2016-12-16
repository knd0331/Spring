package vo;

public class AccountVO {

	private int accountNum;
	private String name;
	private String password;
	private int price;

	public AccountVO() {
	}

	public AccountVO(int accountNum, String name, int price) {
		this.accountNum = accountNum;
		this.name = name;
		this.price = price;
	}
	public AccountVO(String name, String password, int price) {
		this.name = name;
		this.password = password;
		this.price = price;
	}
	

	public AccountVO(int accountNum, String name, String password, int price) {
		this.accountNum = accountNum;
		this.name = name;
		this.password = password;
		this.price = price;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AccountVO [accountNum=" + accountNum + ", name=" + name + ", price=" + price + "]";
	}

}

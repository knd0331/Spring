package vo;

public class Member {

	private int memberNum;
	private String id;
	private String password;
	private String email;
	private String phone;
	private String address;

	public Member() {
	}

	public Member(int memberNum, String id, String password, String email, String phone, String address) {
		this.memberNum = memberNum;
		this.id = id;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public Member(String id, String password, String email, String phone, String address) {
		this.id = id;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	public int getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

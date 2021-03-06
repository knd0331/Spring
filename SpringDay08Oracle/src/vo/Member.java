package vo;

import oracle.sql.DATE;
import oracle.sql.TIMESTAMP;

public class Member {

	private int memberNum;
	private String id;
	private String password;
	private String email;
	private DATE dateTime;

	public Member() {
	}
	

	public Member(String id, String password, String email) {
		this.id = id;
		this.password = password;
		this.email = email;
	}

	public Member(String id, String password, String email, DATE dateTime) {
		this.id = id;
		this.password = password;
		this.email = email;
		this.dateTime = dateTime;
	}

	public Member(int memberNum, String id, String password, String email, DATE dateTime) {
		this.memberNum = memberNum;
		this.id = id;
		this.password = password;
		this.email = email;
		this.dateTime = dateTime;
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

	public DATE getdateTime() {
		return dateTime;
	}

	public void setdateTime(DATE dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public String toString() {
		return "Member [memberNum=" + memberNum + ", id=" + id + ", password=" + password + ", email=" + email
				+ ", dateTime=" + dateTime + "]";
	}

}

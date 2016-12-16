package vo;

public class Info {

	private int info_num;
	private String name;
	private String birthDate;
	private String address;
	private String phoneNumber;

	public Info() {
	}

	public Info(String name, String birthDate, String address, String phoneNumber) {
		this.name = name;
		this.birthDate = birthDate;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public int getInfo_num() {
		return info_num;
	}

	public void setInfo_num(int info_num) {
		this.info_num = info_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Info [info_num=" + info_num + ", name=" + name + ", birthDate=" + birthDate + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}

}

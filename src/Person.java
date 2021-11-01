
public class Person {
	private String name;
	private String phoneNumber;
	private String address;

	public Person() {
	}

	public Person(String name, String phoneNumber, String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getPersonName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void showPersonInfo() {
		System.out.println(name + "," + phoneNumber + "," + address);
	}

//	public void setPersonName(String name) {
//		this.name = name;
//
//	}
//
//	public void setPhoneNumber(String phoneNumber) {
//		this.phoneNumber = phoneNumber;
//
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
}
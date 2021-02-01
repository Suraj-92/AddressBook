public class Person {
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public String zipCode;
	public String phoneNumber;
	
	Person(String firstName, String lastName, String address, String city, String state, String zipCode,String phoneNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "personInfo [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zipcode=" + zipCode + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}

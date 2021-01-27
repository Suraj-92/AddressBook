import java.util.*;

public class AddressBookMain {
	static Person readDataFromConsole() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Details of Person");
		System.out.println("Enter the first name");
		String firstName = sc.next();
		System.out.println("Enter the Last name");
		String lastName = sc.next();
		System.out.println("Enter the Address");
		String address = sc.next();
		System.out.println("Enter the City");
		String city = sc.next();
		System.out.println("Enter the State");
		String state = sc.next();
		System.out.println("Enter the ZipCode");
		int zipCode = sc.nextInt();
		System.out.println("Enter the contact number...");
		String phoneNumber = sc.next();

		return new Person(firstName, lastName, address, city, state, zipCode, phoneNumber);
	}

	static Person editPersonDetails(Person person) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Address");
		person.address = sc.next();
		System.out.println("Enter the City");
		person.city = sc.next();
		System.out.println("Enter the State");
		person.state = sc.next();
		System.out.println("Enter the ZipCode");
		person.zipCode = sc.nextInt();
		System.out.println("Enter the contact number...");
		person.phoneNumber = sc.next();
		return person;

	}
	
	static Person deletePersonDetails(Person person) {
		
	
		return null;
		
	}

	static void menu() {
		Person person = null;
		int choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ur choice \n 1 : Add \n 2 : Edit \n 3 : Delete \n 4 : Display ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				person = readDataFromConsole();
				break;
			case 2:

				System.out.println("Enter the person Name to edit details..");
				String firstName = sc.next();
				if (firstName.equals(person.firstName)) {
					person = editPersonDetails(person);
				} else {
					System.out.println(firstName + " is not exists ");
				}
				break;
			case 3:
				
				System.out.println("Enter the Person name to Delete the Details");
				String firstName1 = sc.next();
				if(firstName1.equals(person.firstName)) {
					person = deletePersonDetails(person);
				}
				else {
					System.out.println(firstName1 + " is not exists ");
				}
				break;
				
			case 4:
				System.out.println(person);
				break;
			default:
				System.out.println("Enter numer from 1 to 4");
			}
		} while (choice<5);
	}

	public static void main(String[] args) {
		// Person person = new Person("Suraj", "Temkar", "Chiplun", "Ratngiri",
		// "Maharastra", 342345, "4578965123");
		// Person person = readDataFromConsole();
		menu();
//		c.menu();
	}

}

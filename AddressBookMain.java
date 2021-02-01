import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class AddressBookMain {
	ArrayList<Person> al = null;
	AddressBookMain(){
		al = new ArrayList<>();
	}
	  public void  readDataFromConsole() {
		
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
		String zipCode = sc.next();
		System.out.println("Enter the contact number...");
		String phoneNumber = sc.next();
		
	al.add( new Person ( firstName, lastName, address, city, state, zipCode, phoneNumber ) );
	}
	  public void editPersonDetails(Person person) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Address");
		person.address = sc.next();
		System.out.println("Enter the City");
		person.city = sc.next();
		System.out.println("Enter the State");
		person.state = sc.next();
		System.out.println("Enter the ZipCode");
		person.zipCode = sc.next();
		System.out.println("Enter the contact number...");
		person.phoneNumber = sc.next();
		//return person;

	}
	
	public void  deletePersonDetails(Person person) {
		return;
	}

	static void menu() {
		Person person = null;
		AddressBookMain ab = new AddressBookMain();
		int choice;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ur choice \n 1: Add  \n 2: Edit  \n 3: Delete \n 4: Display ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				ab.readDataFromConsole();
				break;
			case 2:

				System.out.println("Enter the person Name to edit details..");
				String firstName = sc.next();
				ArrayList<Person> personlist = ab.al;
				for(int i = 0; i < ab.al.size(); i++)
				{
				if (personlist.get(i).firstName.equals(firstName))
				{
					Person personDetail = personlist.get(i);

					ab.editPersonDetails(personDetail);
				} else 
				{
					System.out.println(firstName + " is not exists ");
					}
				}
				break;
			case 3:
				
				System.out.println("Enter the Person name to Delete the Details");
				String firstName1 = sc.next();
				ArrayList<Person> personlist1 = ab.al;
				for(int i = 0; i < ab.al.size(); i++)
				{
				if (personlist1.get(i).firstName.equals(firstName1))
				{
					personlist1.remove(i);
					System.out.println("Deleted Successfully...");				
				}
				else 
					{
					System.out.println(firstName1 + " is not exists ");
					}
				}
				break;
			
			case 4:
				System.out.println(ab.al);
				break;
			
			default:
				System.out.println("Enter numer from 1 to 4");
			}
		} while (choice<5);
	}

	public static void main(String[] args) {
//		 Person person1 = new Person("Suraj", "Temkar", "Chiplun", "Ratngiri",
//		 "Maharastra", "415605", "4578965123");
		// Person person = readDataFromConsole();
			menu();
	}
}

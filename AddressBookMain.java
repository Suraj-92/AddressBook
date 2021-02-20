import java.util.*;

public class AddressBookMain {
	Scanner scanner = new Scanner(System.in);
	Person Person = new Person();
	LinkedList<Person> linkedList = new LinkedList<Person>();
	HashMap<String, LinkedList> hashMap = new HashMap<String, LinkedList>();
	String addressBookName;

	public void createAddressBook() {
		System.out.println("\nCreate address book ");
		System.out.println("\nGive name to the AddressBook ");
		String addressBookName = scanner.next();
		System.out.println("AddressBook name is :" + addressBookName);
		
		if (hashMap.containsKey(addressBookName)) 
		{
			System.out.println("\nAddressBook is already exist ,\nDo u want to create another?(y/n)");
			String ans = scanner.next();
			if (ans.equalsIgnoreCase("y")) {
				createAddressBook();
			}
		} else {
			hashMap.put(addressBookName, new LinkedList<Person>());
		}
	}
	
	public void addPerson(String addressBookName1) {
		if (hashMap.containsKey(addressBookName1)) {
			Person = new Person();
			
			System.out.println("\nEnter Fisrt name :");
			String firstName = scanner.next();
			if (hashMap.containsKey(firstName)) {		//no duplicate entry allow
				System.out.println("\nperson name is already exists ,\nDo u want to create another?(y/n)");
				String ans = scanner.next();
				if (ans.equalsIgnoreCase("y")) {
					addPerson(addressBookName1);
				}
			}
			else
			{
				hashMap.put(firstName, new LinkedList<Person>());
			}
			System.out.println("\nEnter first name :");
			String firstName2 = scanner.next();
			Person.setFirstName(firstName2);
			System.out.println("\nEnter last name :");
			String lastName = scanner.next();
			Person.setLastName(lastName);
			System.out.println("\nEnter address :");
			String address = scanner.next();
			Person.setAddress(address);
			System.out.println("\nEnter city name :");
			String city = scanner.next();
			Person.setCity(city);
			System.out.println("\nEnter state name :");
			String state = scanner.next();
			Person.setState(state);
			System.out.println("\nEnter zip code :");
			String zip = scanner.next();
			Person.setZipCode(zip);
			System.out.println("\nEnter phone number :");
			String phone = scanner.next();
			Person.setPhoneNumber(phone);	
			
			if (hashMap.get(addressBookName1) == null) {
				hashMap.put(addressBookName1, new LinkedList<Person>());
			}
			hashMap.get(addressBookName1).add(Person);
			linkedList = hashMap.get(addressBookName1);
			for (int i = 0; i < linkedList.size(); i++) {
				Person p1 = linkedList.get(i);
				System.out.println("Person name is :" + p1.getFirstName());
				p1.display();
			}
		} else {
			System.out.println("\n AddressBook is not exists ,\nYou first create AddressBook ");
			createAddressBook();
		}			
	}
	
	public void deletePerson() {
		System.out.println("\nEnter the name of addressBook which you want to delete ....");
		String deleteName = scanner.next();
		System.out.println("\nEnter the firstname of user which record you want to delete.... ");
		String first = scanner.next();
		LinkedList<Person> linkedList = hashMap.get(deleteName);

		if (linkedList != null) {
			for (int i = 0; i < linkedList.size(); i++) {
				Person p1 = linkedList.get(i);
				if (p1.getFirstName().equalsIgnoreCase(first)) {
					linkedList.remove(i);
					System.out.println("Deleted SuccessFully...");
					System.out.println("\n" + linkedList);
				}
			}
			System.out.println(linkedList.remove(deleteName));
		} else {
			System.out.println("No Details available");
		}
		for (Person per : linkedList) {
			System.out.println(per);
		}
		System.out.println("\n" + hashMap);		
	}

	public void editPerson() {
		System.out.println("\nEnter the name of addressBook which you want to update ....");
		String updateName = scanner.next();
		System.out.println("\nEnter Name :");
		String first = scanner.next();
		boolean flag = hashMap.containsKey(updateName);
		if (flag) {
			LinkedList<Person> linkedList = hashMap.get(updateName);
			for (int i = 0; i < linkedList.size(); i++) {
				Person p1 = linkedList.get(i);
				if (p1.getFirstName().equalsIgnoreCase(first)) 
				{
					System.out.println("\nU can update now   ");
					System.out.println("\nEnter first name :");
					String firstName = scanner.next();
					Person.setFirstName(firstName);
					System.out.println("\nEnter last name :");
					String lastName = scanner.next();
					Person.setLastName(lastName);
					System.out.println("\nEnter address :");
					String address = scanner.next();
					Person.setAddress(address);
					System.out.println("\nEnter city name :");
					String city = scanner.next();
					Person.setCity(city);
					System.out.println("\nEnter state name :");
					String state = scanner.next();
					Person.setState(state);
					System.out.println("\nEnter zip code :");
					String zip = scanner.next();
					Person.setZipCode(zip);
					System.out.println("\nEnter phone number :");
					String phone = scanner.next();
					Person.setPhoneNumber(phone);
					System.out.println("\nUpdated SuccessFully....");
				}
			}
		}
		linkedList = hashMap.get(updateName);
		for (int i = 0; i < linkedList.size(); i++) {
			Person p1 = linkedList.get(i);
			System.out.println("Person name is :" + p1.getFirstName());
			p1.display();
		}	
	}
	
	public static void menu() {
		AddressBookMain ab = new AddressBookMain();
		Scanner sc = new Scanner(System.in);
		System.out.println("---MenuBar---");
		String choice;
		do {
			System.out.println("\nchoices are :\n1. create new AddressBook \n2. Add Person \n3. Delete Person \n4. Update Person .");
			System.out.println("\nEnter your choice");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1 :
				ab.createAddressBook();
				break;
			
			case 2 :
				System.out.println("Give name of the addressBook");
				String addressBookName1 = sc.next();
				ab.addPerson(addressBookName1);
				break;
			case 3:
				ab.deletePerson();
				break;
			case 4:
				ab.editPerson();
				break;
			}
			System.out.println("\nDo You Want To continue? y Or n");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("y"));
		if(choice.equalsIgnoreCase("n"))
		{
			System.out.println("Thank You....");
		}
	}
	public static void main(String[] args) {
		menu();
	}	
}

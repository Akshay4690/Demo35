package CFP_Assignmentes;

import java.util.Scanner;

public class AddressBookDriver {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		AddressBook a1 = new AddressBook();
		
		System.out.println("WelCome to new AddressBook");
		
		while(true)
		{
			System.out.println("1.Add a new contact");
			System.out.println("2. Edit Contact");
			System.out.println("3. delet the Contact");
			System.out.println("4. Display all Contacts");
			System.out.println("5. Quit");
			
			System.out.println("\nEnter your choice: ");
			int choice = sc.nextInt();
			
			switch (choice)
			{
			case 1:
				sc.nextLine();
				System.out.println("Enter first name: ");
				String firstName = sc.nextLine();
				
				System.out.println("Enter lastName: ");
				String lastName = sc.nextLine();
				
				System.out.println("Enter Address: ");
				String address = sc.nextLine();
				
				System.out.println("Enter city: ");
				String city = sc.nextLine();
				
				System.out.println("Enter state: ");
				String state = sc.nextLine();
				
				System.out.println("Enter zip: ");
				String zip = sc.nextLine();
				
				System.out.println("Enter Phone Number: ");
				String phoneNumber = sc.nextLine();
				
				System.out.println("Enter email: ");
				String email = sc.nextLine();
				break;
				
			case 2:
				sc.nextLine();
				System.out.println("Enter first name: ");
				firstName = sc.nextLine();
				
				System.out.println("Enter lastName: ");
				lastName = sc.nextLine();
				a1.editContact(firstName, lastName);
				break;
				
			case 3:
				sc.nextLine();
				System.out.println("Enter first name: ");
				firstName  = sc.nextLine();
				
				System.out.println("Enter lastName: ");
				lastName = sc.nextLine();
				
				a1.deletContact(firstName, lastName);
				break;
				
			case 4:
				System.out.println("Contacts");
				a1.displayContact();
				
			case 5:
				System.out.println("Quit...");
				return;
				
			default:
				System.out.println("Invalid Choice please try again.");
			}
		}
	}

}

package CFP_Assignmentes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	
	private List<AdressContact> contacts;
	
	public AddressBook()
	{
		this.contacts = new ArrayList<>();
	}
	
	public void addContact(AdressContact contact)
	{
		contacts.add(contact);
		System.out.println("Contact added Successfully.");
	}
	
	public void editContact (String firstName, String lastName)
	{
		for (AdressContact contact : contacts)
		{
			if (contact.getFirstName().equals(firstName)&& contact.getLastName().equals(lastName))
			{
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter new Address: ");
				String address = sc.nextLine();
				contact.setAddress(address);
				
				System.out.println("Enter new city: ");
				String city = sc.nextLine();
				contact.setCity(city);
				
				System.out.println("Enter new state: ");
				String state = sc.nextLine();
				contact.setState(state);
				
				System.out.println("Enter new zip: ");
				String zip = sc.nextLine();
				contact.setZip(zip);
				
				System.out.println("Enter Phone Number: ");
				String phoneNumber = sc.nextLine();
				contact.setPhoneNumber(phoneNumber);
				
				System.out.println("Enter new email: ");
				String email = sc.nextLine();
				
				System.out.println("Updated Sucessfully");
				
				
				System.out.println("contact updated sucessfully.");
				return;
				
			}
		}	
		System.out.println("Contact not found.");
	}
	
	public void deletContact(String firstName, String lastName)        
	{
		for (AdressContact contact : contacts)
		{
			if (contact.getFirstName().equals(firstName)&& contact.getLastName().equals(lastName))
			{
				contacts.remove(contact);
				System.out.println("Contact Delet successfully...!");
				return;
			}
		}
		System.out.println("Contact not found.");	
	}
	
	public void displayContact()
	{
		if (contacts.isEmpty())
		{
			System.out.println("Contact Not Found.");
			return;
		}
		
		for(AdressContact contact : contacts)
		{
			System.out.println(contact);
			System.out.println("_______________________________________");
		}
	}
	
}



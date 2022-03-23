import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, Contact> map = new HashMap<>();
		
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		
		String displayMenu = "[add, list, count, info, delete, search, exit]";
		Scanner input = new Scanner(System.in);
		String choice;
		String name;
		String phone = null;
		String email;
		String dob;
		String website;
		
		
		do {
			System.out.println(displayMenu);
			choice = input.nextLine();
			
			if (choice.equalsIgnoreCase("add")) {
				System.out.println("");
				choice = input.nextLine();
				
				if (choice.equalsIgnoreCase("person")) {
					System.out.println("name");
					name = input.nextLine();
					
					System.out.println("number");
					phone = input.nextLine();
					
					 if (!Contact.isValid(phone)) {
						 phone = "No Number";
					 }
					 
					System.out.println("email");
					email = input.nextLine();
					
					System.out.println("DOB");
					dob = input.nextLine();
					
					contacts.add(new Person(name, phone, email, dob));
					
				} else if (choice.equalsIgnoreCase("organization")) {
					
					System.out.println("name");
					name = input.nextLine();
					
					System.out.println("number");
					phone = input.nextLine();
					
					if (!Contact.isValid(phone)) {
						phone = "No Number";
					}
					
					System.out.println("website");
					website = input.nextLine();
					
					contacts.add(new Organization(name, phone, website));
				}
				
				
			} else if (choice.equalsIgnoreCase("list")) {
				System.out.println();
				
			} else if (choice.equalsIgnoreCase("count")) {
				System.out.println();
				
			} else if (choice.equalsIgnoreCase("info")) {
				System.out.println();
			
			} else if (choice.equalsIgnoreCase("delete")) { 
				System.out.println();
				System.out.println();
				
				int id = input.nextInt();	
					if (map.containsKey(id)) {
						map.remove(id);
					}
					
			} else if (choice.equalsIgnoreCase("search")) {
				System.out.println();
			} 
			
		} while (choice.equalsIgnoreCase("exit"));
			System.out.println("Thanks for using our PhoneBook");
		
		input.close();
 	}
	
	static void delete() {
		
	}
	
	static void search() {
		
	}
	
	static void info() {
		
	}
}
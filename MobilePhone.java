package DilerApp; 
import java.util.ArrayList; 
import java.util.Scanner;

class MobilePhone{
	private static Scanner scan = new Scanner(System.in);
	private ArrayList<Contact> directory = new ArrayList<Contact>();
	
	void menu(){
		System.out.println("Enter 0 to quit the application");
		System.out.println("Enter 1 to print list of contacts");
		System.out.println("Enter 2 to add new contact"); 
		System.out.println("Enter 3 to Update existing contact");
		System.out.println("Enter 4 to remove contact");
		System.out.println("Enter 5 to search contact");
	}
	
	void printList(){
		System.out.println("You have total " + directory.size()+ " in your contact list");
		for(int i=0; i<directory.size(); i++){
			System.out.println(directory.get(i).getName() + " : " + directory.get(i).getPhoneNumber());
		}
	}
	
	private int doesContactExist(String name){
		for(int i=0; i<directory.size(); i++){
			if((directory.get(i).getName()).equals(name)){
				return i;
			} 
		}
		return -1;
	}
	
	void addContact(){
		System.out.println("please enter the name"); 
		String name = scan.nextLine();
		int checker = doesContactExist(name);
		if(checker == -1){
			System.out.println("please enter the contact number");
			String contactNumber = scan.nextLine();
			directory.add(new Contact(name, contactNumber));
		}else{
			System.out.println("contact already exits in your contact list. do you want to update it? press 3 to update");
			System.out.println(name + " : " + directory.get(checker).getPhoneNumber()); 
		}
	}
	
	void updateContact(){
		System.out.println("please confirm the name");
		String name = scan.nextLine(); 
		int checker = doesContactExist(name);
		if(checker == -1){
			System.out.println("contact doesn't exist. do you want to add a new contact? enter 2 to add new contact");
		}else{
			System.out.println("please provide new contact number");
			String contactNumber = scan.nextLine();
			directory.get(checker).setPhoneNumber(contactNumber);
		}
	}
	
	void removeContact(){
		System.out.println("please enter contact name which you want to remove from list!");
		String contactName = scan.nextLine();
		int checker = doesContactExist(contactName);
		
		if(checker == -1){
			System.out.println("contact doesn't exist in your contact list");
		}else{
			System.out.println(directory.get(checker).getName() + " : " + directory.get(checker).getPhoneNumber() + " has been removed from your contact list");
		}	directory.remove(checker);
	}
	
	void searchContact(){
		System.out.println("plase enter name");
		String contactName = scan.nextLine();
		int checker = doesContactExist(contactName); 
		if(checker == -1){
			System.out.println("contact does not exist in your list");
		}else{
			System.out.println("your searched contact is");
			System.out.println(directory.get(checker).getName() + " : " + directory.get(checker).getPhoneNumber());
			
		}
	}
	
}
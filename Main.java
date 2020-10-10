package DilerApp;
import java.util.Scanner;  
class Main{
	private static Scanner scan = new Scanner(System.in);
	public static void main(String [] args){
		MobilePhone mobilePhone = new MobilePhone();
		
		boolean flag = false;
		mobilePhone.menu();
		
		while(!flag){
			int userInput = scan.nextInt();
			switch (userInput){
				case 0: System.out.println("Thank You! for using the application");
						flag = !flag;
						break;
						
				case 1: mobilePhone.printList();
						break; 
						
				case 2: mobilePhone.addContact();
						break; 
						
				case 3: mobilePhone.updateContact();
						break;
						
				case 4: mobilePhone.removeContact();
						break; 
						
				case 5: mobilePhone.searchContact();
						break;
						
				default: System.out.println("You have choosen wrong entry please choose one of below option");
						mobilePhone.menu();
			}
		}
	}
}
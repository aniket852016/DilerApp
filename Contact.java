package DilerApp;
class Contact{
	private String name; 
	private String phoneNumber; 
	
	Contact(String name, String phoneNumber){
		this.name = name; 
		this.phoneNumber = phoneNumber;
	}
	
	String getName(){
		return name; 
	}
	
	String getPhoneNumber(){
		return phoneNumber;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
}
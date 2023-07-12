package day03.practice;

public class CreateUser {
	
	private String name;
	
	private String pass;
	
	private	 String emailId;
	
	public CreateUser(String name,String pass,String emailId) {
		this.emailId = emailId;
		this.name = name;
		this.pass = pass;
	}
	 
	public String getName() {
		return name;
	}
	
	public String getPass() {
		return pass;
	}
	
	public String getEmailId() {
		return emailId;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateUser user = new CreateUser("kanna","3108","utchi@gmail");
		
		  
		
		System.out.println("User email id : "+user.getEmailId());
		System.out.println("User name : "+user.getName());
		System.out.println("User password : "+user.getPass());
		
	}

}

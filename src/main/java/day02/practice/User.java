package day02.practice;

public class User {
	
	private String name;
	private int id;
	private String pass;
	private String email;
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
   	}
	public String getPass() {
		return pass;
   	}
	
	public String getEmail() {
		return email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	 
	public void setId(int id) {
			this.id = id;
		}
	public void setPass(String password) {
			this.pass = password;
		}
	public void setEmail(String email) {
			this.email = email;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user = new User();
		
		user.setName("kanna");
		user.setId(133);
		user.setPass("3108");
		user.setEmail("utchi@gmail");
		
		String name = user.getName();
		int id = user.getId();
		String pass = user.getPass();
		String email = user.getEmail();
		
		System.out.println(name); 
		System.out.println(id); 
		System.out.println(pass); 
		System.out.println(email); 
	}

}

package day03.practice;

public class EmId {
	
	public String id;
	
	public String name;
	
	public EmId(String id ,String name ) {
		
		this.id = id;
		this.name = name;
		
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmId user = new EmId("A0133","naresh");
		
		EmId user2 = new EmId("A0132","suresh");
		
		System.out.println("id = "+user.id+", name = "+user.name);
		
		System.out.println("id = "+user2.id+", name = "+user2.name);

	}

}

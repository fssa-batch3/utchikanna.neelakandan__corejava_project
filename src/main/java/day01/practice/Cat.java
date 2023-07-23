package day01.practice;

public class Cat {
    // Attributes
    private String speaks;
    private String color;
    private int age;
    
    public Cat(int age, String color, String speak) {

		this.color = color;
		this.age = age;
		this.speaks = speaks;
	}


    // Getters and setters
    public String getSpeaks() {
        return speaks;
    }

    public void setSpeaks(String speaks) {
        this.speaks = speaks;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
    	Cat cat1 = new Cat(4, "purple", "Meow!");
		Cat cat2 = new Cat(3, "blue", "Meow!");

		System.out.println("Cat 1:");
		System.out.println("Age : " + cat1.getAge());
		System.out.println("Color: " + cat1.getColor());
		System.out.println("Speak :" + cat1.getSpeaks());

		System.out.println("Cat 2:");
		System.out.println("Age : " + cat2.getAge());
		System.out.println("Color: " + cat2.getColor());
		System.out.println("Speak :" + cat2.getSpeaks());
        
    }
}

package day01.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CatTest {
	
	@Test
	public void checkCatColor() {
		Cat cat1 = new Cat(3, "Dark Black", "Meow!");
		System.out.println("Cat color is : Dark Black");
		
		if(cat1.getColor().equals("Dark Black")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		assertEquals(cat1.getColor(), "Dark Black");
	}
	
	@Test
	public void checkCatAge() {
		Cat cat1 = new Cat(3, "Dark Black", "Meow!");
		System.out.println("Cat age is : 3");
		if(cat1.getAge() == 3) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		assertEquals(cat1.getAge(),3);
		
		
	}
	@Test
	public void checkCatSpeak() {
		Cat cat1 = new Cat(3, "Dark Black", "Meow!");
		System.out.println("Cat speaks : Meow!");
		if(cat1.getSpeaks().equals("Meow!")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		assertEquals(cat1.getSpeaks(), "Meow!");
		
		
	}

}
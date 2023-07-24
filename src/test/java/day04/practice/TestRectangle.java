package day04.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestRectangle {
	
	@Test
	public void checkSquareLength() {
		
		Square oneSquare = new Square(7.0);
		double area = 49.0;
		System.out.println("Area of the square is : " + area);
		
		if(oneSquare.calculateArea() == area) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		assertEquals(oneSquare.calculateArea(), area);
	}

	
	@Test
	public void checkSquareSide() {
		
		Square oneSquare = new Square(7.0);
		double side = 7.0;
		System.out.println("Area of the side is : " + side);
		
		if(oneSquare.getLength() == side) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		assertEquals(oneSquare.getLength(), side);
	}
	
	
}
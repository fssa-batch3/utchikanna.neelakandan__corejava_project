package day04.practice;

public class TestRectangle {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Length: " + square.getLength());
        System.out.println("Breadth: " + square.getBreadth());
        System.out.println("Area: " + square.calculateArea());
    }
}

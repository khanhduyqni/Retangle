package edu.iuh.fit.ex2;

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(20.5, 5.0);

        System.out.println("Length r1: " + r1.getLength());
        System.out.println("Length r2: " + r2.getLength());

        try {
            r1.setLength(-10); // This will throw an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Length r1 after setting invalid length: " + r1.getLength());
        System.out.println("Length r2 remains unchanged: " + r2.getLength());

        System.out.println("Area r1: " + r1.getArea());
        System.out.println("Area r2: " + r2.getArea());
    }
}


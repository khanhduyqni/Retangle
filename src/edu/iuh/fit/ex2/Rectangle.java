package edu.iuh.fit.ex2;

/**
 * Description: This class represents a rectangle with length and width.
 */
public class Rectangle {

    // Attributes
    private double length;
    private double width;

    public Rectangle() {
        this(0.0, 0.0);
    }

    /**
     * Description: Set the length and width of the rectangle.
     * @param l the length of the rectangle
     * @param w the width of the rectangle
     * @throws IllegalArgumentException if length or width is less than 0
     */
    public Rectangle(double l, double w) {
        if (l < 0 || w < 0)
            throw new IllegalArgumentException("Length and width must be greater than or equal to 0");
        this.length = l;
        this.width = w;
    }

    // Setters and Getters

    /**
     * Description: Set the length of the rectangle.
     * @param length the length of the rectangle
     * @throws IllegalArgumentException if length is less than 0
     */
    public void setLength(double length) {
        if (length < 0)
            throw new IllegalArgumentException("Length must be greater than or equal to 0");
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    /**
     * Description: Set the width of the rectangle.
     * @param width the width of the rectangle
     * @throws IllegalArgumentException if width is less than 0
     */
    public void setWidth(double width) {
        if (width < 0)
            throw new IllegalArgumentException("Width must be greater than or equal to 0");
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    // Methods

    /**
     * Description: Calculate the area of the rectangle.
     * @return the area of the rectangle
     */
    public double getArea() {
        return this.length * this.width;
    }

    /**
     * Description: Calculate the perimeter of the rectangle.
     * @return the perimeter of the rectangle
     */
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }
}

//----->  Create a Shape class to serve as the base class for other shape classes:

import java.util.Date;

public class Shape {
    private static int nextID = 1;

    private int shapeID;
    private Date creationTime;

    public Shape() {
        this.shapeID = nextID++;
        this.creationTime = new Date();
    }

    public int getShapeID() {
        return shapeID;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    @Override
    public String toString() {
        return "Shape ID: " + shapeID + " | Created at: " + creationTime;
    }
}

//------->  Create classes for specific shapes (Rectangle, Square, Triangle) that extend the Shape class and add their own properties and methods as needed:

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    // Add getters and setters for length and width
    // Additional methods specific to Rectangle
}

public class Square extends Shape {
    private double side;

    public Square(double side) {
        super();
        this.side = side;
    }

    // Add getter and setter for side
    // Additional methods specific to Square
}

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    // Add getters and setters for base and height
    // Additional methods specific to Triangle
}

//------>  Create a ShapeNode class to represent each node in the linked list:

public class ShapeNode {
    private Shape shape;
    private ShapeNode next;

    public ShapeNode(Shape shape) {
        this.shape = shape;
        this.next = null;
    }

    // Add getters and setters for shape and next
}


//---> Create a LinkedList class to manage the list of shapes:

public class ShapeLinkedList {
    private ShapeNode head;

    public ShapeLinkedList() {
        this.head = null;
    }

    // Add methods to add shapes, remove shapes, and other operations on the linked list
}

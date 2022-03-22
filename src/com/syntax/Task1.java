package com.syntax;

public class Task1 {
    public static void main(String[] args) {
	//Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter. Create 2
        // classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
        Circle circle=new Circle(5);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        Square square=new Square(3);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
    }
}
interface Shape{
    double calculateArea();
    double calculatePerimeter();
}
class Circle implements Shape{
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
 public double calculateArea(){
        double circleArea=Math.PI*radius*radius;
        return circleArea;
    }
    @Override
    public double calculatePerimeter() {
        double circlePerimeter=2*Math.PI*radius;
        return circlePerimeter;
    }
    }
class Square implements Shape {
    double squareSide;

    public Square(double squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    public double calculateArea() {
        double squareArea = squareSide*squareSide;
        return squareArea;
    }
    @Override
    public double calculatePerimeter() {
        double squarePerimeter = 4*squareSide;
        return squarePerimeter;
    }
}
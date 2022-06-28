package com.syntax;

public class Task1 {
    public static void main(String[] args) {
	//Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter. Create 2
        // classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
        Shape circle=new Circle();
        System.out.println(circle.calculateArea(3));
        System.out.println(circle.calculatePerimeter(2));
        Shape square=new Square();
        System.out.println(square.calculateArea(5));
        System.out.println(square.calculatePerimeter(4));
    }
}
interface Shape{
    double calculateArea(double input);
    double calculatePerimeter(double input);
}
class Circle implements Shape{
    @Override
 public double calculateArea(double input){
        double circleArea=Math.PI*Math.pow(input,2);
        return circleArea;
    }
    @Override
    public double calculatePerimeter(double input) {
        double circlePerimeter=2*Math.PI*input;
        return circlePerimeter;
    }
    }
class Square implements Shape {
    @Override
    public double calculateArea(double input) {
        double squareArea = input*input;
        return squareArea;
    }
    @Override
    public double calculatePerimeter(double input) {
        double squarePerimeter = 4*input;
        return squarePerimeter;
    }
}
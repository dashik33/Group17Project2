package com.syntax;

public class Task3 {
    //Create a Class Car that would have the following fields:   carPrice   and   color   and   method
    //calculateSalePrice() which should be returning a price of the car.
    //Create 2 subclasses: Sedan and Truck. The Truck class   has   field   as   weight   and   has   its   own
    //implementation   of   calculateSalePrice()   method   in which   returned   price   calculated   as   following:   if
    //weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
    //The Sedan class has field as length and also does its own   implementation   of   calculateSalePrice():   if
    //length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
    public static void main(String[] args) {
        Car obj=new Car(5000, "blue");
        obj.calculateSalePrice();
        Sedan obj1=new Sedan(4000, 100 );
        obj1.calculateSalePrice();
        Truck obj2=new Truck(4500, 3000);
        obj2.calculateSalePrice();
    }
}
class Car{
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public Car() {

    }

    void calculateSalePrice(){
        System.out.println("The price of the car is "+carPrice+" and it is "+color);
    }
}
class Sedan extends Car{
    int length;

    public Sedan(double carPrice, int length) {
        this.carPrice = carPrice;
        this.length = length;
    }

    @Override
    void calculateSalePrice() {
        double finalPrice1;
        if (length > 20) {
            finalPrice1 = carPrice - (carPrice * 0.05);
            System.out.println("The price of a sedan is " + finalPrice1);
        } else {
            finalPrice1 = carPrice - (carPrice * 0.1);
            System.out.println("The price of a sedan is " + finalPrice1);
        }
    }
}
class Truck extends Car {
    double weight;

    public Truck(double carPrice, double weight) {
        this.carPrice = carPrice;
        this.weight = weight;
    }

    @Override
    void calculateSalePrice() {
        double finalPrice;
        if (weight > 2000) {
            finalPrice = carPrice - (carPrice * 0.1);
            System.out.println("The price of a truck is " + finalPrice);
        } else {
            finalPrice = carPrice - (carPrice * 0.2);
            System.out.println("The price of a truck is " + finalPrice);
        }
    }
}

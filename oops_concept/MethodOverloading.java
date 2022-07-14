package com.bridgelabz.oops_concept;
class Circle{
    double area(double side){
        return side*side*3.14;
    }
}
class Rectangle{
    double area(int side1, int side2){
        return side1*side2;
    }
}
class Square{
    int area(int side){
        return side*side;
    }
}
class Triangle{
    double area(int base, int height){
        return base*height*0.5;
    }
}
public class MethodOverloading {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        System.out.println("Area of circle with side = 2.1cm is "+circle.area(2.1));
        System.out.println("Area of square with side = 5cm is "+square.area(5));
        System.out.println("Area of rectangle with side = 2cm and 9cm is "+rectangle.area(2,9));
        System.out.println("Area of Triangle with side = 2cm and 5cm is "+triangle.area(2,5));

    }
}

// A parent class Shape has a method area() that prints "Calculating area".
// Create two subclasses Circle and Rectangle that override area().
// Circle should print "Area of Circle: πr²", and Rectangle should print "Area of Rectangle: l × b".
// In main(), create objects of Shape, Circle, and Rectangle, and call area().
class Shape{

    void area(){
        System.out.println("Calculating area");
    }
}
class Circle extends Shape{
    void area(){
        System.out.println("Area of Circle: πr²");
    }
}
class Rectangle extends Shape{
    void area(){
        System.out.println("Area of Rectangle: l * b");
    }
}

public class Polymor{
public static void main(String args[])
{
    Shape s= new Circle();//now this is polymorphism
    s.area();
    Circle c=new Circle();
    c.area();
    Rectangle r=new Rectangle();
    r.area();
}}

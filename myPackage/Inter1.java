package myPackage;

// public class Class1 {
//     protected int s=34;
//     public void fun1(int a, String s){
//         System.out.println("Value of a is "+a+" and value of s is "+s);
//     }
// }

// @FunctionalInterface
public interface Inter1{
     void display1();
     void display2();// now its not a functional interface as it has more than one abstract func

default void f(){
    System.out.println("Hello");

}
default void g(){
    System.out.println("yellow");
}

static void h(){
    System.out.println("green");
}
}


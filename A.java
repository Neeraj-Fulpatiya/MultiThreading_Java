class Demo {
    int num = 10;
}

public class A {
    public static void main(String[] args) {
        Demo obj1 = new Demo();  // ✅ obj1 is a reference variable
        Demo obj2 ;  // ✅ obj2 points to the same object as obj1

        obj1.num = 20;  // Changing obj1's object data

        System.out.println(obj1.num);  // ✅ Prints 20 (because obj1 & obj2 share the same object)
    }
}

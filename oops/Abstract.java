// Create an abstract class BankAccount with:

// An abstract method getBalance().
// A subclass SavingsAccount that provides an implementation for getBalance().
// In main(), create an object of SavingsAccount and call getBalance().

abstract class BankAccount {
    int total =1000;
     abstract void getBalance(int amount);
}
class SavingsAccount extends BankAccount{
    void getBalance(int amount){
        System.out.println("Balance is: "+(total+amount));
    }
}
public class Abstract {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.getBalance(222);

    }
}

// ********************************** 

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("HGJHJGJHGJ");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        // Using interface reference to refer to objects of implementing classes
        Animal animal1 = new Dog();  // Interface reference to a Dog object
        Animal animal2 = new Cat();  // Interface reference to a Cat object

        animal1.sound();  // Output: Bark
        animal2.sound();  // Output: Meow
    }
}

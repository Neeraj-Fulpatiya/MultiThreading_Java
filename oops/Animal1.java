     


// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class (overrides makeSound method)
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Another Child class
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Animal1 {
    public static void main(String[] args) {
        // Animal myAnimal;  // Parent class reference

        // myAnimal = new Dog();
        // myAnimal.makeSound();  // Calls Dog's makeSound()

        // myAnimal = new Cat();
        // myAnimal.makeSound();  // Calls Cat's makeSound()
        Dog aa= new Dog();
        aa.makeSound();
        Cat c=new Cat();
        c.makeSound();

    }
}


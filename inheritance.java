public class inheritance {
    public static void main(String[] args) {
        // Create an instance of the subclass
        Dog dog = new Dog();
        dog.sound();  // Calls the sound method of the Dog class
        dog.barks();  
    }
}

// Base class
class Animal {
    void barks() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

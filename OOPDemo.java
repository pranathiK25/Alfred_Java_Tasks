// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OOPDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();

        Animal d = new Dog(); // Polymorphism
        d.sound();
    }
}

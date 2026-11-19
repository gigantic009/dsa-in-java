import java.util.Scanner;

/** Demonstrates overriding and runtime polymorphism (dynamic dispatch). */
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose an animal (dog/cat): ");
        String choice = sc.nextLine().trim().toLowerCase();

        // The Animal reference can point to different subclass objects.
        Animal animal;
        if (choice.equals("dog")) {
            animal = new Dog();
        } else if (choice.equals("cat")) {
            animal = new Cat();
        } else {
            System.out.println("Unknown animal.");
            sc.close();
            return;
        }

        // Java selects the overridden method based on the object's actual type.
        animal.sound();
        sc.close();
    }
}
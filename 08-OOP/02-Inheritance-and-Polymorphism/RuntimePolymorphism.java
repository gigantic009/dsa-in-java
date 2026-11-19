import java.util.Scanner;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks."); // Runtime dispatch selects this overridden method.
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

        Animal animal; // The reference type is Animal; the object type varies.
        if (choice.equals("dog")) {
            animal = new Dog();
        } else if (choice.equals("cat")) {
            animal = new Cat();
        } else {
            System.out.println("Unknown animal.");
            sc.close();
            return;
        }

        animal.sound(); // Dynamic method dispatch uses the actual object implementation.
        sc.close();
    }
}

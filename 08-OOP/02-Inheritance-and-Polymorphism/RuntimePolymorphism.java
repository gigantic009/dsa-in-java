// A subclass overrides a method; the runtime object selects the implementation.
class Animal {public void sound(){System.out.println("Sound");}}
class Dog extends Animal { @Override public void sound(){System.out.println("Bark");} }
public class RuntimePolymorphism {public static void main(String[]args){Animal a=new Dog();a.sound();}}

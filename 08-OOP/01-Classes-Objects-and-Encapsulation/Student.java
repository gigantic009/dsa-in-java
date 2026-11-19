// Demonstrates a class, object, constructor and encapsulated fields.
public class Student {
 private String name;private int roll;
 public Student(String name,int roll){this.name=name;this.roll=roll;}
 public String getName(){return name;}public int getRoll(){return roll;}
 public static void main(String[]args){Student s=new Student("Asha",7);System.out.println(s.getName()+" "+s.getRoll());}
}
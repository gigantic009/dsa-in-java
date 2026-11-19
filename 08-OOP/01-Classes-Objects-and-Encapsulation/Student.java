import java.util.Scanner;

/** Demonstrates a class, constructor, object and encapsulated fields. */
public class Student {
    private String name;
    private int roll;

    public Student(String name, int roll) {
        this.name = name; // this.name refers to the field belonging to this object.
        this.roll = roll;
    }

    // Getters provide access without making the fields public.
    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student name: ");
        String name = sc.nextLine();

        System.out.print("Roll number: ");
        int roll = sc.nextInt();

        Student student = new Student(name, roll);
        System.out.println("Name: " + student.getName());
        System.out.println("Roll: " + student.getRoll());
        sc.close();
    }
}
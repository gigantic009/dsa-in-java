import java.util.Scanner;

public class Student {
    private String name; // Keep student identity fields private for encapsulation.
    private int roll;

    public Student(String name, int roll) {
        this.name = name; // this.name refers to the object's field.
        this.roll = roll;
    }

    public String getName() {
        return name; // Expose read-only access to the name.
    }

    public int getRoll() {
        return roll; // Expose read-only access to the roll number.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student name: ");
        String name = sc.nextLine();
        System.out.print("Roll number: ");
        int roll = sc.nextInt();

        Student student = new Student(name, roll); // Build an object using its constructor.
        System.out.println("Name: " + student.getName());
        System.out.println("Roll: " + student.getRoll());
        sc.close();
    }
}

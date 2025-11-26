import java.util.*;

class Student {
    String name;
    int roll;
    String grade;

    Student(String name, int roll, String grade) {
        this.name = name;
        this.roll = roll;
        this.grade = grade;
    }

    public String toString() {
        return roll + " - " + name + " - " + grade;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("\n--- STUDENT MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Student\n2. Remove Student\n3. Display Students\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();
                    list.add(new Student(name, roll, grade));
                    System.out.println("Student Added!");
                }

                case 2 -> {
                    System.out.print("Enter Roll No to remove: ");
                    int roll = sc.nextInt();
                    list.removeIf(s -> s.roll == roll);
                    System.out.println("Student Removed!");
                }

                case 3 -> {
                    System.out.println("\n--- Student List ---");
                    list.forEach(System.out::println);
                }

                case 4 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }

                default -> System.out.println("Invalid Input!");
            }
        }
    }
}

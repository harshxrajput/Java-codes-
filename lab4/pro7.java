import java.util.Scanner;

class Student {
    int roll;
    String name;
    double fullMark;
    double securedMark;
    double cgpa;

    Student(int roll, String name, double fullMark, double securedMark) {
        this.roll = roll;
        this.name = name;
        this.fullMark = fullMark;
        this.securedMark = securedMark;
        cgpa();
    }
    void cgpa() {
        cgpa = (securedMark / fullMark) * 10.0;
    }
    void displayDetails() {
        System.out.println("Roll : " + roll);
        System.out.println("Name : " + name);
        System.out.println("Full Marks : " + fullMark);
        System.out.println("Secured Marks : " + securedMark);
        System.out.println("CGPA : " + cgpa);
    }
}
public class pro7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number:");
        int roll = scanner.nextInt();
        System.out.print("Enter Name:");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Enter Full Marks:");
        double fullMark = scanner.nextDouble();
        System.out.print("Enter Secured Marks:");
        double securedMark = scanner.nextDouble();
        System.out.println();
        Student student = new Student(roll, name, fullMark, securedMark);

        student.displayDetails();
    }
}
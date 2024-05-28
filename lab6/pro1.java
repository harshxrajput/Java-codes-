import java.util.Scanner;
public class pro1 {

    public static void main(String[] args) {
        Kiitian student = new Kiitian();
        student.getInput();
        student.printDetails();
    }
}

abstract class Student {
    int rollNo;
    long regNo;

    abstract void course();

    void getInput() {
        System.out.print("Enter roll number: ");
        rollNo = new Scanner(System.in).nextInt();
        System.out.print("Enter registration number: ");
        regNo = new Scanner(System.in).nextLong();
    }
}

class Kiitian extends Student {

    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    void printDetails() {
        System.out.println();
        System.out.println("Rollno - " + rollNo);
        System.out.println("Registration no - " + regNo);
        course();
    }
}

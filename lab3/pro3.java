import java.util.Scanner;

class Student {
    int roll, cgpa;
    String name;

    Student(int r, String n, int c) {
        roll = r;
        name = n;
        cgpa = c;
    }
}

class pro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll, name , cgpa: ");
            students[i] = new Student(sc.nextInt(), sc.next(), sc.nextInt());
        }
        
        int lowest = 0;
        for (int i = 1; i < n; i++)
            if (students[i].cgpa < students[lowest].cgpa) lowest = i;
        System.out.println(students[lowest].name + " has the lowest cgpa and his/her cgpa is :  " + students[lowest].cgpa);
    }
}
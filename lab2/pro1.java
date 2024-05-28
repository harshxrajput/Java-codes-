import java.util.*;

public class pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter branch : ");
        String branch = sc.nextLine();
        System.out.print("enter name : ");
        String name = sc.nextLine();
        System.out.print("enter roll : ");
        int roll = sc.nextInt();
        System.out.print("enter section : ");
        int sec = sc.nextInt();
        
        System.out.println();
        System.out.println("name : " + name);
        System.out.println("roll : " + roll);
        System.out.println("sec: " + sec);
        System.out.println("branch : " + branch);
    }
}

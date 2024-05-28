import java.util.Scanner;
 
interface Employee {
    String getDetails();
}
 
interface Manager extends Employee {
    String getDeptDetails();
}
 
class Head implements Manager {
 
    private int empId;
    private String ename;
    private int deptId;
    private String deptName;
 
    public Head(int empId, String ename, int deptId, String deptName) {
        this.empId = empId;
        this.ename = ename;
        this.deptId = deptId;
        this.deptName = deptName;
    }
 
    public String getDetails() {
        return "Employee ID: " + empId + "\nEmployee Name: " + ename;
    }
 
    public String getDeptDetails() {
        return "Department ID: " + deptId + "\nDepartment Name: " + deptName;
    }
 
    public void printAllDetails() {
        System.out.println(getDetails());
        System.out.println(getDeptDetails());
    }
}
 
public class pro4 {
    public static void main(String[] args) {
        int empId, deptId;
        String ename, deptName;
 
        System.out.print("Enter employee id: ");
        empId = new Scanner(System.in).nextInt();
 
        System.out.print("Enter employee name: ");
        ename = new Scanner(System.in).nextLine();
 
        System.out.print("Enter department id: ");
        deptId = new Scanner(System.in).nextInt();
 
        System.out.print("Enter department name: ");
        deptName = new Scanner(System.in).nextLine();
 
        Head head = new Head(empId, ename, deptId, deptName);
        System.out.println();
        head.printAllDetails();
    }
}

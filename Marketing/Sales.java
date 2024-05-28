package Marketing;

import General.Employee;

public class Sales extends Employee {
    private double basic;

    public Sales(int empid, String ename, double basic) {
        super(empid, ename);
        this.basic = basic;
    }

    public double allowance() {
        return 0.05 * earnings(basic);
    }

    public void printDetails() {
        System.out.println("The emp id of the employee is " + empid);
        System.out.printf("The total earning is %.2f\n", earnings(basic) + allowance());
    }

    public static void main(String[] args) {
        Sales salesPerson = new Sales(123, "Amit", 1000);
        salesPerson.printDetails();
    }
}

package General;

public class Employee {
    protected int empid;
    private String ename;

    public Employee(int empid, String ename) {
        this.empid = empid;
        this.ename = ename;
    }

    public double earnings(double basic) {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }
}

interface Employee {
    double earnings();
    double deductions();
    
}
class Manager implements Employee {
    double basicSalary;

    public Manager(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double earnings() {
        double da = basicSalary * 0.8;
        double hra = basicSalary * 0.15;
        return basicSalary + da + hra;
    }

    public double deductions() {
        return basicSalary * 0.12; 
    }
}

class Substaff extends Manager {

    public Substaff(double basicSalary) {
        super(basicSalary);
    }
    public double bonus() {
        return basicSalary * 0.5;     
    }
}

public class pro3 {
    public static void main(String[] args) {
        double basicSalary = 50000;
        Substaff substaff = new Substaff(basicSalary);

        System.out.println("Earnings - " + substaff.earnings());
        System.out.println("Deduction - " + substaff.deductions());
        System.out.println("Bonus - " + substaff.bonus());
    }
}

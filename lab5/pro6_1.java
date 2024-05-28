import java.util.Scanner;

class Commission {
    double sales;

    Commission(double sales) {
        this.sales = sales;
    }

    double commission() {
        if (sales < 0) {
            return -1;
        } else if (sales >= 0 && sales <= 1000) {
            return sales * 0.05;
        } else if (sales > 1000 && sales <= 5000) {
            return sales * 0.10;
        } else {
            return sales * 0.15;
        }
    }
}

public class pro6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sales: ");
        double sales = sc.nextDouble();
        Commission c = new Commission(sales);
        double commission = c.commission();
        if (commission == -1) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Commission: " + commission);
        }
    }
}
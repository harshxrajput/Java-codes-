public class pro1 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("enter 3 no ");
            return;
        }

        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double num3 = Double.parseDouble(args[2]);

        double largest = Math.max(num1, Math.max(num2, num3));

        System.out.println("largest i s: " + largest);
    }
}

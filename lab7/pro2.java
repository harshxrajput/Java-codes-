public class pro2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        try {
            int result = a/b;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println(e);
        }
         finally {
            System.out.println("This block always executes");
        }
    }
}

public class pro1 {

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3,4};

        try {
            int outOfBoundsElement = numbers[4];
            System.out.println(outOfBoundsElement);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println(e);
        }
    }
}

public class pro6 {
    public static void main(String[] args) {
        String str = "racecar";
        StringBuilder reversed = new StringBuilder(str).reverse();
        boolean isPalindrome = str.equals(reversed.toString());
        System.out.println(isPalindrome);
    }
}

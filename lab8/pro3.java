public class pro3 {
    public static void main(String[] args) {
        String input = "teststring";
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (input.indexOf(c) == input.lastIndexOf(c)) {
                System.out.println("First non-repeated character: " + c);
                break;
            }
        }
    }
}

public class pro4 {
    public static void main(String[] args) {
        String str = "12345";
        System.out.println(str.matches("\\d+"));

        boolean containsOnlyDigits = str.chars().allMatch(Character::isDigit);
        System.out.println(containsOnlyDigits);

    }
}
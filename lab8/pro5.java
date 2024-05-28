public class pro5 {
    public static void main(String[] args) {
        String input = "Hello World";
        char charToRemove = 'l';
        String output = input.replaceAll(String.valueOf(charToRemove), "");
        System.out.println(output);
    }
}

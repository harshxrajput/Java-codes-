import java.util.HashSet;
import java.util.Set;

public class pro8 {
    public static void main(String[] args) {
        String input = "helloo";
        Set<Character> duplicates = new HashSet<>();
        Set<Character> set = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (!set.add(c)) {
                duplicates.add(c);
            }
        }
        System.out.println("Duplicate characters: " + duplicates);

    }
}

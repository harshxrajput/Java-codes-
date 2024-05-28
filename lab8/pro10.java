public class pro10 {
    public static void main(String[] args) {
        String str = "banana";
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        String reversed = new String(chars);
        System.out.println(reversed);

    }
}

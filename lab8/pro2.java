public class pro2{
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("a: " + a); 
        System.out.println("b: " + b); 
        
    }
}
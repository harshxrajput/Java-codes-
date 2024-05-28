import java.util.*;

public class pro7 {
    public static void main(String[] args) {
        int even=0;
        int odd=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            int n=sc.nextInt();
            if(n%2==0)
            even++;
            else
            odd++;
        }
        System.out.println("no of even : "+ even);
        System.out.println("no of odd : "+ odd);
    }
}

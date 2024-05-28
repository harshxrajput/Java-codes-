public class pro3{
    public static void main(String[]args){
        int n = 6;
        boolean isPrime = true;
        for(int i = 2 ;i < n ; i++ ){
            if(n % i==0){
                isPrime = false;
                break;
            }
        }
                if(isPrime){
                    System.out.println("Prime");
                    }else{
                        System.out.println("Not Prime");
                    }
    }
}
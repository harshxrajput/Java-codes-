public class pro3{
    void ProcessInput(int a){
        try{
        if (a<0){
            throw new ArithmeticException("number must be positive");
        }
        else{
            System.out.println("double value:" + a*2);
        }
    }
    catch(ArithmeticException e){
        System.out.println(e);
    
    }
}
    public static void main(String[] args) {
        pro3 p = new pro3();
        p.ProcessInput(-2);
        //System.out.println("rest of the code ");
    }
}
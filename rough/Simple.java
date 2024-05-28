class A extends Thread {
    public void run(){
        String n=currentThread().getName();
        for(int i=0;i<=4;i++){
            System.out.println(n);
        }
        
    }
}

public class Simple {

    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();

        t1.setName("first");
        t2.setName("second");

        t1.start();
        t2.start();
    }
}
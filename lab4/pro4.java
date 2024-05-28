class pro4{
    public int subtract(int a, int b){
        return a - b;
    }

    public int subtract(int a, int b, int c){
        return a - b - c;
    }

    public double subtract(double a, double b){
        return a - b;
    }

    public double subtract(double a, double b, double c){
        return a - b - c;
    }
}
class driver{
    public static void main(String[] args) {
     pro4 s = new pro4();
        System.out.println("10 - 5 = " + s.subtract(10, 5));
        System.out.println("10 - 5 - 2 = " + s.subtract(10, 5, 2));
        System.out.println("11.7 - 5.6 = " + s.subtract(11.7, 5.6));
        System.out.println("10.2 - 1.1 - 3.6 = " + s.subtract(10.2, 1.1, 3.6));
    }
}



/* 

//  simple rectangle 

public class patterns {
    
    public static void main(String[] args) {
        
        for (int i=1;i<=4;i++){
            for (int j=1;j<=5;j++){
                System.out.print("  *");
            }
            System.out.println(");
        }
    }
}


// hollow rectangle

public class patterns {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 4 || j == 5) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

// half pyramid

public class patterns {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}


// inverted half pyramid

public class patterns {

    public static void main(String[] args) {

        for (int i = 4; i >=1; i--) {
            for (int j = i; j >=1; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}


//    *
    * *
  * * *
* * * *

public class patterns {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for(int k=4-i;k>=0;k--){
                    System.out.print("  ");
                }
            for (int j = 1; j <= i; j++) {
                
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}


1
12
123
1234

public class patterns {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}



1
23
456
78910
1112131415

public class patterns {
    

    public static void main(String[] args) {
        int number = 1;

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
*/


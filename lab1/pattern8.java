public class pattern8{

    public static void main(String[] args)
    {
        for(int i=0;i<5;i++)
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=5-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2;i<6;i++)
        {
            for(int k=4;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
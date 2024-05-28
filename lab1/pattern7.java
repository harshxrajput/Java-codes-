public class pattern7
{
  public static void main(String args[])
  {
    int rows, i, j, k;
    rows = 4;

    for (i = 1; i < rows; i++)
    {
      for (j = 0; j < i; j++)
        System.out.print(" ");
 
      for (k = 0; k < i; k++)
        System.out.print("*");
 
      System.out.println();
    }
    for (i = 0; i < rows; i++)
    {
      for (j = 0; j < rows - i; j++)
        System.out.print(" ");
 
      for (k = 0; k < rows - i; k++)
        System.out.print("*");
 
      System.out.println();
    }
  }
}
import java.util.*;
public class Series2
{
  public static void main(String args[])
  {
    int i,j,k,row;
      Scanner sc=new Scanner(System.in);
    System.out.println("enter number of row");
   row=sc.nextInt();
    for(i=1;i<=row;i++)
      {
        for(j=1;j<=(row-i);j++)
          {
            System.out.print(" ");
          }
            for(k=1;k<=i;k++)
            {
              System.out.print("*");
            }
        System.out.println("");
      }
  }
}

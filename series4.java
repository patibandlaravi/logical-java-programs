import java.util.*;
public class series3
{
  public static void main(String args[])
  {
    int i,j,row;
      Scanner sc=new Scanner(System.in);
    System.out.println("enter number of row");
   row=sc.nextInt();
    for(i=row;i>=1;i--)
      {
        for(j=1;j<=i;j++)
          {
            System.out.print(row);
          }
        System.out.println("       ");
      }
  }
}
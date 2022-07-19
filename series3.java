import java.util.*;
public class series3
{
  public static void main(String args[])
  {
    int i,j,row;
      Scanner sc=new Scanner(System.in);
    System.out.println("enter number of row");
   i=sc.nextInt();
    for(row=1;row<=4;row++)
      {
        for(j=1;j<=4;j++)
          {
            System.out.print(row);
          }
        System.out.println("       ");
      }
  }
}

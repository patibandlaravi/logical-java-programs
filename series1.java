import java.util.*;
public class series1{
  public static void main(String args[])
  {
    int i,j,row;
      Scanner sc=new Scanner(System.in);
    System.out.println("enter number of row");
   i=sc.nextInt();
    for(row=1;row<=i;row++)
      {
        for(j=1;j<=row;j++)
          {
            System.out.print(j);
          }
        System.out.println("       ");
      }
  }
}

import java.util.*;
public class Sumdigit
  {
    public static void main(String args[])
    {
      int i,sum=0,d;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any number");
      int n=sc.nextInt();
      while(n>0)
        {
          d=n%10;
          System.out.println(d);
          sum=sum+d;
          n=n/10;
        }
      System.out.println(sum);
      
    }
  }
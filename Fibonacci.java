import java.util.*;
public class Fibonacci
  {
    public static void main(String args[])
    {
    int n,a=0,b=1;
    Scanner sc=new Scanner(System.in);
      System.out.println("enter any n number");
      n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          System.out.println(a+"");
          int c=a+b;
          a=b;
          b=c;
        }
          
      } 
  }
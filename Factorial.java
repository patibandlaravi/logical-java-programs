import java.util.*;
public class Factorial
  {
    public static void main(String args[])
    {
    int n,i;
      long fact=1;
    Scanner sc=new Scanner(System.in);
      System.out.println("enter any number");
      n=sc.nextInt();
      for(i=1;i<=n;i++){
        fact=fact*i;
      }
      System.out.println(fact);
    }
  }
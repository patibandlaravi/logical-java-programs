import java.util.*;
public class Productdigit
  {
    public static void main(String args[])
    {
      int i,product=1,d;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any number");
      int n=sc.nextInt();
    while(n>0)
        {
          d=n%10;
          System.out.println(d);
          product=product*d;
          n=n/10;
        }
      System.out.println(product);
      
    }
  }
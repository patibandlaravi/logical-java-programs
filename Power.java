import java.util.*;
public class Power
  {
    public static void main(String args[])
    {
      int base,exponent,power=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter base");
     base=sc.nextInt();
    System.out.println("enter exponent");
      exponent=sc.nextInt();
      for(int i=1;i<=exponent;i++)
        {
          power=power*base;
        }
      System.out.println(power);
    }
  }
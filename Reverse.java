import java.util.*;
public class Reverse
  {
    public static void main(String args[])
    {
    int i,rev=0,d;
    Scanner sc=new Scanner(System.in);
      System.out.println("enter any number");
    int  n=sc.nextInt();
      while(n>0)
        {
          d=n%10;
          rev=(rev*10)+d;
          n=n/10;
        }
      System.out.println(rev);
    }
  }
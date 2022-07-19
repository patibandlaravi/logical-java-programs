import java.util.*;
public class Palindrome
  {
    public static void main(String args[])
    {
    int i,rev=0,d;
    Scanner sc=new Scanner(System.in);
      System.out.println("enter any number");
    int  n=sc.nextInt();
      int t=n;
      while(n>0)
        {
          d=n%10;
          rev=(rev*10)+d;
          n=n/10;
        }
      if(t==rev)
      
        System.out.println("palindrome number");
      
      else
       System.out.println("is not palindrome");
    }
  }
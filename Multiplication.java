import java.util.*;
public class Multiplication
  {
    public static void main(String args[])
    {
    int n,i;
    Scanner sc=new Scanner(System.in);
      System.out.println("enter any number");
      n=sc.nextInt();
      for(i=1;i<=10;i++){
        System.out.println(n+"*"+i+"="+n*i);
      }
    }
  }
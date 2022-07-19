 
   import java.util.*;
class FindFlDigit{
  public static void main(String args[]){
    int n,firstdigit=0,lastdigit=0,sum=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter any number");
    n=s.nextInt();
        lastdigit = n%10;
        System.out.println("Last digit: "+lastdigit);
 
        while(n!=0) {
            firstdigit = n%10;
            n=n/10;
        }
        System.out.println("First digit: "+firstdigit);
        sum=firstdigit+lastdigit;
       System.out.println( sum);
    }
   
} 
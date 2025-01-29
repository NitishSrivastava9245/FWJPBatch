//Wap to check whether a number is negative or positive or zero.
import java.util.Scanner;


public class Q5 {
  public static void main(String arg[])
  {

    Scanner sc =new Scanner(System.in);

    System.out.print("enter a number : ");
    
     double n=sc.nextDouble();
    String result= n<0 ? "negative" : (n==0? "zero":"positive");

    System.out.print(n+" is "+result);
    
  }
}

//Wap to check whether a number is even or odd.
import java.util.Scanner;


public class Q8 {
  public static void main(String arg[])
  {

    Scanner sc =new Scanner(System.in);

    System.out.print("enter number : ");
    
     int n=sc.nextInt();

     
    String result= n%2==0 ? "even" : "odd";

    System.out.print(n+"  is " +result);
    
  }
}

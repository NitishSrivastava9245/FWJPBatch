//Q4. Wap to check whether  a character is in lower case or upper case.
import java.util.Scanner;


public class Q4 {
  public static void main(String arg[])
  {

    Scanner sc =new Scanner(System.in);

    char ch=sc.next().charAt(0);

    String result=ch>='a'&&ch<='z' ? "lower case" :"upper case";

    System.out.print(ch+" is in "+result);
    
  }
}
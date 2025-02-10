package pack1;
import java.util.Scanner;
public class Q4
{
  public static void main( String srg[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base : ");
    int base=sc.nextInt();
    System.out.println("Enter the power : ");
    int power=sc.nextInt();
    int result=1;
    do
    {
       result=base*result;
       power--;
    }while(power>0);

  System.out.println(result);
  }
}

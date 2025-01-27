import java.util.*;

class TernaryDemo
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter two value : ");

  int a=sc.nextInt();
  int b=sc.nextInt();
  System.out.println(a>b ? "A is greater than B" : "B is greater than A");

  int result= a>b ? a-b: b-a;
  System.out.println("Result : "+result);
}
}
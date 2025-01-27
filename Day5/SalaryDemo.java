// write a program to check the experience of an employee , if experience is greater than 20 year then calculate bonus= 20% of salary, else calculate bonus=10 % of salary.

import java.util.*;
class SalaryDemo
{
  public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);
  System.out.print("Enter your salary   :" );
   int sal=sc.nextInt();
   System.out.print("Enter your experience   :" );
  
  int exp=sc.nextInt();
  int bonus= exp>20 ? (sal+=sal*20/100):(sal+=sal*10/100);
   System.out.println("New salary is : "+sal);

}
}
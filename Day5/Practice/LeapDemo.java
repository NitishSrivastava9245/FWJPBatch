// write a program to check whether an year is leap year or not

import java.util.*;
class LeapDemo
{
  public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter a year  :" );
  int year=sc.nextInt();
  Boolean Year= (year%4==0 && year%100!=0) || year%400==0;
  System.out.println(year+" is leap year :"+Year);
 System.out.println(year+" is not leap year :"+!Year);
}
}
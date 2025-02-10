package pack1;

import java.util.Scanner;

public class Q7
{
	
  public static void main( String srg[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n=sc.nextInt();
    int result=0;
    int temp=n;
    do{
        int rem=temp%10;
        result=result+(rem*rem*rem); 
        temp=temp/10;
    }while(temp>0);
   if(result==n) 
    System.out.println("yes  "+ n +" is armstrong number ");
   else
   System.out.println("no  "+ n +" is   not armstrong number ");
}
}
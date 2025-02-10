package pack1;



import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number :- ");
       int n=sc.nextInt();
       int  reverse = 0;  
       while(n != 0)   
       {  
       int r = n % 10;  
       reverse = reverse * 10 + r;  
       n = n/10;  
       }  
       System.out.println("The reverse of the digit of number  is: " + reverse);  
	}

}

package PACK1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int n=sc.nextInt();
		if(n==0)
		{
			System.out.println("given number is zero");
		}
		else if(n%2==0)
		{
			System.out.println("Given number is even");
		}
		else
		{
			System.out.println("The given number is odd");
		}

	}

}

package pack1;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
           Scanner sc=new Scanner(System.in);
           System.out.println("enter your number : ");
           int a=sc.nextInt();
           while (a != 0) {
        	      // a = a/10
        	      a /= 10;
        	      ++count;
        	    }

        	    System.out.println("Number of digits: " + count);
	}

}

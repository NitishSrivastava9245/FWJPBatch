package pack1;

import java.util.Scanner;

public class Q1ka1 {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
       System.out.println("Wirte your range upto :- ");
       int n=sc.nextInt();
       for(int i=1;i<=n;i++)
     	  if(i%2==0)
     	  System.out.print(i+" ");

}
}

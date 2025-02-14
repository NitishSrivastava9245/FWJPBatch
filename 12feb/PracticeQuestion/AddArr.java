package pack1;

import java.util.Scanner;

public class AddArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int sum=0;
         int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter element in array :");
        for(int i=0;i<a.length;i++)
        {
        	a[i]=sc.nextInt();
        }
        System.out.println("Array Element ");
        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]+" ");
        	sum+=a[i];
        }
        System.out.print("\nAddition of array element is :"+sum);

	}

}

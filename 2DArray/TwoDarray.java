package pack1;

import java.util.Scanner;

public class TwoDarray {
     public static void main(String[] args) {
		int a[][]=new int[3][3];
		int b[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		Scanner sc=new Scanner(System.in);
		//input value in array
		
		for(int r=0;r<a.length;r++)//a.length=no. of rows,r=0 r<3
		{
			for(int c=0;c<a[r].length;c++)     //a[r=0].length=no. of columns
			{
				System.out.println("Enter value at ["+r+"]["+c+"]: ");
				a[r][c]=sc.nextInt();
			}
		}
		System.out.println("First array is :-----");
		//displaying values from array
		for(int r=0;r<a.length;r++)//a.length=no. of rows,r=0 r<3
		{
			for(int c=0;c<a[r].length;c++)//a[r=0].length=no. of columns
			{
				System.out.print(a[r][c]+"\t ");
				
			}
			System.out.println();
		}
		
		System.out.println("2nd array is :-------");
		
		

		for(int r=0;r<b.length;r++)//a.length=no. of rows,r=0 r<3
		{
			for(int c=0;c<b[r].length;c++)//a[r=0].length=no. of columns
			{
				System.out.print(b[r][c]+"\t ");
				
			}
			System.out.println();
		}
		
		
		
	}
}

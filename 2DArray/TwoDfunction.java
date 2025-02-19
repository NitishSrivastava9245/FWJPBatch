package pack1;

import java.util.Scanner;

public class TwoDfunction {
	
	public int [][] createArray(int row,int col)
	{
		int[][] x=new int[row][col];
		Scanner sc=new Scanner(System.in);
		for(int r=0;r<x.length;r++)
		{
			for(int c=0;c<x[r].length;c++)     
			{
				System.out.println("Enter value at ["+r+"]["+c+"]: ");
				x[r][c]=sc.nextInt();
			}
		}
		return x;
	}
	public void display(int x[][])
	{
		System.out.println("Array elements are:-  ");
		for(int r=0;r<x.length;r++)
		{
			for(int c=0;c<x[r].length;c++)
			{
				System.out.print(x[r][c]+"\t ");
				
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	TwoDfunction td=new TwoDfunction();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of rows and columns for array:- ");
	int a[][]=td.createArray(sc.nextInt(), sc.nextInt());
	
	System.out.println("Enter number of rows and columns for array:- ");
	int b[][]=td.createArray(sc.nextInt(), sc.nextInt());
	System.out.println("First array is:-  ");
	td.display(a);
	
	System.out.println("Second array is :-");
	td.display(b);
	
	
}
}

package pack1;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int count;
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the number of elements :");
	      int s=sc.nextInt();//for size
	      int a[]=new int[s];
	      System.out.println("Enter array element :");
	      for(int i=0;i<s;i++)
	      {
	    	  a[i]=sc.nextInt();
	      }
	      System.out.println("Array elements :");
	      for(int i=0;i<s;i++)
	      {
	    	  System.out.print(a[i]+" ");;
	      }
	      //searching or traversing portion
	      System.out.println("\nEnter search elements ");
	      int n=sc.nextInt();
	   boolean found=false;
	      for(int i=0;i<s;i++)
	      {
	    	  if(a[i]==n)
	    	  {
	    		  System.out.println("Element found ");
	    		  found=true;
	    	  }
	    	 
	      }
	      if(!found) {
    		  System.out.println("Searching element not found in array .");
	      }
	}

}

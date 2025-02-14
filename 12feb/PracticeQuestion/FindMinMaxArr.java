package pack1;

import java.util.Scanner;

public class FindMinMaxArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of elements :");
      int s=sc.nextInt();
      int a[]=new int[s];
      System.out.println("Enter array element :");
      for(int i=0;i<s;i++)
      {
    	  a[i]=sc.nextInt();
      }
      
      int min=a[0];// assume first element is minimum
      int max=a[0];// assume first element is maximum
      
//      if(a.length==0)
//      {
//    	  System.out.println("Array is empty . Cannot find min/max .");
//      }
      for(int i=1;i<s;i++)
      {
    	  if(a[i]<min)
    	  {
    		  min=a[i];
    	  }
    	  if(a[i]>max)
    	  {
    		  max=a[i];
    	  }
      }
      System.out.println("Smallest element is :"+min);
      System.out.println("Largest element is : "+max);
	}

}

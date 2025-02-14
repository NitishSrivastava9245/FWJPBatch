package pack1;

public class ArrTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		for(int i=0;i<10;i++)
		{
			a[i]=2*(i+1);
		}
		System.out.println("table of 2 is ; ");
		for(int i=0;i<10;i++)
		{
			System.out.println("2 X "+(i+1) + " = "+a[i]);
		}

	}

}

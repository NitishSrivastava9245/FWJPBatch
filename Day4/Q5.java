//Write a program to assign a value of 100.235 to a double variable and then convert it to int.

class Q5{
	public static void main(String args[]){
		double d = 100.235;	

		int s1 =(int) d;
		long l =(long) d;       // we can't convert big into small value or equal to equal (double(8-bit) to long(8-bit))  directly or implicitly 
					//we can convert explicitely
				  

		System.out.println(" value are: " + s1);    // 
		System.out.println(" value are: " + l);   // 125.44
	}
}
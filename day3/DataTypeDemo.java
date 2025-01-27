class DataTypeDemo
{
	public static void main(String args[])
	{
/*

		//by default, compiler all integer value consider as int

		//byte mostly used for age related places  -128 to 127
		byte b= 23;
		byte b1=127;
		System.out.println("b : "+b);
		System.out.println("b1 : "+b1);
		System.out.println("Welcome to Java");
		System.out.println(b+" is the value of type byte");

		//byte mostly used for age related places− 32,768 to 32,767
		short s=32000;
		System.out.println("Short value : "+s);


		int i =2000000000;
		// int ii = 3000000000;  //error because number too large (out of range of integer) so it is initialized with long datatype

		System.out.println("int value : "+i);

		//why need to write 'L' when we already declare it is long
		long l=93838348833L;
		System.out.println("long value : "+l);
*/

		float f = 12.1234567890f;
		float f1 = 0.1234567890f;
		//float f2 = 12.1234567890;
		float f3 = 1.23f;

		System.out.println("float value : "+f);
		System.out.println("float value : "+f1);
//System.out.println("float value : "+f2);  //it is in double range so we can't change into float, if you want to use as float the write 'f' after value
		System.out.println("float value : "+f3);  //error


		double d = 12.12345678901234567890;
		System.out.println("Double value : " +d);

/*
		char ch = 'd';
		char ch1 = 'आ';

		System.out.println("char value : "+ch);
		System.out.println("char value : "+ch1);
		
		System.out.println("Unicode value of ch : "+(int)ch);
		System.out.println("Unicode value of ch1 : "+(int)ch1);

		boolean b2= true;
		System.out.println("b2 : "+b2);


		String s2="Hello world";  // string literal
		System.out.println("s2 : "+s2);

		String s1= new String("hello");  // string object
		System.out.println("s1 : "+s1);  */

	}	
}
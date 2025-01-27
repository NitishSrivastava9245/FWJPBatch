//Write a program to add 32 to the ASCII value of a character and print the equivalent character.   


import java.util.Scanner;
class Q4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any character");
		char ch = sc.next().charAt(0);  // 'a'
  
		int asValue = (int)(ch);  // 65
		char nextChar = (char)(asValue + 32);   // 65 + 32 = 97 ascii of 'A' 
		System.out.println("ascii value are " +  ch + "is: " + asValue);
		System.out.println("next char is: " + nextChar);
	}
}
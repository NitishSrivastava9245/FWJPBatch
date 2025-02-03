//Q3. wap to check whether a character is in lower case or upper case?

package PACK1;

import java.util.Scanner;

public class UpperLower {
	public static void main(String[] args) {
		
	
	 Scanner scanner = new Scanner(System.in);
     
     // Prompt user for input
     System.out.print("Enter a character : ");
     char ch = scanner.next().charAt(0);
     
     // Check character case using if-else
     if (ch >= 'A' && ch <= 'Z') {
         System.out.println(ch + " is an uppercase letter.");
     } else if (ch >= 'a' && ch <= 'z') {
         System.out.println(ch + " is a lowercase letter.");
     } else {
         System.out.println(ch + " is not an alphabetic character.");
     }

}
}

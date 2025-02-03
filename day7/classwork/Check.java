//Q2. wap to check whether a character is alphabet, number or a special character.
package PACK1;

import java.util.*;
public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        
		        
		        System.out.print("Enter a character: ");
		        char ch = scanner.next().charAt(0);
		        
		        // Check character type using if-else
		        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
		            System.out.println(ch + " is an alphabet.");
		        } else if (ch >= '0' && ch <= '9') {
		            System.out.println(ch + " is a number.");
		        } else {
		            System.out.println(ch + " is a special character.");
		        }
		        
		        
		    }
		


	}



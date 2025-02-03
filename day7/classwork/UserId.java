package PACK1;

import java.util.Scanner;

public class UserId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String validUserId = "Nitish";
        String validPassword = "Nitish123";
        
        
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        
        // Check user ID and password using if-else
        if (userId.equals(validUserId) && password.equals(validPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid User ID or Password.");
        }
        
        
    }
}

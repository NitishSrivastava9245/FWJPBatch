//Check whether the character is alphabet or not
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any char");
		char ch = sc.next().charAt(0);

        //An alphabate is a lower or upper letter

        String str = ((ch >=97 && ch <=122 ) || (ch >= 65 && ch <= 90)) ? ("Alphabate") : ("Not Alphabate") ;

		System.out.println("the char is in:  " + str );
    }
}
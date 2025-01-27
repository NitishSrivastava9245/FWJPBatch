//write a program to find the percentage of marks. Input marks and total marks.

import java.util.Scanner;
class Q6 {
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

	System.out.println("enter total marks ");
	int totalMarks = sc.nextInt();

	System.out.println("enter obtained marks");
	int obtainedMarks = sc.nextInt();        

       	float per = ((float)obtainedMarks * 100) / totalMarks;

        System.out.println("percentage: " + per + "%");
    }
}  
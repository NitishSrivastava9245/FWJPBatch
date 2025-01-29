//write a program to check if a person is eligible to vote or not.
import java.util.*;

class Voter
{
  public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
System.out.print("Enter your age : ");
int age=sc.nextInt();
Boolean Valid= (age==18  || age>18);
System.out.println(age+" is an valid voter :"+Valid);
System.out.println(age+" is not an valid voter :"+!Valid);

}
}


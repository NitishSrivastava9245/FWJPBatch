package pack1;

import java.util.Scanner;
public class Q11
{
  public static void main( String srg[])
  {
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter your password : ");
     String pwd=sc.nextLine();
       int cap=0,sml=0,spl=0;
      for(int i=0;i<pwd.length();i++)
      {  char c=pwd.charAt(i);
         if(c>='a'&&c<='z')
         {
           sml++;
         }
         else{ 
          if(c>='A'&&c<='Z')
          {
            cap++;
          }
          else{
            if(c< '0' || c>'9')
            {
              spl++;
            }
          }
         }
      }

      if(sml>=1&&cap>=1&&spl>=1)
      {
        System.out.println("Strong password");

      }
      else
      System.out.println("week password");



}
}

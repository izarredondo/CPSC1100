import java.util.Scanner;
public class Lexicographic
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter three Strings: ");
        String s1 = scan.next().toLowerCase();
        String s2 = scan.next().toLowerCase();
        String s3 = scan.next().toLowerCase();

        if(s1.compareTo(s2) > 0)
        {
            

            if(s1.compareTo(s3) < 0)
            { 
                System.out.println("The middle value is: " + s1);
            }

        }
        else  if(s1.compareTo(s3) > 0)
        {
           
            if(s1.compareTo(s2) < 0)
            {
                System.out.println("The middle value is: " + s1);
            }
        }
        
        if(s2.compareTo(s1) > 0)
        {
            

            if(s2.compareTo(s3) < 0)
            { 
                System.out.println("The middle value is: " + s2);
            }

        }
        else  if(s2.compareTo(s3) > 0)
        {
           
            if(s2.compareTo(s1) < 0)
            {
                System.out.println("The middle value is: " + s2);
            }
        }
        
        if(s3.compareTo(s2) > 0)
        {
            

            if(s3.compareTo(s1) < 0)
            { 
                System.out.println("The middle value is: " + s3);
            }

        }
        else  if(s3.compareTo(s1) > 0)
        {
           
            if(s3.compareTo(s2) < 0)
            {
                System.out.println("The middle value is: " + s3);
            }
        }
    }
}
import java.util.*;
public class SmallestInt
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a value for w:");
        int w = scan.nextInt();
        int smallest = w;   //w is smallest so far
        
        System.out.println("Enter a value for x:");
        int x = scan.nextInt();
        if (x < smallest)   //Update smallest if necessary 
        {
            smallest = x;
        }
        
        System.out.println("Enter a value for y:");
        int y = scan.nextInt();
        if (y < smallest) 
        { 
            smallest = y;   // Update smallest if necessary
        }
        
        System.out.println("Enter a value for z:");
        int z = scan.nextInt(); 
        if (z < smallest) 
        {
            smallest = z;   // Update smallest if necessary
        }   
        
        
        
        System.out.println("The smallest value was " + smallest);
    }
}

/**
 * My version of code would have been much more difficult to add a fourth variable, because 
 * I would have had to create more tedious boundaries. Writing the code this way allows the smallest 
 * variable to be constantly updated; therefore, easier to understand and more efficient to write. 
 * 
 */
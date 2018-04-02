//Part Six

import java.util.Scanner;

public class GCD
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int x = in.nextInt();
        System.out.println("x = " + x);
        System.out.println("Enter the second integer: ");
        int y = in.nextInt();
        System.out.println("y = " + y);
        // Your gcd computation code goes here

        while(x != 0 && y != 0)
        {
            if(x > y)
            {
                x = x - y;
            }
            
            else
            {
                y = y - x;
            }
            
        }
        if(x == 0)
        {
            System.out.println("The Greatest Common Divisor is " + y);
        }
        else
        {
            System.out.println("The Greatest Common Divisor is " + x);
        }
    }
}
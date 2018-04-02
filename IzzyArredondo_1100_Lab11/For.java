//Part One

import java.util.Scanner;

public class For
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int even=0;
        int odd=0;

        for(int x=0; x<5; x++)
        {

            System.out.println("Enter an integer:");
            int num = input.nextInt();
            System.out.print(num);

            if(num % 2 == 0)
            {
                System.out.println(" is even");
                even++;

            }
            else
            {
                System.out.println(" is odd");
                odd++;
            }

            
        }

        System.out.println("Done.");
        System.out.println("You entered "+ even + " even number(s) and " + odd + " odd number(s).");

    }
}

import java.util.Scanner;

public class User
{
    public static void main(String[] args)
    {
        double sum = 0;
        double num; 
        int count = 0;
      
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your values. Enter 'q' for total:");

        while(input.hasNextDouble())
        {
            num = input.nextDouble();
            sum = sum + num;
            
            count++;
        }
        
        System.out.println("Your grand total is: " + sum);
        System.out.println("Your number of entries is: " + count);
        
    }
}

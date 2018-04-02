
import java.util.Scanner;

public class Min
{
    public static void main(String[]args)
    
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two integers:");
        int number = input.nextInt();
        int number2 = input.nextInt();
        
        System.out.println("Your minimum:");
        int smallest = Math.min(number, number2);
        System.out.println(smallest);
    }
}

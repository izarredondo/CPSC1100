//Part Five
import java.util.Random;
import java.util.Scanner;


public class Dice
{
    public static void main(String[] args)
    {
        Random dice = new Random();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of rolls:");
        int num = input.nextInt();
        
        System.out.println("Simulated Rolls:");
        for(int i = 1; i <= num; i++)
        {
            System.out.println(dice.nextInt(5) + 1);
            
        }
        
        
    }
}

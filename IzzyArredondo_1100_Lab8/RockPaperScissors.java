import java.util.Scanner;
public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: Choose rock, scissors, or paper:");
        String player1 = scan.next().toLowerCase();
        System.out.println("Player 2: Choose rock, scissors, or paper:");
        String player2 = scan.next().toLowerCase();
        //(your code goes here...)
        String r = "rock";
        String s = "scissors";
        String p = "paper";
        
        if(player1.equals(player2))
        {
            System.out.println("It's a tie!");
        }
        else if(player1.equals(r))
        {
            if(player2.equals(s))
            {
                System.out.println("Player 1 wins!");
            }
            else if(player2.equals(p))
            {
                System.out.println("Player 1 wins!");
            }
            
        }
        else if(player1.equals(s))
        {
            if(player2.equals(r))
            {
                System.out.println("Player 2 wins!");
            }
            else if(player2.equals(p))
            {
                System.out.println("Player 1 wins!");
            }
        }
        else if(player1.equals(p))
        {
            if(player2.equals(s))
            {
                System.out.println("Player 2 wins!");
            }
            else if(player2.equals(r))
            {
                System.out.println("Player 2 wins!");
            }
            
        }
        else
        {
            System.out.println("ERROR");
        }
        }
             
    }

import java.util.Scanner;
public class Planets
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a planet number from the sun: ");
        int planet = scan.nextInt();
        // Your code goes here ...

        

        if(planet == 1)
        {
            System.out.println("Mercury");
        }
        else if(planet == 2)
        { 
            System.out.println("Venus");
        }
        else if(planet == 3)
        {
            System.out.println("Earth");
        }
        else if(planet == 4)
        {
            System.out.println("Mars");
        }
        else if(planet == 5)
        {
            System.out.println("Jupiter");
        }
        else if(planet == 6)
        {
            System.out.println("Saturn");
        }
        else if(planet == 7)
        {
            System.out.println("Uranus");
        }
        else if(planet == 8)
        {
            System.out.println("Neptune");
        }
        else 
        {
            System.out.println("ERROR: Insert valid planet number 1-8");
        }

      
    }
}

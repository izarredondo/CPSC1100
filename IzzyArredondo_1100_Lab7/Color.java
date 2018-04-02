

public class Color
{
    public static void main(String[] args)
    {
        int x = 5;
        
        String color = "red";
        if (x >= 10)
        {
            color = "blue";
        }
        System.out.println(color);
    }
}

/**
 * Previously, the code automatically assigns the color "blue" to the variable. However, the "if" statement
 * makes it so if the variable "x" is smaller than 10, it is then reassigned the color "red". 
 * 
 * Changing the color variable to "red" and the statement to "blue" would assign the color "blue". If you 
 * change the condition to "x >= 10", the assignment would then return to "red". 
 * 
 */
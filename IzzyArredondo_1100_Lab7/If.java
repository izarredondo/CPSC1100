

public class If
{

    public static void main (String[] args){
        int n = 6;

        if (n > 10) 
        {
            System.out.print("*****");
        }
        if (n > 7) 
        {
            System.out.print("****");
        }
        if (n > 4) 
        {
            System.out.print("***");
        }
        if (n > 1) 
        {
            System.out.print("**");
        }
        System.out.println("*");
    }
}

/**
 * a) When n = 6, the code prints six "*". This is because n > 4, printing "***", n > 1, printing "**", 
 *    and finally the last line of code prints an additional "*".
 * 
 * b) n = 20 prints fifteen "*" because it satisfies each statement.
 * 
 * c) n = 2 prints three "*"
 * 
 * d) n = -1 prints one "*"
 */

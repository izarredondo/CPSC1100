/**
A simple program that prints a loop control variable.
 */
public class SimpleLoop
{
    public static void main(String[] args)
    {
        int i = 0;
        int limit = 6;
        while (i < limit)
        {
            System.out.println("i = " + i);
            i++;
        }
    }
}
/**1.1
 * 
 * The output is:
 * i = 0
 * i = 1
 * i = 2
 * i = 3
 * i = 4
 * i = 5
 * 
 * which is a sequence of i values from initial i (0) to limit (6).
 */

/**
A simple program that prints a loop control variable.
 */
public class SimpleLoop2
{
    public static void main(String[] args)
    {
        int i = 0;
        int limit = 6;
        while (i < limit)
        {
            System.out.println("i = " + i);
            i++;
        }
    }
}

/**1.2
 * 
 * Commenting out the increment line produces an infinite loop; no, the program will never stop looping.
 * 
 */
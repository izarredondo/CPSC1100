/**
A simple program that prints a loop control variable.
 */
public class SimpleLoopModify
{
    public static void main(String[] args)
    {
        int i = 6;
        int limit = 100;
        while (i < limit)
        {
            System.out.println("i = " + i);
            i++;
            i++;
        }
    }
}
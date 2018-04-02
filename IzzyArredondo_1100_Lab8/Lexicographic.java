
/**
 * Write a description of class Lexicographic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lexicographic
{
    public static void main(String[] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        String word3 = "aaa";

        if(word1.compareTo(word3) > 0)
        {
            System.out.println("Lexicographically greater");

        }

        if(word1.equals(word2))
        {
            System.out.println("Equal");
        }

        if(word2.compareTo(word1) > 0)
        {
            System.out.println("Lexicographically less");
        }

        if(word1.substring(0,2).equals(word2.substring(0,2)))
        {
            System.out.println("Same three-letter prefix");
        }
       
    }
}

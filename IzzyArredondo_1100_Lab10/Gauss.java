

public class Gauss
{
    public static void main(String[] args)
    {
       int start = 0;
       int limit = 100;
       int sum = 0;
       
       while (start <= limit)
       {
           int digit = start++;
           sum = sum + digit;
       }
       
       System.out.println(sum);
    }
}

import java.util.Scanner;

public class Calendar
{
    private int month;
    private int day;

    public static void main(String[] args)
    {
        Scanner date = new Scanner(System.in);
        System.out.println("Please enter month (integer): ");
        int month = date.nextInt();
        System.out.println("Please enter day of month (integer): ");
        int day = date.nextInt();

        //a) The date is in the second quarter of the year. (April to June)
        if(4 <= month && month <= 6)
        {
            System.out.println("The date is in the second quarter of the year.");
        }
        else
        {
            System.out.println("The date is NOT in the second quarter of the year.");
        }

        //b) The date is the last day of the month. (Assume February always has 28 days.)
        if(((month == 4 || month == 6 || month == 9 || month == 11) && day == 30)
        ||((month == 1 || month == 3 || month == 5 || month == 7 || month == 10 || month == 12) && day == 31)
        ||(month == 2 && day == 28))
        {
            System.out.println("The date is the last day of the month.");
        }
        else
        {
            System.out.println("The date is NOT the last day of the month.");
        }

        //c) The date is before April 15
        if(month <= 4 && day <= 15)
        {
            System.out.println("The date is before April 15.");
        }
        else
        {
            System.out.println("The date is NOT before April 15.");
        }
    }
}

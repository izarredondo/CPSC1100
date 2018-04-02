import java.util.*;


public class CustomerLister
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String[] customerName = {"Cathy", "Ben", "Jorge", "Wanda", "Freddie"};
        double[] customerBalance = new double[5];

        //2.1
        for(int i = 0; i < customerName.length; i++)
        {
            System.out.println(customerName[i]);
        }
        System.out.println();
        
        //2.2
        for(String n : customerName)
        {
            System.out.println(n);
        }
        System.out.println();
        
        //2.3
         for( int i = 0; i < customerName.length; i++)
        {
            System.out.println("Enter " + customerName[i] + "'s balance: ");
            double balance = in.nextDouble();
            System.out.println();
            customerBalance[i] = balance;
        }
        
        System.out.println();
        
        
        for( int i = 0; i < customerName.length; i++)
        {
            System.out.println(customerName[i] + "'s balance: " + customerBalance[i]);
        }
        
        System.out.println();
        
        

    }

}

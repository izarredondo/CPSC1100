import java.util.Scanner;

public class Annuity_User
{
    public static void main(String[]args)

    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Periodic Payment:");
        int PMT = input.nextInt();
        System.out.println("Please enter Periodic Interest Rate in Decimal Form:");
        double i = input.nextDouble();
        System.out.println("Please enter Number of Payments:");
        int n = input.nextInt();

       
        double PV = PMT * (((Math.pow(1 + i,n - 1) - 1) / i) / Math.pow(1 + i,n - 1) + 1);

        System.out.println(PV);
    }
}

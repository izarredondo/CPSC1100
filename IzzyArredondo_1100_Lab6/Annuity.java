public class Annuity
{
   public static void main(String[]args)
   
   {
   
    int PMT = 10000;
    double i = .08;
    int n = 20;
       
       
    double PV = PMT * (((Math.pow(1 + i,n - 1) - 1) / i) / Math.pow(1 + i,n - 1) + 1);
    
    System.out.println(PV);
    }
}
public class MilkJarCalculator
{
    public static void main(String[] args)
    {
        double milk = 5.5; // gallons
        double jarCapacity =  0.75; // gallons
        int completelyFilledJars = (int) (milk / jarCapacity); //MUST USE TYPE CAST TO RETURN INTEGER
        
        // double / double will return double
        
        System.out.println(completelyFilledJars);
    }
}
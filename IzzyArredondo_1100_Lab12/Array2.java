
public class Array2
{
    public static void main(String[] args)
    {
        double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        double sum = 0;
        double sum2 = 0;

        //ENHANCED:
        for(double i : x)
        {
            sum += i;
        }

        //STANDARD:
        for(int i = 0; i < x.length; i++)
        {
            sum2 += x[i];
        }

        System.out.println(sum);
        System.out.println(sum2);

        //MIN VAL
        double min = x[0];
        int index = 0;
        
        for(double i : x)
        {
            if(i < min)
            {
                min = i;
            }
            
        }
        
        System.out.println("Minimum Value is: " + min);
        
        //MIN VAL AND INDEX
        min = x[0];
        
        for(int i = 0; i < x.length; i++)
        {
            

            if( x[i] < min)
            {
                index = i;
                min = x[i];
                
            }
        }
        
        System.out.println("Minimum Value is: x[" + index + "] " + min);
     
    }

}
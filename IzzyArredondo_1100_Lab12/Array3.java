import java.util.*;

public class Array3
{
   

    public static void main(String[] args)
    {
        double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        System.out.println("Before rotation: ==============================");
        for (int i = 0; i < x.length; i++)
        {
            System.out.println("x[" + i + "]: " + x[i]);
        }
        x = rotate(x, 3);
        System.out.println("After rotation: ==============================");
        for (int i = 0; i < x.length; i++)
        {
            System.out.println("x[" + i + "]: " + x[i]);
        }
    }
    // Your method goes here.

     public static double[] rotate(double [] x, int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < x.length - 1; j++)
            {
                double temp = x[j];
                x[j] = x[j + 1];
                x[j + 1] = temp;
            }
        }

        return x;

    }
}
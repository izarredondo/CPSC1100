
public class Array
{
    public static void main(String[] args)
    {
        double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        
        System.out.println(x.length);
        System.out.println(x[0]);
        System.out.println(x[8]);
        System.out.println(x[x.length-1]);  
        //^^This prints out the value of the number of items minus one, which is 8, 
        //therefore printing 100.0
        
        System.out.println();
        
        for(int i = 0; i < x.length; i++)
        {
            System.out.println(x[i]);  //WITHOUT LABELS
        }
        
        System.out.println();
        for(int i = 0; i < x.length; i++)
        {
            System.out.println("x["+ i +"] : "+ x[i]); //WITH LABELS
        }
        
        System.out.println();
        for(int i = 8; i >= 0; i--)
        {
            System.out.println("x["+ i +"] : "+ x[i]);
        }
        
        System.out.println();
        for(double list : x)
        {
            System.out.println(list);
        }
    }
}

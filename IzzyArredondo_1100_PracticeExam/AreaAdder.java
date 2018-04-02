public class AreaAdder
{

    private int total = 0;

    public int getTotalArea()
    {
        return total;
    }

    public void addRectangle(int w, int l)
    {
        total += w*l;   //updates value of total
    }
    // HOW TO OVERCOMPLICATE SIMPLE THINGS:
    //         public int[] rectangles;
    //         public int numrectangles;
    //         
    //         public AreaAdder()
    //         {
    //             rectangles = new int[3];
    //             numrectangles = 0;
    //         }
    // 
    //         public void addRectangle(int length, int width)
    //         {
    //             rectangles[numrectangles] = length * width;
    //             numrectangles++;
    //             
    //         }
    // 
    //         public int getTotalArea()
    //         {
    //             int total = 0; 
    //             for(int i = 0; i < numrectangles; i++)
    //             {
    //                 total += rectangles[i];
    //             }
    // 
    //             return total;
    //         }
    public static void main(String[] args)
    {
        AreaAdder as = new AreaAdder();
        as.addRectangle(10, 30);
        // 10 x 30 rectangular area
        as.addRectangle(5, 13);
        // 5 x 13
        as.addRectangle(45, 20);
        // 45 x 20
        // this outputs "the total area is 1265"
        System.out.println("the total area is " + as.getTotalArea());
    }
}
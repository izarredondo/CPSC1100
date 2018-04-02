/*
 * 2.1 Build and run
 * 
 * import java.awt.geom.Point2D;
import java.util.Scanner;
public class Slope
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.print("Input x coordinate of the first point: ");
double xcoord = in.nextDouble();
System.out.print("Input y coordinate of the first point: ");
double ycoord = in.nextDouble();
Point2D.Double p1 = new Point2D.Double(xcoord, ycoord);
System.out.print("Input x coordinate of the second point: ");
xcoord = in.nextDouble();
System.out.print("Input y coordinate of the second point: ");
ycoord = in.nextDouble();
Point2D.Double p2 = new Point2D.Double(xcoord, ycoord);
double slope = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
System.out.println("The slope of the line is " + slope);
}
}
 */

/**2.1:
 * 
 * When the two points have the same x-coordinate, the slope result is positive or negative infinity.
 * This is because your slope equation becomes (y2 - y1 / 0), producing an exception handling.
 * Slopes do not exist for vertical lines. 
 * 
 */

/*
 * 2.2: Correct and rebuild
 */

import java.awt.geom.Point2D;
import java.util.Scanner;
public class Slope
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input x coordinate of the first point: ");
        double xcoord = in.nextDouble();
        System.out.print("Input y coordinate of the first point: ");
        double ycoord = in.nextDouble();
        Point2D.Double p1 = new Point2D.Double(xcoord, ycoord);
        System.out.print("Input x coordinate of the second point: ");
        xcoord = in.nextDouble();
        System.out.print("Input y coordinate of the second point: ");
        ycoord = in.nextDouble();
        Point2D.Double p2 = new Point2D.Double(xcoord, ycoord);
        double slope = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());

        if(p2.getX() == p1.getX())
        {
            System.out.println("Vertical line; slope does not exist");
        }
        else 
        {
            System.out.println("The slope of the line is " + slope);
        }

    }
}

/**2.3 What are the results of the slope program when p1 = (4,2) and p2 = (4,2)?
 * 
 * The program gives an error message that tells the user a slope does not exist.
 * Same x-coordinates produce a denominator of 0, which is undefined. 
 * 
 */

/**2.4 What are the results when p1 = (4,2.5) and p2 = (3,1.5)?
 * 
 * The result is equivalent to 1.0; the program only registers two negatives cancelling out 
 * and does not see the slope actually moving down and to the left. 
 * 
 */



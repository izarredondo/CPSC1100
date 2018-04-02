
/**
 * Write a description of class RectanglePrinter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Rectangle;
public class RectanglePrinter
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle(0, 0, 100, 50);
      Rectangle r2 = new Rectangle(0, 0, 100, 50);
      
      r2.grow(10,20);
      
      System.out.println(r1);
      System.out.println(r2);
   }
}
//Output: java.awt.Rectangle[x=0,y=0,width=100,height=50]
//        java.awt.Rectangle[x=-10,y=-20,width=120,height=90]
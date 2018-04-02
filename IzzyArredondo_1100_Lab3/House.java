import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;
import  java.awt.Polygon;



public class House {
    public static void main(String[] args) {

        // contruction of new JFrame object
        JFrame frame = new JFrame();

        // set the window size and title
        frame.setSize(300,400);
        frame.setTitle("My beautiful picture");

        // program ends when window closes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new DrawingArea());
        
        // voila!
        frame.setVisible(true);
    }


    // define the thing that draws
    public static class DrawingArea extends JComponent
    {
        public void paintComponent(Graphics g)
        {
            Graphics2D g2 = (Graphics2D) g;
            
            
            Rectangle box = new Rectangle (100, 100, 100, 100);
            g2.setColor(new Color(154, 51, 166));
            g2.fill(box);
            
            Rectangle window = new Rectangle (105, 140, 20, 20);
            g2.setColor (Color.YELLOW);
            g2.fill(window);
            
            window.translate(70, 0);
            g2.fill(window);
            
            window.translate(0, -30);
            g2.fill(window);
            
            window.translate(-70, 0);
            g2.fill(window);
            
            Rectangle door = new Rectangle (140, 160, 20, 40);
            g2.fill(door);
            
           
            
            Polygon poly = new Polygon();
            poly.addPoint(210,100);
            poly.addPoint(90,100);
            poly.addPoint(150,30);
            g2.setColor(new Color(146, 206, 34));
            g2.fill(poly);
            
            g2.setColor(new Color(51, 165, 189));
            g2.drawString("home sweet home", 95, 225);

           

        }

        
        
    }
}
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;
import  java.awt.Polygon;



public class Car {
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
            
            g2.drawString("Izzy Arredondo was here.", 20, 20);
            
            Rectangle box = new Rectangle (50, 50, 200, 100);
            g2.setColor(Color.BLUE);
            g2.fill(box);
            
            Ellipse2D.Double ellipse = new Ellipse2D.Double(50, 150, 50, 50);
            g2.setColor(Color.GREEN);
            g2.fill(ellipse);
            
            Ellipse2D.Double ellipse2 = new Ellipse2D.Double(200, 150, 50, 50);
            g2.setColor(Color.GREEN);
            g2.fill(ellipse2);
            
           
            
            
        }
    }
}
            // CREATE OBJECTS AND DRAW THEM, HERE
            

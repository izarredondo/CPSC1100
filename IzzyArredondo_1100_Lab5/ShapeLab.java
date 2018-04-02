import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;
import  java.awt.Polygon;



public class ShapeLab {
    public static void main(String[] args) {

        // contruction of new JFrame object
        JFrame frame = new JFrame();

        // set the window size and title
        frame.setSize(500,600);
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

            House h = new House(20, 20);
            House n = new House(200, 250);
            House m = new House(100, 150);
            
            Tanis t = new Tanis(20, 300);
            
            h.setColor(Color.BLUE, Color.GREEN, Color.RED);
            h.draw(g2);
            
            n.draw(g2);
            
            m.draw(g2);
            
            
            t.draw(g2);

            

        }

        
        
    }
}

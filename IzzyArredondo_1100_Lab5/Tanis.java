
/**
 * Write a description of class Tanis here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;
import  java.awt.Polygon;

public class Tanis
{
    private Rectangle head;
    private Rectangle eye;
    private Rectangle eye2;
    private Polygon beard;
    private Rectangle hair;
    private Rectangle sideburn;
    private Rectangle sideburn2;

    public Tanis(int x, int y)
    {
        head = new Rectangle(x,y, 100, 100);
        eye = new Rectangle(x+20, y+40, 10, 10);
        eye2 = new Rectangle(x+70, y+40, 10, 10);
        beard = new Polygon();
        beard.addPoint(x,y+80);
        beard.addPoint(x+100,y+80);
        beard.addPoint((x+50), y+200);
        hair = new Rectangle(x, y-20, 100, 20);
        sideburn = new Rectangle(x, y+40, 10, 60);
        sideburn2 = new Rectangle(x+90, y+40, 10, 60);
        
    }

    public void draw(Graphics2D g)
    {
        g.setColor(new Color(233, 167,122));
        g.fill(head);
       
        g.setColor(new Color(128, 128, 128));
        g.fill(beard);
        g.fill(sideburn);
        g.fill(sideburn2);
        g.setColor(new Color(28, 102, 176));
        g.fill(eye);
        g.setColor(new Color(28, 102, 176));
        g.fill(eye2);
        g.setColor(Color.BLACK);
        g.fill(hair);
        
    }
}
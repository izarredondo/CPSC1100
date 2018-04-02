
/**
 * Write a description of class House here.
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

public class House
{
    private Rectangle body;
    private Rectangle door;
    private Polygon roof;
    private Color body_color;
    private Color door_color;
    private Color roof_color;

    public House(int x, int y)
    {
        body = new Rectangle(x,y, 100, 100);
        door = new Rectangle(x+30, y+60, 30, 40);
        roof = new Polygon();
        roof.addPoint(x,y);
        roof.addPoint(x+100,y);
        roof.addPoint((x+50), y-30);
        body_color = Color.RED;
        door_color = Color.BLACK;
        roof_color = Color.BLACK;
    }

    public void draw(Graphics2D g)
    {
        g.setColor(body_color);
        g.fill(body);
        g.setColor(door_color);
        g.fill(door);
        g.setColor(roof_color);
        g.fill(roof);
    }
    
    public void setColor(Color b, Color d, Color r)
    {
        body_color = b;
        door_color = d;
        roof_color = r;
    }
}

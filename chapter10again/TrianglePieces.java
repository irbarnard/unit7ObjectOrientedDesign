import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

public class TrianglePieces
{
    
    
    public void draw(Graphics2D g2, Point2D.Double point1)
    {
        Point2D.Double point = new Point2D.Double();
        g2.setColor(Color.BLACK);
        Line2D.Double lineA = new Line2D.Double(point, point);
        g2.draw(lineA);

    }

}

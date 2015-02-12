import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

public class TrianglePieces
{
    Point2D.Double point1 = new Point2D.Double();
    Point2D.Double point2 = new Point2D.Double();
    Point2D.Double point3 = new Point2D.Double();
    public TrianglePieces( Point2D.Double point1, Point2D.Double point2, Point2D.Double point3)
    {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    
    public void draw(Graphics2D g2, Point2D.Double point1, Point2D.Double point2, Point2D.Double point3 )
    {
        g2.setColor(Color.BLACK);

        Line2D.Double lineA = new Line2D.Double(point1, point2);
        Line2D.Double lineB = new Line2D.Double(point2, point3);
        Line2D.Double lineC = new Line2D.Double(point3, point1);

        g2.draw(lineA);
        g2.draw(lineB);
        g2.draw(lineC);
        
    }

}

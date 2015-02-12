import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
//listener
public class TriangleComponent extends JComponent
{
    Point2D.Double point1 = new Point2D.Double();
    Point2D.Double point2 = new Point2D.Double();
    Point2D.Double point3 = new Point2D.Double();
    public void paintComponent(Graphics g)
    {
        
        Graphics2D g2 = (Graphics2D) g;
        
        TrianglePieces tp = new TrianglePieces();
        tp.draw(g2);
        MouseListener listener = new ClickListener();
        
    }
     public class ClickListener implements MouseListener
    {
    
        public void clicked(MouseEvent event)
        {
           int x = event.getX();
           int y = event.getY();
           
        }
        
    }
    public static void main(String[] args)
    {
        TriangleViewer viewer = new TriangleViewer();
    }
}
/* 
   paintcomp()
    {
        all logic and drawing
            tri mouse listen
                {   
                   mouseclick(mous event event)
                    {
                        //store values in component
                        REPAINT()
   
   
   
   
   
   
   
   
   
   */
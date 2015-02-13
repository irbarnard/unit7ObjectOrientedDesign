import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
//listener
public class TriangleComponent extends JComponent
{
    
    public void paintComponent(Graphics g)
    {
     
        Graphics2D g2 = (Graphics2D) g;
        
        
        g2.draw(tp);
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
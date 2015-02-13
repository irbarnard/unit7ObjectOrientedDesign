import javax.swing.JFrame;

public class TriangleViewer
{
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 100;
    
    JFrame frame;
    public TriangleViewer()
    {
        frame = new JFrame();

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("CLICK 3 TIMES FOR A TRIANGLE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        TriangleComponent component = new TriangleComponent();
        frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
    }
}

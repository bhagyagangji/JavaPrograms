import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class MouseEventsDemo extends Applet implements MouseListener, MouseMotionListener{
    private String message="";
    int x, y;
    Font f;
    @Override
    public void init() {
        // applet window generates diff mouse events and handle them with methods 
        // defined here
        addMouseListener(this);
        addMouseMotionListener(this);
        f = new Font("Arial", Font.BOLD, 28);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        x=e.getX();
        y=e.getY();

        message = "Mouse Clicked at x = " + x + ", y = " + y;
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x=e.getX();
        y=e.getY();

        message = "Mouse Pressed at x = " + x + ", y = " + y;
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x=e.getX();
        y=e.getY();

        message = "Mouse Released at x = " + x + ", y = " + y;
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        message = "Mouse Entered";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        message = "Mouse Exited";
        repaint();
    }

    @Override
    public void paint(Graphics g){
        g.setFont(f);
        g.drawString(message, 200, 40);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x=e.getX();
        y=e.getY();

        message = "Mouse Dragged at x = " + x + ", y = " + y;
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x=e.getX();
        y=e.getY();

        message = "Mouse Moved at x = " + x + ", y = " + y;
        repaint();
    }
}
/*<applet code="MouseEventsDemo.class" width="400" height="400"></applet> */

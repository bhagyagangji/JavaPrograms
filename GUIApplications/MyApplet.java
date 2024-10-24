
import java.applet.Applet;
import java.awt.Graphics;

// Creating a GUI to say hello world in an applet

public class MyApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawString("HEllo World", 200, 20);
    } 
}

/*<applet code="MyApplet.class" width="500" height="500"></applet> */
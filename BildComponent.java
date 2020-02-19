import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;
/**
 * Fuer die graphischen Darstellungen. Vielen Dank an Jakob Kleine aus dem Informatik-LK fuer die Unterstuetzung.
 * 
 * @Jakob Kleine
 * @10.02.2020
 */
public class BildComponent extends JPanel{
    private Image image;    
    public BildComponent(Image img) {
    	image = img;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	g.drawImage(image, 0, 0, this);
    }
}
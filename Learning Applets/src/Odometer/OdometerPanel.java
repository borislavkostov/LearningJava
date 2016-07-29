package Odometer;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class OdometerPanel extends JPanel
{
	private static final long serialVersionUID=1L;
	long hitCount=239472938472L;
	public void paint(Graphics myGraphics)
	{
		myGraphics.setFont(new Font("Monospaced", Font.PLAIN, 24));
		myGraphics.drawString("You are visitor number "+Long.toString(hitCount++), 50, 50);
	}
}

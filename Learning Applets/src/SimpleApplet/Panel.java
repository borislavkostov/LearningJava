package SimpleApplet;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel
{
	private static final long serialVersionUID=1L;
	public void paint(Graphics myGraphics)
	{
		myGraphics.drawRect(50,60,220,75);
		myGraphics.setFont(new Font("Dialog",Font.BOLD,24));
		myGraphics.drawString("Hello world !", 55, 100);
	}
	
}

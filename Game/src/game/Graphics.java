package game;

import javax.swing.*;

public class Graphics
{
	protected ImageIcon loadImage(String img)
	{
		ImageIcon theImage = new ImageIcon(img + ".png");
		return theImage;
	}
}

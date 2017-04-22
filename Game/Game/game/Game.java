package game;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame
{
	private static final long serialVersionUID = 1L;
	JPanel window = new JPanel();
	JLabel playerLabel = new JLabel();
	ImageIcon playerIcon = new ImageIcon("Pickleo.png");
	
	public static void main(String[] args)
	{
		new Game();
		System.out.println("IT'S WORKING!!!");
	}
	public Game()
	{
		setBackground(Color.BLACK);
		setTitle("Test Window");
		add(window);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setUndecorated(true);
		setVisible(true);
		//window.setLayout(null);
		//window.setSize(this.getSize());
		//setLocationRelativeTo(null);
		window.add(playerLabel);
		playerLabel.setIcon(playerIcon);
		//playerLabel.setSize(playerIcon.getIconWidth(), playerIcon.getIconHeight());
		playerLabel.setLocation(window.getWidth() / 2 - playerLabel.getWidth() / 2, window.getHeight() / 2 - playerLabel.getHeight() / 2);
		playerLabel.setVisible(true);
	}
}
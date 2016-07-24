package Player;

import javax.swing.JFrame;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JLabel;
import java.awt.GridLayout;
@SuppressWarnings("serial")
public class TeamFrame extends JFrame
{
	public TeamFrame() throws IOException
	{
		Player player;
		Scanner input=new Scanner(new File("Hankees.txt"));
		for(int i=1;i<=9;i++)
		{
			player=new PlayerPlus(input.nextLine(),input.nextDouble());
			input.nextLine();
			addPlayerInfo(player);			
		}
		add(new JLabel());
		add(new JLabel("--------"));
		add(new JLabel("Team Batting Average:"));
		add(new JLabel(PlayerPlus.findTeamAverageString()));
		setTitle("The Hankees");
		setLayout(new GridLayout(11,2,20,3));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	public void addPlayerInfo(Player player)
	{
		add(new JLabel(" "+player.getName()));
		add(new JLabel(player.getAverageString()));
	}
}

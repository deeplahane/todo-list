package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleBar extends JPanel{
	
	//constructor
	TitleBar(){
		this.setPreferredSize(new Dimension(400,60));
		this.setBackground(Color.decode("#ab7ee8"));
		JLabel titleText = new JLabel("All Tasks");
		titleText.setForeground(Color.decode("#feffff"));
		titleText.setFont(new Font("Monospace",Font.BOLD,20));
		titleText.setPreferredSize(new Dimension(200,50));
		titleText.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(titleText);
	}
}

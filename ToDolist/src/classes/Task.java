package classes;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Task extends JPanel{
	
	private JLabel index;
	private JTextField taskName;
	private JButton done;
	private JLabel space;
	
	private boolean check;
	
	//constructor
	Task(){
		this.setPreferredSize(new Dimension(400,20));
		this.setLayout(new BorderLayout());
		check=false;
		
		index = new JLabel("");
		index.setPreferredSize(new Dimension(40,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		index.setForeground(Color.decode("#686868"));
		index.setFont(new Font("Monospace",Font.BOLD,17));
		this.add(index,BorderLayout.WEST);
		
		taskName = new JTextField("your task here");
		taskName.setPreferredSize(new Dimension(320,20));
		taskName.setBorder(BorderFactory.createEmptyBorder());
//		taskName.setHorizontalAlignment(JLabel.CENTER);
		taskName.setBackground(Color.decode("#eeeeee"));
		taskName.setForeground(Color.decode("#686868"));
		taskName.setFont(new Font("Monospace",Font.BOLD,17));
		this.add(taskName,BorderLayout.CENTER);
		
		done = new JButton("Done");
		done.setPreferredSize(new Dimension(40,50));
		done.setBorder(BorderFactory.createEmptyBorder());
		done.setBackground(Color.decode("#ab7ee8"));
		done.setForeground(Color.decode("#feffff"));
		done.setFont(new Font("Monospace",Font.BOLD,15));
		this.add(done,BorderLayout.EAST);
		
	}
	
	public void changeIndex(int num) {
		this.index.setText(num+").");
		this.revalidate();
	}
	
	public JButton getDone() {
		return done;
	}
	
	public boolean getState(){
		return check;
	}
	
	public void changeState() {
		taskName.setForeground(Color.decode("#3ded99"));
		index.setForeground(Color.decode("#3ded99"));
		check=true; 
	}
}

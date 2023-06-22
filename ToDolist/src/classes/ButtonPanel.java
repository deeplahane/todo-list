package classes;

import javax.swing.*;
import java.awt.*;

import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


public class ButtonPanel extends JPanel{
	
	private JButton addTask;
	private JButton clear; 
	Border emptyBorder=BorderFactory.createEmptyBorder();
	
	//constructor
	ButtonPanel(){
		this.setPreferredSize(new Dimension(400,60));
//		this.setBackground(Color.red);
		
		addTask = new JButton("Add Task");	
		addTask.setBackground(Color.decode("#ab7ee8"));
		addTask.setForeground(Color.decode("#feffff"));
		addTask.setBorder(emptyBorder);
		addTask.setFont(new Font("Monospace",Font.BOLD,15));
		addTask.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.add(addTask);
		
		this.add(Box.createHorizontalStrut(20));
		clear = new JButton("Clear Completed Task");
		clear.setBackground(Color.decode("#ab7ee8"));
		clear.setForeground(Color.decode("#feffff"));
		clear.setBorder(emptyBorder);
		clear.setFont(new Font("Monospace",Font.BOLD,15));
		clear.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.add(clear);
		
	}
	
	public JButton getAddTask() {
		return addTask;
	}
	
	public JButton getClear() {
		return clear;
	}

}

package chapter9;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderWin extends JFrame {
	private static final long serialVersionUID=1l;
	private JButton bt1,bt2,bt3,bt4,bt5;
	
	public BorderWin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1080,1080);
		setTitle(title);
		
		setLayout(new BorderLayout(30,20));
		bt1=new JButton("North");
		bt2=new JButton("South");
		bt3=new JButton("West");
		bt4=new JButton("East");
		bt5=new JButton("Center");
		
		add(bt1,"North");
		add(bt2,"South");
		add(bt3,"West");
		add(bt4,"East");
		add(bt5,"Center");
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BorderWin win=new BorderWin("BorderLayout À©µµ¿ì");
	}

}

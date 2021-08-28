 package chapter9;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxWin extends JFrame {
	private static final long serialVersionUID = 1l;
	private JButton bt1, bt2, bt3, bt4, bt5;

	public BoxWin(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setTitle(title);
		
		Container cp=getContentPane();
		
		cp.setLayout(new BoxLayout(getContentPane(),BoxLayout.X_AXIS));
		bt1 = new JButton("North");
		bt2 = new JButton("South");
		bt3 = new JButton("West");
		bt4 = new JButton("East");
		bt5 = new JButton("Center");

		add(bt1);
		add(bt2);
		add(bt3);
		add(bt4);
		add(bt5);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxWin win=new BoxWin("BoxLayout window");
	}

}

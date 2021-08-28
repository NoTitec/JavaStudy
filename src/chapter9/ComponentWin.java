package chapter9;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ComponentWin extends JFrame {
	private static final long serialVersionUID=1l;
	
	public ComponentWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,150);
		setTitle("첫 버튼");
		Container pane= getContentPane();
		pane.setBackground(Color.black);
		setVisible(true);
	}
	
	public void addButton() {
		JButton btn=new JButton("첫 버튼");
		add(btn);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComponentWin f=new ComponentWin();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		f.addButton();
	}

}

package chapter9;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class FirstMyFrame extends JFrame {
	private static final long serialVersionUID=1L;
	
	public FirstMyFrame(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,150);
		setTitle(title);
		setVisible(true);
	}
	
	public void decorate() {
		Container pane=getContentPane();
		pane.setBackground(Color.BLUE);
	}
}

class FrameTest{
	public static void main(String[] args) {
		FirstMyFrame f=new FirstMyFrame("첫 윈도 프로그램");
		
		try {
			Thread.sleep(2000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		f.decorate();
	}
}

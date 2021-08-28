package chapter9;

import javax.swing.JFrame;

public class HelloJFrame extends JFrame {
	HelloJFrame(String title){
		setSize(300,200);
		setTitle(title);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloJFrame f= new HelloJFrame("hello jframe!");
	}

}

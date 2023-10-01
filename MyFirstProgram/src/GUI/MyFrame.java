package GUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	MyFrame() {
	JFrame frame = new JFrame();//creates a frame
	frame.setTitle("JFRAME title"); //set a title of frame
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
	frame.setResizable(false);//prevent frame from beiing resized
	frame.setSize(420, 420);//sets the parametre
	frame.setVisible(true);//zviditelni sa 
	
	ImageIcon image = new ImageIcon("cesta k logu");//nech je png  
	frame.setIconImage(image.getImage());//change icon of frame 
//	frame.getContentPane().setBackground(Color.BLUE);
	frame.getContentPane().setBackground(new Color (123,50,250));//rgb color
}
}

package BorderLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	
	public static void main (String[] args) {
	
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,500);
	frame.setLayout(new BorderLayout(10,0));//cisla vo vnutri su hrubka marginov
//	frame.setLayout(new BorderLayout());
	frame.setVisible(true);
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	
	panel1.setBackground(Color.red);
	panel2.setBackground(Color.green);
	panel3.setBackground(Color.yellow);
	panel4.setBackground(Color.blue);
	panel5.setBackground(Color.gray);
	
	panel1.setPreferredSize(new Dimension(100,50));
	panel2.setPreferredSize(new Dimension(50,100));
	panel3.setPreferredSize(new Dimension(100,100));
	panel4.setPreferredSize(new Dimension(100,100));
	panel5.setPreferredSize(new Dimension(100,100));
	
	frame.add(panel1,BorderLayout.NORTH);
	frame.add(panel2,BorderLayout.WEST);
	frame.add(panel3,BorderLayout.CENTER);
	frame.add(panel4,BorderLayout.EAST);
	frame.add(panel5,BorderLayout.SOUTH);
	

	
	
	}
		
}

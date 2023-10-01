package BorderLayout;

import java.awt.Color;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class JLayeredPMain {
	
	public static void main (String [] args) {
		
	JLabel label1 = new JLabel();
	label1.setOpaque(true);
	label1.setBackground(Color.RED);
	label1.setBounds(50,50,200,200);
	
	JLabel label2 = new JLabel();
	label2.setOpaque(true);
	label2.setBackground(Color.YELLOW);
	label2.setBounds(100,100,200,200);
	
	JLabel label3 = new JLabel();
	label3.setOpaque(true);
	label3.setBackground(Color.BLACK);
	label3.setBounds(150,150,200,200);
	
		
	JLayeredPane layeredPane = new JLayeredPane();
	layeredPane.setBounds(0,0,500,500);
	
	layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);// zapis a zobrazovanie cez layer zobrazovac
	layeredPane.add(label2, Integer.valueOf(0));	// zapis a zobrazovanie layerov cez cisla ktore je v zatvorke
	layeredPane.add(label3, JLayeredPane.DRAG_LAYER);	
		
		
	JFrame frame = new JFrame ("JLayeredPane");
	frame.add(layeredPane);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,500);
	frame.setLayout(null);
	frame.setVisible(true);
	
	}

}

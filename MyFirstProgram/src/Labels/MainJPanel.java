package Labels;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainJPanel {

	public static void main(String[] args) {
		
		//jpanel = gui component ktory ma funkcie ako container a drzi componenty
		
//		ImageIcon icon = new ImageIcon("...");
		
		JLabel label = new JLabel();
		label.setText("Hi");
//		label.setIcon(icon);
//		label.setVerticalAlignment(JLabel.BOTTOM); miesto na layoute obry
//		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0, 0, 75, 75); //nastavenie miesta na layoute obry
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.RED);
		redPanel.setBounds(250, 0, 250, 250);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setBounds(0, 0, 250, 250);
		
		JPanel	greenPanel = new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout());
		
		
		JFrame frame = new JFrame();//creates a frame
		frame.setTitle("JFRAME title"); //set a title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
		frame.setLayout(null);
		frame.setSize(750, 750);//sets the parametre
		frame.setVisible(true);//zviditelni sa 
		
//		redPanel.add(label); //tu sa zobrazuje obrazok na redpanel
		
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
	}
}

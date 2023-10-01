package Labels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Buttons extends JFrame implements ActionListener {
	
	JButton button;
	JLabel label;
	
	Buttons() {
		
		ImageIcon icon = new ImageIcon("cesta k obrazku");
		ImageIcon icon2 = new ImageIcon("cesta k obrazku");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 200, 150, 150);
		label.setVisible(true);
		
		button = new JButton();
		button.setBounds(100, 100, 250, 100);
		button.addActionListener(this);
		button.setText("I am a button");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalAlignment(JButton.CENTER);
		button.setVerticalAlignment(JButton.BOTTOM);
		button.setFont(new Font ("Comic Sans", Font.BOLD,25));
		button.setIconTextGap(-15);
		button.setForeground(Color.BLACK);
		button.setBackground(Color.lightGray);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
		this.setLayout(null);
		this.setSize(500, 500);//sets the parametre
		this.setVisible(true);//
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			System.out.println("poo");
//			button.setEnabled(false);
			label.setVisible(true);
		}
		
	}

}

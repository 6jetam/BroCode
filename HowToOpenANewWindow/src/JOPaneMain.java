import javax.swing.JOptionPane;

public class JOPaneMain {

	public static void main(String[] args) {
	
//		JOptionPane.showMessageDialog(null, "Info bla bla", "title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Info bla bla", "title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Info bla bla", "title", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Info bla bla", "title", JOptionPane.WARNING_MESSAGE);
//		while(true) {
//		JOptionPane.showMessageDialog(null, "Info bla bla", "title", JOptionPane.ERROR_MESSAGE);
//		}//virus haha
		
//		int answer = JOptionPane.showConfirmDialog(null, "do you code?", "titlee", JOptionPane.YES_NO_CANCEL_OPTION);
//		String name = JOptionPane.showInputDialog("what is your name");
//		System.out.println("Hello " + name);
		String [] response = {"No, ty si super", "thank you", "fffffii"}; // odpovede v okne 
//		ImageIcon icon = new ImageIcon("cesta k suboru");
		JOptionPane.showOptionDialog(null, "you are awesome", "secret", JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, null, response, 0);//null tretie od konca je icon
		
		
	}

}

package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String yesorno = JOptionPane.showInputDialog("Is today your birthday? Yes or no?"); 
		if (yesorno.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null,"Congradulations!"); 
		}
			
		if (yesorno.equalsIgnoreCase( "no")) {
				JOptionPane.showMessageDialog(null,"Oh, that's too bad, well continue what you were doing."); 
		}
		
	}

	

}
	


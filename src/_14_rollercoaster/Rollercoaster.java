package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String input= JOptionPane.showInputDialog("What is your heights in inches");
	int inputasint=Integer.parseInt(input);
	if(inputasint>=48){ 
		JOptionPane.showMessageDialog(null,"You can go on the coaster alone" );

	}
	if(inputasint >= 42 && inputasint < 48) {
		JOptionPane.showMessageDialog(null," You need to ride with someone else. " );
		
	}
	if(inputasint<42) {
		JOptionPane.showMessageDialog(null,"You need to grow more");
	}
		
}
}
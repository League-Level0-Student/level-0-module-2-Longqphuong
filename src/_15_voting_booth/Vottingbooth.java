package _15_voting_booth;

import javax.swing.JOptionPane;

public class Vottingbooth {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("How old are you in years?");
		int inputasint = Integer.parseInt(input);
		if (inputasint >= 18) {
			JOptionPane.showMessageDialog(null, "What is the next presidnts should be?");
		}

		if (inputasint < 18) {
			JOptionPane.showMessageDialog(null, "Nobody care what you think");
		}

	}

}

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();

		int randomNumber = randomMaker.nextInt(5);

		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		for (int i = 0; i < 10; i++) {
			
		
		if (randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "Sunny day.");
}
		if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "windy day.");
}
	if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "Raining day.");
}
		if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "Snowy dAY.");
}
		if (randomNumber == 4) {
			JOptionPane.showMessageDialog(null, "Cloudy day");
		}
		}
		// 3. Find someone to test out your program. They will like it :)
		
	}
}

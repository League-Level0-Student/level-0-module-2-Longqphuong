package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumber {
	public static void main(String[] args) {
		//String number = "Seven";
		Random generator = new Random();
		
		int onenum = generator.nextInt(50);
		int twonum= generator.nextInt(50);
		int threenum=generator.nextInt(50);
		int fournum=generator.nextInt(50);
		int fivenum=generator.nextInt(50);
		int sixnum= generator.nextInt(50);
		System.out.println(onenum);
		System.out.println(twonum);
		System.out.println(threenum);
		System.out.println(fournum);
		System.out.println(fivenum);
		System.out.println(sixnum);
		
		JOptionPane.showMessageDialog(null, onenum + ", " + twonum+", "+threenum+", "+fournum+", "+fivenum+", "+sixnum);
		
	}
}

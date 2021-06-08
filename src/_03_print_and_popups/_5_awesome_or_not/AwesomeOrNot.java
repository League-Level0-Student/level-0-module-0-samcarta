package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
	public static void main(String[] args) {
	
		Random ran = new Random();     
		int num = ran.nextInt(4);
	System.out.println(num);
	String input = JOptionPane.showInputDialog("What is do you think is awesome?");

	if(num == 0) {
	JOptionPane.showMessageDialog(null, "Awesome!");
	}
	if(num == 1) {
	JOptionPane.showMessageDialog(null, "ok.");
	}
	if(num == 2) {
		JOptionPane.showMessageDialog(null, "boring.");
		}
	
	if(num == 3) {
		JOptionPane.showMessageDialog(null, "That is the best!!");
		}
	//so it works now!!!! :)
	}
}

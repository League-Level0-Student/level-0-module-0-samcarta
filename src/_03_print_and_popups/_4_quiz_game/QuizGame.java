package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		int score = 0;
		JOptionPane.showMessageDialog(null, "In order to win, have a final score of 3!");

		String input = JOptionPane.showInputDialog("What is 7 + 1?");
		if (input.equalsIgnoreCase("8")) {
			JOptionPane.showMessageDialog(null, "Good Job!");
			 score = score + 1;
		}else {
			JOptionPane.showMessageDialog(null, "Sign up for classes in First Grade");
			 score = score - 1;
			 
		}
		input = JOptionPane.showInputDialog("How long is an Olympic swimming pool? (In Meters)");
		if (input.equalsIgnoreCase("50")) {
			JOptionPane.showMessageDialog(null, "Good Job!");
			 score = score + 1;
		}else {
			JOptionPane.showMessageDialog(null, "It was 50, Sorry.");
			 score = score - 1;
			 
		}
		input = JOptionPane.showInputDialog("What is (x-1)(2)?");
		if (input.equalsIgnoreCase("2x-2")) {
			JOptionPane.showMessageDialog(null, "Good Job!");
			 score = score + 1;
		}else {
			JOptionPane.showMessageDialog(null, "Sign up for classes in Sixth Grade");
			 score = score - 1;
			 
		}
		input = JOptionPane.showInputDialog("What is cynophobia?");
		if (input.equalsIgnoreCase("The Fear of Dogs")) {
			JOptionPane.showMessageDialog(null, "Good Job!");
			 score = score + 1;
		}else {
			JOptionPane.showMessageDialog(null, "It is the fear of dogs. ");
			 score = score - 1;
		}
		input = JOptionPane.showInputDialog("How many languages are written from left to right?");
		if (input.equalsIgnoreCase("12")) {
			JOptionPane.showMessageDialog(null, "Good Job!");
			 score = score + 1;
		}else {
			JOptionPane.showMessageDialog(null, "THe correct answer was 12 languages");
			 score = score - 1;
		}

				
				
		JOptionPane.showMessageDialog(null, "Your final Score was...");
		JOptionPane.showMessageDialog(null, score);
		if (score == 3) {
			JOptionPane.showMessageDialog(null, "You Won!!!");
		}
		if (score <= 3) {
			JOptionPane.showMessageDialog(null, "You Lost :(");
		}
	}
}

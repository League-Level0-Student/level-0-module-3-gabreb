package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class areYouHappyProject {
public static void main(String[] args) {
	String happy = JOptionPane.showInputDialog("Are you happy? Yes or no?");
	if (happy.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you're doing!");
	}
	else if (happy.equalsIgnoreCase("no")) {
		String happy2 = JOptionPane.showInputDialog("Do you want to be happy?");
				if (happy2.equalsIgnoreCase("yes")) {
					JOptionPane.showMessageDialog(null, "Change something!");
				}
				if (happy2.equalsIgnoreCase("no")) {
					JOptionPane.showMessageDialog(null, "Keep doing what you are doing forever!");
				}
	}
}
}

package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class storyProject {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"There once was a very mean teacher called Tyler who wouldn't let his \n student write a rated r story. So his student vowed for revenge. And so the story begins!");
		String choice = JOptionPane.showInputDialog(
				"Should this student blackmail his teacher with his love for dinosaurs \n or should this student grab a knife");
		if (choice.equalsIgnoreCase("grab a knife")) {
			JOptionPane.showMessageDialog(null,
					"And so the student silently crept into the kitchen and grabbed \n the biggest knife he could find in his toga \n and slowly slipt out the door.");
		} else {
			JOptionPane.showMessageDialog(null,
					"And so the student vigilantly and meticolously crept up into \n Tyler's shack and caught him playing with his female dinosaurs.");
			String choice2 = JOptionPane.showInputDialog(
					"Should the student take pictures of the man playing with \n the female dinosaurs or should he climb in and play with him?");
			if (choice2.equalsIgnoreCase("play with him")) {
				JOptionPane.showMessageDialog(null,
						"And so the student announces his happiness to play with the dinosaurs and joins Tyler who also expresses his happiness.");
			} else {
				JOptionPane.showMessageDialog(null,
						"And so the student grabs his flip phone and clicks the switch. \n Tyler hears this and waves happily with his female dinosaurs!");
			}
		}

	}
}

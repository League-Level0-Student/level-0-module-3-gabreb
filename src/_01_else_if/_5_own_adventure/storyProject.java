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
					"And so the student silently crept into the kitchen and grabbed \n the biggest knife he could find in his toga \n and slowly sliped out the door.");
			JOptionPane.showMessageDialog(null,
					"But on the way to Tyler's appartment the student gets a stroke and dies.");
			JOptionPane.showMessageDialog(null, "Soooo sad");
		} else {
			JOptionPane.showMessageDialog(null,
					"And so the student vigilantly and meticolously crept up into \n Tyler's shack and catches him playing with his female dinosaurs.");
			String choice2 = JOptionPane.showInputDialog(
					"Should the student take pictures of the man playing with \n the female dinosaurs or should he climb in and play with him?");
			if (choice2.equalsIgnoreCase("play with him")) {
				JOptionPane.showMessageDialog(null,
						"And so the student announces his happiness to play with the dinosaurs and joins Tyler who also expresses his happiness.");
				JOptionPane.showMessageDialog(null,
						"And that is how the student and the teacher live happily \n ever after. Playing with their female dinosaurs.");
			} else {
				JOptionPane.showMessageDialog(null,
						"And so the student grabs his flip phone and clicks the switch. \n Tyler hears this and waves happily with his female dinosaurs!");
				JOptionPane.showMessageDialog(null,
						"The student then posts the photo online. It gets a million likes. \n Tyler is humiliated. It is time for him to get revenge.");
				String choiceTeacher = JOptionPane.showInputDialog("What should the teacher do? R rated stuff?");
				if (choiceTeacher.equalsIgnoreCase("r rated stuff")) {
					JOptionPane.showMessageDialog(null, "The teacher refuses.");
					JOptionPane.showMessageDialog(null,
							"The teacher however will go and tell his parent's. Ha haha hahaa.");
					JOptionPane.showMessageDialog(null,
							"And so the teacher approaches the student's parents and tells them about the humiliation.\n The parent's call the student to come. What will they do?");
					JOptionPane.showMessageDialog(null, "They laff and high five him because that video was awesome!");
					String choiceTeacher2 = JOptionPane.showInputDialog(
							"Should the teacher grab a knife and murder them all or strangle them all?");
					if (choiceTeacher2.equalsIgnoreCase("aaaasdasdauyyfis uyfs")) {
					} else {
						JOptionPane.showMessageDialog(null,
								"The teacher runs at the family to end them. He wants\n revenge. He wants death. And he wants to end their pity little lifes.");
						JOptionPane.showMessageDialog(null,
								"But then Tyler sees a dinosaur and his eyes get really big. \n He gayly walks over and starts playing with it. \n The family leads him to a mental home where he forever lives happily ever after.");
					}
				} else {
					choiceTeacher = JOptionPane
							.showInputDialog("No. You have to type in r rated stuff. Type in 'R rated stuff' ");
					if (choiceTeacher.equalsIgnoreCase("r rated stuff")) {
						JOptionPane.showMessageDialog(null, "The teacher refuses.");
						JOptionPane.showMessageDialog(null,
								"The teacher however will go and tell his parent's. Ha haha haha a.");
						JOptionPane.showMessageDialog(null,
								"And so the teacher approaches the student's parents and tells them about the humiliation.\n The parent's call the student to come. What will they do?");
						JOptionPane.showMessageDialog(null,
								"They laff and high five him because that video was awesome!");
						String choiceTeacher2 = JOptionPane.showInputDialog(
								"Should the teacher grab a knife and murder them all or strangle them all?");
						if (choiceTeacher2.equalsIgnoreCase("aaaasdasdauyyfis uyfs")) {
						} else {
							JOptionPane.showMessageDialog(null,
									"The teacher runs at the family to end them. He wants\n revenge. He wants death. And he wants to end their pity little lifes.");
							JOptionPane.showMessageDialog(null,
									"But then Tyler sees a dinosaur and his eyes get really big.\n He gayly walks over and starts playing with it.\n The family leads him to a mental home where he forever lives happily ever after.");
						}

					} else {
						JOptionPane.showMessageDialog(null,
								"You didn't listen. You don't get the privillge to continue.");
					}
				}
			}

		}
	}
}

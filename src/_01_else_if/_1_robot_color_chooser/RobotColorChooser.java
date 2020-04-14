
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot rob = new Robot();
		rob.setSpeed(100);
		rob.penDown();
		for (;true;) {
			// 2. Make the robot draw a shape (this will take more than one line of code)
			for (int i = 0; i < 4; i++) {
				rob.move(100);
				rob.turn(90);
			}
			// 3. Set the pen width to 10
			rob.setPenWidth(10);
			// 4. Ask the user what color pen they would like the robot to draw with
			String colorPen = JOptionPane.showInputDialog(
					"What color pen would you like the robot to draw with? Answer with one color of the rainbow. No spaces!");
			// 5. Use an if/else statement to set the pen color that the user requested
			if (colorPen.equalsIgnoreCase("yellow")) {
				rob.setPenColor(Color.yellow);
			} else if (colorPen.equalsIgnoreCase("red")) {
				rob.setPenColor(Color.red);
			} else if (colorPen.equalsIgnoreCase("orange")) {
				rob.setPenColor(Color.orange);
			} else if (colorPen.equalsIgnoreCase("green")) {
				rob.setPenColor(Color.green);
			} else if (colorPen.equalsIgnoreCase("blue")) {
				rob.setPenColor(Color.blue);
			} else if (colorPen.equalsIgnoreCase("purple")) {
				rob.setPenColor(Color.magenta);
			} else {
				rob.setRandomPenColor();
			}
			// 6. If the user doesn’t enter anything, choose a random color
			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them
		}
	}
}

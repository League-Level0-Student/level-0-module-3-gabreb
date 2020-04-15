
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String answer = JOptionPane.showInputDialog("Do you like bananas?");
		if (answer.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "You're crazy!");
			System.exit(0);
		}
		else if(answer.equalsIgnoreCase("yes")) {
			String answer2 = JOptionPane.showInputDialog("What is your favorite hobby"); 
			JOptionPane.showMessageDialog(null, answer2 + " is much better with bananas!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You are bananas!"); 
		}
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes?" or “no?"
		//	show a pop up that says “You are bananas!?"
	
	}

}

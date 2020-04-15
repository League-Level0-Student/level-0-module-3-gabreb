
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		//nah
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday = JOptionPane.showInputDialog("Do you want my mom's, dad's, or my birthday? Answer with mom, dad, or, Gaby.");
	System.out.println("You typed " + birthday + ".");
	if(birthday.equalsIgnoreCase("mom")) {
		System.out.println("Her birthday is " + momsBirthday);
	}
	else if (birthday.equalsIgnoreCase("dad")) {
		System.out.println("His birthday is " + dadsBirthday);
	}
	else if (birthday.equalsIgnoreCase("Gaby")) {
		System.out.println("My birhday is " + myBirthday);
	}
	else {
		System.out.println("Sorry, I don't remember that person's birthday!");
	}
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}

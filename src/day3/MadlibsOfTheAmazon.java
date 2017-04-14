package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
String adjective;
String liquid;
String bodyPart;
String verb;
String place;
String story;
		// Get the user to enter an adjective
adjective = JOptionPane.showInputDialog("Enter Adjective:");
		// Get the user to enter a type of liquid
liquid = JOptionPane.showInputDialog("Enter Type of Liquid:");
		// Get the user to enter a body part
bodyPart = JOptionPane.showInputDialog("Enter Body Part:");
		// Get the user to enter a verb
verb = JOptionPane.showInputDialog("Enter Verb:");
		// Get the user to enter a place
place = JOptionPane.showInputDialog("Enter Place:");
		// Fit the user's words into this sentence, and save it in a String:
		story = "Piranhas are more "+adjective+" during the day, so cross the river at "+
		"night. Piranhas are attracted to fresh "+liquid+" and will most "+
		"likely take a bite out of your "+bodyPart+" if you "+verb+". Whatever "+
		"you do, if you have an open wound, try to find another way to get "+
		"back to the "+place+". Good luck!";
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		JOptionPane.showMessageDialog(null, story);

	}
}


package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: Have the kids play with the Speak & Spell. The first Speak &
 * Spell was introduced at the summer Consumer Electronics Show in June 1978,
 * making it one of the earliest handheld electronic devices with a visual
 * display to use interchangeable game cartridges. Discuss with students how you
 * would make this program. Allow them to code it themselves, or use this
 * recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		String word;
		word = "tomorrow";
		speak("spell" + word);
		// 2. Catch the user's answer in a String
		String spelling;
		spelling = JOptionPane.showInputDialog("Enter spelling");
		// 3. If the user spelled the word correctly, speak "correct"
		{
			if (spelling.equalsIgnoreCase(word)) {
				speak("correct");
			}
			// 4. Otherwise say "wrong"
			else {
				speak("That is not how you spell" + word + "Try again.");
				spelling = JOptionPane.showInputDialog("Enter spelling");
				{
					if (spelling.equalsIgnoreCase(word)) {
						speak("correct");
					}
					// 4. Otherwise say "wrong"
					else {
						speak("That is still wrong. Last try.");
						spelling = JOptionPane.showInputDialog("Enter spelling");
					
			
					
					// 4. Otherwise say "wrong"
					if (spelling.equalsIgnoreCase(word)) {
						speak("correct");
					}
					else {
						speak("That is still wrong. Last try.");
					}
				}}
			}}
		{
		}
		// 5. repeat the process for other words

		word = "madlebrot";
		speak("spell" + word);
		// 2. Catch the user's answer in a String
		spelling = JOptionPane.showInputDialog("Enter spelling");
		// 3. If the user spelled the word correctly, speak "correct"
		{
			if (spelling.equalsIgnoreCase(word)) {
				speak("correct");
			}
			// 4. Otherwise say "wrong"
			else {
				speak("That is not how you spell" + word + "Try again");
				spelling = JOptionPane.showInputDialog("Enter spelling");
				{
					if (spelling.equalsIgnoreCase(word)) {
						speak("correct");
					}
					// 4. Otherwise say "wrong"
					else {
						speak("That is still wrong. Last try.");
					}
				}
				spelling = JOptionPane.showInputDialog("Enter spelling");
				{
					if (spelling.equalsIgnoreCase(word)) {
						speak("correct");
					}
					// 4. Otherwise say "wrong"
					else {
						speak("That is still wrong. Last try.");
					}
				}
			}
		}

		word = "potato";
		speak("spell" + word);
		// 2. Catch the user's answer in a String
		spelling = JOptionPane.showInputDialog("Enter spelling");
		// 3. If the user spelled the word correctly, speak "correct"
		{
			if (spelling.equalsIgnoreCase(word)) {
				speak("correct");
			}
			// 4. Otherwise say "wrong"
			else {
				speak("That is not how you spell" + word + "Try again.");
				spelling = JOptionPane.showInputDialog("Enter spelling");
				{
					if (spelling.equalsIgnoreCase(word)) {
						speak("correct");
					}
					// 4. Otherwise say "wrong"
					else {
						speak("That is still wrong. Last try.");
					}
				}
				spelling = JOptionPane.showInputDialog("Enter spelling");
				{
					if (spelling.equalsIgnoreCase(word)) {
						speak("correct");
					}
					// 4. Otherwise say "wrong"
					else {
						speak("That is still wrong. Last try.");
					}
				}
			}
		}

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

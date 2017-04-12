package day3;
import javax.swing.JOptionPane;
public class Greeter {
public static void main(String[] args) {
	String name;
	String feeling;
	name = JOptionPane.showInputDialog("Enter name");
	//System.out.println(name);
	JOptionPane.showMessageDialog(null, "Hello "+name+"! How are you today?");
	feeling=JOptionPane.showInputDialog("How are you?");
	if(feeling=="good"){JOptionPane.showMessageDialog(null, "I'm so glad!");}
}
}

package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class DrawShape {
public static void main(String[] args) {
	Robot tobor = new Robot("mini");
	for (int i = 0; i < 6; i++) {
		

	tobor.setRandomPenColor();
	tobor.setPenWidth(10);
	tobor.penDown();
	tobor.move(100);
	tobor.turn(72);
}}
	
}

